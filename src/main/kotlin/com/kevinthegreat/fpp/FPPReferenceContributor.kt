package com.kevinthegreat.fpp

import com.intellij.openapi.util.TextRange
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.*
import com.intellij.util.ProcessingContext
import com.kevinthegreat.fpp.psi.FPPComponentInstanceDefinition
import com.kevinthegreat.fpp.psi.FPPPortInstanceIdentifier
import com.kevinthegreat.fpp.psi.FPPTypes

class FPPReferenceContributor : PsiReferenceContributor() {
    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(), object : PsiReferenceProvider() {
            override fun getReferencesByElement(
                element: PsiElement, context: ProcessingContext
            ): Array<out PsiReference?> {
                // The element containing the qualified identifier tells us the definition types that the qualified identifier can resolve to.
                // This also acts as a filter to only add references to elements with definition types assigned.
                val types = FPPNameGroup.getDefTypes(element)
                    ?: FPPNameGroup.getDefTypes(element.parent)
                    ?: return emptyArray()
                val qualId = element.text

                return qualId.split(".")
                    .scan(-1 to -1) { prevRange, id -> prevRange.second + 1 to prevRange.second + 1 + id.length }
                    .drop(1)
                    .map { (start, end) ->
                        FPPReference(
                            element,
                            TextRange(start, end),
                            qualId.substring(0, end),
                            if (end == qualId.length) types else emptyList()
                        )
                    }.toTypedArray()
            }
        })

        registrar.registerReferenceProvider(
            PlatformPatterns.psiElement(FPPPortInstanceIdentifier::class.java), object : PsiReferenceProvider() {
                override fun getReferencesByElement(
                    element: PsiElement, context: ProcessingContext
                ): Array<out PsiReference?> {
                    element as FPPPortInstanceIdentifier

                    val componentInstanceDef = FPPUtil.resolveQualifiedIdentifier(
                        element.qualifiedIdentifierComponentInstanceDefinitionQualifier.text,
                        element,
                        listOf(FPPTypes.COMPONENT_INSTANCE_DEFINITION)
                    ).map { it as FPPComponentInstanceDefinition }

                    val componentDef = componentInstanceDef.flatMap {
                        FPPUtil.resolveQualifiedIdentifier(
                            it.qualifiedIdentifierComponentDefinition.text, it, listOf(FPPTypes.COMPONENT_DEFINITION)
                        )
                    }

                    return arrayOf(
                        FPPReference(
                            element,
                            TextRange(element.textLength - element.identifier.textLength, element.textLength),
                            element.identifier.text,
                            listOf(
                                FPPTypes.PORT_INSTANCE_SPECIFIER,
                                FPPTypes.GENERAL_PORT_INSTANCE_SPECIFIER,
                                FPPTypes.SPECIAL_PORT_INSTANCE_SPECIFIER
                            ),
                            componentDef
                        )
                    )
                }
            })
    }
}
