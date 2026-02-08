package com.kevinthegreat.fpp

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.elementType
import com.intellij.psi.util.parents
import com.kevinthegreat.fpp.psi.FPPFile
import com.kevinthegreat.fpp.psi.FPPModuleDefinition
import com.kevinthegreat.fpp.psi.FPPTypes

object FPPUtil {
    fun isDefinition(element: PsiElement): Boolean =
        element is FPPModuleDefinition || element.elementType in FPPNameGroup.TYPES

    fun getParentDefinition(element: PsiElement): PsiElement? = element.parents(false).find(::isDefinition)

    fun isTopLevel(element: PsiElement): Boolean = getParentDefinition(element) == null

    fun getUnqualifiedNameElement(definition: PsiElement): PsiElement? {
        if (!isDefinition(definition)) return null

        return PsiTreeUtil.getChildrenOfTypeAsList(definition, PsiElement::class.java)
            .find { it.elementType == FPPTypes.IDENTIFIER }
    }

    fun getUnqualifiedName(definition: PsiElement): String? = getUnqualifiedNameElement(definition)?.text

    fun getQualifiedName(definition: PsiElement): String? {
        if (!isDefinition(definition)) return null

        val name = getUnqualifiedName(definition) ?: return null
        val parent = getParentDefinition(definition) ?: return name
        val parentQualifiedName = getQualifiedName(parent) ?: return name

        return "$parentQualifiedName.$name"
    }

    // 15.5. Resolution of Identifiers
    fun resolveIdentifier(definition: PsiElement, nameGroup: FPPNameGroup, identifier: String): List<PsiElement> {
        if (isTopLevel(definition)) {
            return findIdentifier(definition.project, nameGroup, identifier)
        }

        val parent = getParentDefinition(definition) ?: return emptyList()
        if (isTopLevel(parent)) {
            return findIdentifier(parent.project, nameGroup, "${getQualifiedName(parent)}.$identifier") +
                    findIdentifier(parent.project, nameGroup, identifier)
        }

        return findIdentifier(parent.project, nameGroup, "${getQualifiedName(parent)}.$identifier") +
                resolveIdentifier(parent, nameGroup, identifier)
    }

    private fun findIdentifier(project: Project, nameGroup: FPPNameGroup, qualifiedIdentifier: String): List<PsiElement> {
        val result = ArrayList<PsiElement>()
        val virtualFiles = FileTypeIndex.getFiles(FPPFileType, GlobalSearchScope.allScope(project))

        for (virtualFile in virtualFiles) {
            val fppFile = PsiManager.getInstance(project).findFile(virtualFile) as FPPFile? ?: continue
            result.addAll(findIdentifier(fppFile, nameGroup, qualifiedIdentifier))
        }

        return result
    }

    private fun findIdentifier(element: PsiElement, nameGroup: FPPNameGroup, qualifiedIdentifier: String): List<PsiElement> =
        findIdentifier(element, nameGroup, qualifiedIdentifier.split("."))

    private fun findIdentifier(element: PsiElement, nameGroup: FPPNameGroup, identifierSplit: List<String>): List<PsiElement> {
        if (identifierSplit.isEmpty()) return emptyList()

        val isDefinition = isDefinition(element)
        val isCorrectNameGroup = isDefinition && element.elementType in nameGroup.types
        val currentTarget = identifierSplit.first()
        val remainingTarget = identifierSplit.drop(1)

        if (isDefinition && remainingTarget.isNotEmpty() || isCorrectNameGroup) {
            // Check if the identifier attached to the definition matches the current target
            if (getUnqualifiedNameElement(element)?.textMatches(currentTarget) ?: false) {
                return if (remainingTarget.isEmpty()) listOf(element) else element.children.flatMap { findIdentifier(it, nameGroup, remainingTarget) }
            }
        } else if (!isDefinition) {
            return element.children.flatMap { findIdentifier(it, nameGroup, identifierSplit) }
        }

        return emptyList()
    }
}
