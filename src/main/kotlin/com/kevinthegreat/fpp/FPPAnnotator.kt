package com.kevinthegreat.fpp

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import com.kevinthegreat.fpp.psi.FPPPortInstanceIdentifier
import com.kevinthegreat.fpp.psi.FPPTelemetryChannelIdentifier
import com.kevinthegreat.fpp.psi.FPPTypes

class FPPAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        val resolvedIdentifiers = when (element) {
            is FPPPortInstanceIdentifier -> annotatePortInstanceIdentifier(element)
            is FPPTelemetryChannelIdentifier -> annotateTelemetryChannelIdentifier(element)
            else -> FPPUtil.resolveQualifiedIdentifier(
                element.text,
                element,
                FPPNameGroup.getDefTypes(element) ?: return
            )
        }

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

    // 8.1. Port Instance Identifiers
    private fun annotatePortInstanceIdentifier(element: FPPPortInstanceIdentifier): List<PsiElement> =
        element.getComponentDef().flatMap {
            FPPUtil.resolveQualifiedIdentifierInEnclosingDef(
                element.identifier.text,
                it,
                listOf(
                    FPPTypes.PORT_INSTANCE_SPECIFIER,
                    FPPTypes.GENERAL_PORT_INSTANCE_SPECIFIER,
                    FPPTypes.SPECIAL_PORT_INSTANCE_SPECIFIER
                )
            )
        }

    // 8.2. Telemetry Channel Identifiers
    private fun annotateTelemetryChannelIdentifier(element: FPPTelemetryChannelIdentifier): List<PsiElement> =
        element.getComponentDef().flatMap {
            FPPUtil.resolveQualifiedIdentifierInEnclosingDef(
                element.identifier.text,
                it,
                listOf(FPPTypes.TELEMETRY_CHANNEL_SPECIFIER)
            )
        }
}
