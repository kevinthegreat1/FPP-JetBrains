package com.kevinthegreat.fpp.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.AbstractElementManipulator
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType
import com.kevinthegreat.fpp.FPPUtil

class FPPQualifiedIdentifierManipulator : AbstractElementManipulator<PsiElement>() {
    override fun handleContentChange(element: PsiElement, range: TextRange, newContent: String?): PsiElement? {
        val oldId = element.findElementAt(range.startOffset) ?: return element
        if (oldId.elementType != FPPTypes.IDENTIFIER) return element

        newContent ?: return element
        val newModuleDef = FPPElementFactory.createModuleDef(element.project, newContent)
        val newId = FPPUtil.getUnqualifiedNameElement(newModuleDef)?.firstChild ?: return element

        return oldId.replace(newId)
    }
}
