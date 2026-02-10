package com.kevinthegreat.fpp

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiPolyVariantReferenceBase
import com.intellij.psi.ResolveResult
import com.intellij.psi.tree.IElementType

class FPPReference(element: PsiElement, val types: List<IElementType>) : PsiPolyVariantReferenceBase<PsiElement>(element, TextRange(0, element.textLength)) {
    override fun multiResolve(incompleteCode: Boolean): Array<out ResolveResult?> =
        FPPUtil.resolveQualifiedIdentifier(element.text, element, types)
            .map(::PsiElementResolveResult)
            .toTypedArray()
}
