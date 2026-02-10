package com.kevinthegreat.fpp

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiPolyVariantReferenceBase
import com.intellij.psi.ResolveResult
import com.intellij.psi.tree.IElementType

class FPPReference(element: PsiElement, val qualId: String, range: TextRange, val types: List<IElementType>) :
    PsiPolyVariantReferenceBase<PsiElement>(element, range) {
    override fun multiResolve(incompleteCode: Boolean): Array<out ResolveResult?> =
        FPPUtil.resolveQualifiedIdentifier(qualId, element, types)
            .map(::PsiElementResolveResult)
            .toTypedArray()
}
