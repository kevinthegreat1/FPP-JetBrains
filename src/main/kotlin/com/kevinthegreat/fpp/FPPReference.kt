package com.kevinthegreat.fpp

import com.intellij.codeInsight.completion.PrioritizedLookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.util.TextRange
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiPolyVariantReferenceBase
import com.intellij.psi.ResolveResult
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.elementType
import com.kevinthegreat.fpp.psi.FPPNamedElement

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

    override fun getVariants(): Array<out Any?> {
        val qualifier = if (qualId.contains(".")) qualId.substringBeforeLast(".") + "." else ""

        return (enclosingDef?.flatMap { FPPUtil.resolveQualifiedIdentifierInEnclosingDef(qualifier, it, emptyList()) }
            ?: FPPUtil.resolveQualifiedIdentifier(qualifier, element, emptyList()))
            .map { it as FPPNamedElement }
            .groupBy { it.name }
            .map { (name, def) ->
                val lookupElement = LookupElementBuilder.create(StringUtil.notNullize(name))
                    .withIcon(FPPIcons.FPRIME)
                    .withTypeText(def.map { it.elementType }.distinct().joinToString(","))
                    .withTailText(def.map { it.containingFile.name }.distinct().joinToString(", "))

                val isCorrectDefType = def.any { it.elementType in types }
                val priority = if (isCorrectDefType) 100.0 else 0.0
                val lookupElementBold = if (isCorrectDefType) lookupElement.bold() else lookupElement

                PrioritizedLookupElement.withPriority(lookupElementBold, priority)
            }
            .toTypedArray()
    }
}
