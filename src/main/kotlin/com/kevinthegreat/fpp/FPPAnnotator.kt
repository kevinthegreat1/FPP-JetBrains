package com.kevinthegreat.fpp

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import com.kevinthegreat.fpp.psi.FPPQualifiedIdentifierTypeName

class FPPAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element !is FPPQualifiedIdentifierTypeName) return

        val resolvedIdentifiers =
            FPPUtil.getParentDefinition(element)?.let { FPPUtil.resolveQualifiedIdentifier(it, FPPNameGroup.TYPE, element.text) }
                ?: emptyList()

        if (resolvedIdentifiers.isEmpty()) {
            holder.newAnnotation(HighlightSeverity.ERROR, "Unresolved type reference: ${element.text}")
                .range(element)
                .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                .create()
        } else {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element)
                .create()
        }
    }
}
