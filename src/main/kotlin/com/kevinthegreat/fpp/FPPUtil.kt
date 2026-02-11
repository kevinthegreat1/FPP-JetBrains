package com.kevinthegreat.fpp

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.elementType
import com.intellij.psi.util.parents
import com.intellij.psi.util.siblings
import com.kevinthegreat.fpp.psi.FPPNamedElement
import com.kevinthegreat.fpp.psi.FPPTokenSets
import com.kevinthegreat.fpp.psi.FPPTypes

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
            return findDefinitions(id, location.project, defTypes)
        }

        val enclosingDef = getEnclosingDef(location) ?: return emptyList()
        val enclosingQualName = getQualifiedName(enclosingDef) ?: return emptyList()
        if (isTopLevel(enclosingDef)) {
            return findDefinitions("$enclosingQualName.$id", enclosingDef.project, defTypes) +
                    findDefinitions(id, enclosingDef.project, defTypes)
        }

        return findDefinitions("$enclosingQualName.$id", enclosingDef.project, defTypes) +
                resolveIdentifier(id, enclosingDef, defTypes)
    }

    // 15.6. Resolution of Qualified Identifiers
    fun resolveQualifiedIdentifier(qualId: String, location: PsiElement, defTypes: List<IElementType>): List<PsiElement> {
        val idSplit = qualId.split(".")
        if (idSplit.size == 1) {
            return resolveIdentifier(qualId, location, defTypes)
        }

        val enclosingQualId = idSplit.dropLast(1).joinToString(".")
        val enclosingDef = resolveQualifiedIdentifier(enclosingQualId, location, emptyList())

        // Find identifier starting from parents' children because we are looking for the identifier inside the parents
        return enclosingDef.filter(::isDef)
            .flatMap { it.children.flatMap { findDefinitions(idSplit.last(), it, defTypes) } }
    }

    private fun findDefinitions(qualId: String, project: Project, defTypes: List<IElementType>): List<PsiElement> {
        return FileTypeIndex.getFiles(FPPFileType, GlobalSearchScope.allScope(project))
            .mapNotNull(PsiManager.getInstance(project)::findFile)
            .flatMap { findDefinitions(qualId, it, defTypes) }
    }

    private fun findDefinitions(qualId: String, location: PsiElement, defTypes: List<IElementType>): List<PsiElement> =
        findDefinitions(qualId.split("."), location, defTypes)

    private fun findDefinitions(idSplit: List<String>, location: PsiElement, defTypes: List<IElementType>): List<PsiElement> {
        if (idSplit.isEmpty()) return emptyList()

        val isDef = isDef(location)
        val isCorrectDefType = isDef && (defTypes.isEmpty() || location.elementType in defTypes)
        val currentTarget = idSplit.first()
        val remainingTarget = idSplit.drop(1)

        if (isDef && remainingTarget.isNotEmpty() || isCorrectDefType) {
            // Check if the identifier attached to the definition matches the current target
            if (getUnqualifiedNameElement(location)?.textMatches(currentTarget) ?: false) {
                return if (remainingTarget.isEmpty()) listOf(location)
                else location.children.flatMap { findDefinitions(remainingTarget, it, defTypes) }
            }
        } else if (!isDef) {
            return location.children.flatMap { findDefinitions(idSplit, it, defTypes) }
        }

        return emptyList()
    }
}
