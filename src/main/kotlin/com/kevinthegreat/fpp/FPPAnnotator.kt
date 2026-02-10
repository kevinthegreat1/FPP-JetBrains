package com.kevinthegreat.fpp

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement

class FPPAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        val defTypes = FPPNameGroup.getDefTypes(element) ?: return

        val resolvedIdentifiers = FPPUtil.resolveQualifiedIdentifier(element.text, element, defTypes)

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
