package com.kevinthegreat.fpp.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiReference
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry
import com.kevinthegreat.fpp.psi.FPPNavigatableElement

abstract class FPPNavigatableElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), FPPNavigatableElement {
    override fun getReferences(): Array<out PsiReference?> = ReferenceProvidersRegistry.getReferencesFromProviders(this)
}
