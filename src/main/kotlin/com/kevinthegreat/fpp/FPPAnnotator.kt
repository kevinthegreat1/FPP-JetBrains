package com.kevinthegreat.fpp

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import com.kevinthegreat.fpp.psi.*

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
            is FPPQualifiedIdentifierStateOrChoiceDefinition -> listOf(FPPTypes.STATE_DEFINITION, FPPTypes.CHOICE_DEFINITION)
            is FPPQualifiedIdentifierComponentInstanceDefinition -> listOf(FPPTypes.COMPONENT_INSTANCE_DEFINITION)
            is FPPQualifiedIdentifierPortInterfaceDefinition -> listOf(FPPTypes.PORT_INTERFACE_DEFINITION)
            is FPPQualifiedIdentifierConstantDefinition -> listOf(FPPTypes.CONSTANT_DEFINITION)
            is FPPQualifiedIdentifierPortDefinition -> listOf(FPPTypes.PORT_DEFINITION)
            is FPPQualifiedIdentifierStateMachineDefinition -> listOf(FPPTypes.STATE_MACHINE_DEFINITION)
            is FPPQualifiedIdentifierTopologyDefinition -> listOf(FPPTypes.TOPOLOGY_DEFINITION)
            is FPPQualifiedIdentifierTypeLocationSpecifier -> listOf(
                FPPTypes.ARRAY_DEFINITION,
                FPPTypes.ENUM_DEFINITION,
                FPPTypes.STRUCT_DEFINITION,
                FPPTypes.ABSTRACT_TYPE_DEFINITION
            )
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
