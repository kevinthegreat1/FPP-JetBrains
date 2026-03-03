package com.kevinthegreat.fpp.psi.impl

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.kevinthegreat.fpp.FPPUtil
import com.kevinthegreat.fpp.psi.FPPComponentDefinitionProvider
import com.kevinthegreat.fpp.psi.FPPComponentInstanceDefinition
import com.kevinthegreat.fpp.psi.FPPPortInstanceIdentifier
import com.kevinthegreat.fpp.psi.FPPTypes

abstract class FPPPortInstanceIdentifierMixinImpl(node: ASTNode) : FPPNavigatableElementImpl(node),
    FPPPortInstanceIdentifier, FPPComponentDefinitionProvider {
    override fun getComponentDef(): List<PsiElement> {
        val componentInstanceDef = FPPUtil.resolveQualifiedIdentifier(
            qualifiedIdentifierComponentInstanceDefinitionQualifier.text,
            this,
            listOf(FPPTypes.COMPONENT_INSTANCE_DEFINITION)
        ).map { it as FPPComponentInstanceDefinition }

        return componentInstanceDef.flatMap {
            FPPUtil.resolveQualifiedIdentifier(
                it.qualifiedIdentifierComponentDefinition.text, it, listOf(FPPTypes.COMPONENT_DEFINITION)
            )
        }
    }
}
