package com.kevinthegreat.fpp

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiPolyVariantReferenceBase
import com.intellij.psi.ResolveResult
import com.intellij.psi.tree.IElementType

class FPPReference(
    element: PsiElement,
    range: TextRange,
    val qualId: String,
    val types: List<IElementType>,
    val enclosingDef: List<PsiElement>? = null
) : PsiPolyVariantReferenceBase<PsiElement>(element, range) {
    override fun multiResolve(incompleteCode: Boolean): Array<out ResolveResult?> =
        (enclosingDef?.flatMap { FPPUtil.resolveQualifiedIdentifierInEnclosingDef(qualId, it, types) }
            ?: FPPUtil.resolveQualifiedIdentifier(qualId, element, types))
            .map(::PsiElementResolveResult)
            .toTypedArray()
}
