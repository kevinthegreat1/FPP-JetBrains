package com.kevinthegreat.fpp

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceSet
import com.kevinthegreat.fpp.psi.FPPIncludeSpecifier
import com.kevinthegreat.fpp.psi.FPPPortInstanceIdentifier
import com.kevinthegreat.fpp.psi.FPPTelemetryChannelIdentifier
import com.kevinthegreat.fpp.psi.FPPTypes

class FPPAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is FPPIncludeSpecifier -> annotateIncludeSpecifier(element, holder)
            is FPPPortInstanceIdentifier -> annotatePortInstanceIdentifier(element, holder)
            is FPPTelemetryChannelIdentifier -> annotateTelemetryChannelIdentifier(element, holder)
            else -> annotateReference(element, holder)
        }
    }

    private fun annotateReference(element: PsiElement, holder: AnnotationHolder) {
        val defTypes = FPPNameGroup.getDefTypes(element) ?: return
        val qualId = element.text

        val notResolved = qualId.split(".")
            .scan(-1 to -1) { prevRange, id -> prevRange.second + 1 to prevRange.second + 1 + id.length }
            .drop(1)
            .firstOrNull { (_, end) ->
                FPPUtil.resolveQualifiedIdentifier(
                    qualId.substring(0, end),
                    element,
                    if (end == qualId.length) defTypes else emptyList()
                ).isEmpty()
            }

        if (notResolved != null) {
            holder.newAnnotation(
                HighlightSeverity.ERROR,
                "Unresolved type reference '${element.text}', expected one of: '${defTypes.joinToString("', '")}'"
            )
                .range(
                    TextRange(
                        element.textRange.startOffset + notResolved.first,
                        element.textRange.startOffset + notResolved.second
                    )
                )
                .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                .create()
        } else {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element)
                .create()
        }
    }

    // 7.6 Include Specifiers
    private fun annotateIncludeSpecifier(element: FPPIncludeSpecifier, holder: AnnotationHolder) {
        val relativePath = element.stringLiteral.text.substring(1, element.stringLiteral.textLength - 1)
        val resolved = FileReferenceSet(
            relativePath,
            element,
            element.stringLiteral.startOffsetInParent + 1,
            null,
            true
        ).resolve()

        if (resolved == null) {
            holder.newAnnotation(HighlightSeverity.ERROR, "Unresolved include '${relativePath}'")
                .range(element.stringLiteral)
                .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                .create()
        } else {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element.stringLiteral)
                .create()
        }
    }

    // 8.1. Port Instance Identifiers
    private fun annotatePortInstanceIdentifier(element: FPPPortInstanceIdentifier, holder: AnnotationHolder) {
        val componentDef = element.getComponentDef()

        if (componentDef.isEmpty()) {
            holder.newSilentAnnotation(HighlightSeverity.ERROR)
                .range(element.identifier)
                .create()
            return
        }

        val resolved = componentDef.flatMap {
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

        if (resolved.isEmpty()) {
            holder.newAnnotation(
                HighlightSeverity.ERROR,
                "Unresolved port instance identifier '${element.identifier.text}' in component '${
                    componentDef.map(FPPUtil::getQualifiedName).distinct().joinToString("', '")
                }'"
            )
                .range(element.identifier)
                .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                .create()
        } else {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element.identifier)
                .create()
        }
    }

    // 8.2. Telemetry Channel Identifiers
    private fun annotateTelemetryChannelIdentifier(element: FPPTelemetryChannelIdentifier, holder: AnnotationHolder) {
        val componentDef = element.getComponentDef()

        if (componentDef.isEmpty()) {
            holder.newSilentAnnotation(HighlightSeverity.ERROR)
                .range(element.identifier)
                .create()
            return
        }

        val resolved = componentDef.flatMap {
            FPPUtil.resolveQualifiedIdentifierInEnclosingDef(
                element.identifier.text,
                it,
                listOf(FPPTypes.TELEMETRY_CHANNEL_SPECIFIER)
            )
        }

        if (resolved.isEmpty()) {
            holder.newAnnotation(
                HighlightSeverity.ERROR,
                "Unresolved telemetry channel identifier '${element.identifier.text}' in component '${
                    componentDef.map(FPPUtil::getQualifiedName).distinct().joinToString("', '")
                }'"
            )
                .range(element.identifier)
                .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                .create()
        } else {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element.identifier)
                .create()
        }
    }
}
