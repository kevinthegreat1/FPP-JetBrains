package com.kevinthegreat.fpp

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import com.kevinthegreat.fpp.psi.FPPQualifiedIdentifierComponentDefinition
import com.kevinthegreat.fpp.psi.FPPQualifiedIdentifierTypeName
import com.kevinthegreat.fpp.psi.FPPTypes

class FPPAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        val types = when (element) {
            is FPPQualifiedIdentifierTypeName -> listOf(
                FPPTypes.ABSTRACT_TYPE_DEFINITION,
                FPPTypes.ALIAS_TYPE_DEFINITION,
                FPPTypes.ARRAY_DEFINITION,
                FPPTypes.ENUM_DEFINITION,
                FPPTypes.STRUCT_DEFINITION
            )
            is FPPQualifiedIdentifierComponentDefinition -> listOf(FPPTypes.COMPONENT_DEFINITION)
            else -> return
        }

        val resolvedIdentifiers =
            FPPUtil.getParentDefinition(element)?.let { FPPUtil.resolveQualifiedIdentifier(it, types, element.text) }
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
