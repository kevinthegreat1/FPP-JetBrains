package com.kevinthegreat.fpp

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VfsUtil
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.elementType
import com.intellij.psi.util.parents
import com.intellij.psi.util.siblings
import com.kevinthegreat.fpp.psi.*

object FPPUtil {
    fun isDef(element: PsiElement): Boolean =
        element is FPPNamedElement || element.elementType in FPPNameGroup.DEF_TYPES

    fun getEnclosingDef(element: PsiElement): PsiElement? = element.parents(true)
        .find { it.siblings(false).any { it.elementType == FPPTypes.LEFT_BRACE } }
        ?.parents(false)
        ?.find(::isDef)

    fun isTopLevel(element: PsiElement): Boolean = getEnclosingDef(element) == null

    fun getUnqualifiedNameElement(def: PsiElement): PsiElement? {
        if (!isDef(def)) return null

        return PsiTreeUtil.getChildrenOfTypeAsList(def, PsiElement::class.java)
            .find { FPPTokenSets.IDENTIFIERS.contains(it.elementType) }
    }

    fun getUnqualifiedName(def: PsiElement): String? = getUnqualifiedNameElement(def)?.text

    fun getQualifiedName(def: PsiElement): String? {
        if (!isDef(def)) return null

        val name = getUnqualifiedName(def) ?: return null
        val enclosingDef = getEnclosingDef(def) ?: return name
        val enclosingQualName = getQualifiedName(enclosingDef) ?: return name

        return "$enclosingQualName.$name"
    }

    // 15.5. Resolution of Identifiers
    fun resolveIdentifier(id: String, location: PsiElement, defTypes: List<IElementType>): List<PsiElement> {
        if (isTopLevel(location)) {
            return findDefinitions(id, location.project, defTypes).distinct()
        }

        val enclosingDef = getEnclosingDef(location) ?: return emptyList()
        return resolveIdentifierInEnclosingDef(id, enclosingDef, defTypes)
    }

    fun resolveIdentifierInEnclosingDef(id: String, enclosingDef: PsiElement, defTypes: List<IElementType>): List<PsiElement> {
        val enclosingQualName = getQualifiedName(enclosingDef) ?: return emptyList()

        val resolved = if (isTopLevel(enclosingDef)) {
            findDefinitions("$enclosingQualName.$id", enclosingDef.project, defTypes) +
                    findDefinitions(id, enclosingDef.project, defTypes)
        } else {
            findDefinitions("$enclosingQualName.$id", enclosingDef.project, defTypes) +
                    resolveIdentifier(id, enclosingDef, defTypes)
        }

        return resolved.distinct()
    }

    // 15.6. Resolution of Qualified Identifiers
    fun resolveQualifiedIdentifier(qualId: String, location: PsiElement, defTypes: List<IElementType>): List<PsiElement> {
        val idSplit = qualId.split(".")
        if (idSplit.size == 1) {
            return resolveIdentifier(qualId, location, defTypes)
        }

        val enclosingQualId = idSplit.dropLast(1).joinToString(".")
        val enclosingQualIdDef = resolveQualifiedIdentifier(enclosingQualId, location, emptyList())

        // Find identifier starting from parents' children because we are looking for the identifier inside the parents
        return enclosingQualIdDef.filter(::isDef)
            .flatMap { it.children.flatMap { findDefinitions(idSplit.last(), it, defTypes) } }
            .distinct()
    }

    fun resolveQualifiedIdentifierInEnclosingDef(qualId: String, enclosingDef: PsiElement, defTypes: List<IElementType>): List<PsiElement> {
        val idSplit = qualId.split(".")
        if (idSplit.size == 1) {
            return resolveIdentifierInEnclosingDef(qualId, enclosingDef, defTypes)
        }

        val enclosingQualId = idSplit.dropLast(1).joinToString(".")
        val enclosingQualIdDef = resolveQualifiedIdentifierInEnclosingDef(enclosingQualId, enclosingDef, emptyList())

        // Find identifier starting from parents' children because we are looking for the identifier inside the parents
        return enclosingQualIdDef.filter(::isDef)
            .flatMap { it.children.flatMap { findDefinitions(idSplit.last(), it, defTypes) } }
            .distinct()
    }

    private fun findDefinitions(qualId: String, project: Project, defTypes: List<IElementType>): List<PsiElement> {
        return FileTypeIndex.getFiles(FPPFileType, GlobalSearchScope.allScope(project))
            .mapNotNull(PsiManager.getInstance(project)::findFile)
            .flatMap { findDefinitions(qualId, it, defTypes) }
    }

    private fun findDefinitions(qualId: String, location: PsiElement, defTypes: List<IElementType>): List<PsiElement> =
        findDefinitions(qualId.split("."), location, defTypes)

    /**
     * @param idSplit The qualified identifier split by a dot. If the last element is empty, all accessible definitions of the correct types will be returned.
     * @param location The location to search from.
     * @param defTypes The definition types to search for, or empty to search for definitions of any type.
     */
    private fun findDefinitions(idSplit: List<String>, location: PsiElement, defTypes: List<IElementType>): List<PsiElement> {
        if (idSplit.isEmpty()) return emptyList()

        val isDef = isDef(location)
        val isCorrectDefType = isDef && (defTypes.isEmpty() || location.elementType in defTypes) // Empty defTypes means search for definitions of any type
        val currentTarget = idSplit.first()
        val remainingTarget = idSplit.drop(1)

        if (isDef && remainingTarget.isNotEmpty() || isCorrectDefType) {
            // Check if the identifier attached to the definition matches the current target
            if (currentTarget.isEmpty() || getUnqualifiedNameElement(location)?.textMatches(currentTarget) ?: false) {
                return if (remainingTarget.isEmpty()) listOf(location)
                else location.children.flatMap { findDefinitions(remainingTarget, it, defTypes) }
            }
        } else if (location is FPPIncludeSpecifier) {
            // 7.6. Include Specifiers
            val relativePath = location.stringLiteral.text.substring(1, location.stringLiteral.textLength - 1)
            val currentDir = location.containingFile.virtualFile.parent
            val targetVirtualFile = VfsUtil.findRelativeFile(currentDir, *relativePath.split("/").toTypedArray()) ?: return emptyList()
            val targetPsiFile = PsiManager.getInstance(location.project).findFile(targetVirtualFile) ?: return emptyList()
            return findDefinitions(idSplit, targetPsiFile, defTypes)
        } else if (location is FPPInterfaceImportSpecifier) {
            // 7.8. Interface Import Specifiers
            // Do not allow general qual id searches (empty defTypes) for performance reasons,
            // since this import only contains port instance specifiers and has no sub definitions.
            if (defTypes.any { it == FPPTypes.PORT_INSTANCE_SPECIFIER || it == FPPTypes.GENERAL_PORT_INSTANCE_SPECIFIER || it == FPPTypes.SPECIAL_PORT_INSTANCE_SPECIFIER }) {
                val importQualId = location.qualifiedIdentifierPortInterfaceDefinition.text
                return resolveQualifiedIdentifier(importQualId, location, listOf(FPPTypes.PORT_INTERFACE_DEFINITION))
                    .flatMap { it.children.flatMap { findDefinitions(idSplit, it, defTypes) } }
            }
        } else if (location is FPPTopologyImportSpecifier) {
            // 7.19. Topology Import Specifiers
            // Do not allow general qual id searches (empty defTypes) for performance reasons,
            // since this import only contains component instance specifiers and connection graph specifiers and has no sub definitions.
            if (defTypes.any { it == FPPTypes.COMPONENT_INSTANCE_SPECIFIER || it == FPPTypes.CONNECTION_GRAPH_SPECIFIER }) {
                val importQualId = location.qualifiedIdentifierTopologyDefinition.text
                return resolveQualifiedIdentifier(importQualId, location, listOf(FPPTypes.TOPOLOGY_DEFINITION))
                    .flatMap { it.children.flatMap { findDefinitions(idSplit, it, defTypes) } }
            }
        } else if (!isDef) {
            return location.children.flatMap { findDefinitions(idSplit, it, defTypes) }
        }

        return emptyList()
    }
}
