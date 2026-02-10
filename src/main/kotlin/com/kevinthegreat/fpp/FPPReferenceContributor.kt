package com.kevinthegreat.fpp

import com.intellij.openapi.util.TextRange
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.*
import com.intellij.util.ProcessingContext

class FPPReferenceContributor : PsiReferenceContributor() {
    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(), object : PsiReferenceProvider() {
            override fun getReferencesByElement(
                element: PsiElement,
                context: ProcessingContext
            ): Array<out PsiReference?> {
                // The element containing the qualified identifier tells us the definition types that the qualified identifier can resolve to.
                // This also acts as a filter to only add references to qualified identifiers.
                val types = FPPNameGroup.getDefTypes(element.parent) ?: return emptyArray()
                val qualId = element.text

                return qualId.split(".")
                    .scan(-1 to -1) { prevRange, id -> prevRange.second + 1 to prevRange.second + 1 + id.length }
                    .drop(1)
                    .map { (start, end) ->
                        FPPReference(
                            element,
                            qualId.substring(0, end),
                            TextRange(start, end),
                            if (end == qualId.length) types else emptyList()
                        )
                    }.toTypedArray()
            }
        })
    }
}
