package com.kevinthegreat.fpp.psi

import com.intellij.psi.PsiElement

interface FPPComponentDefinitionProvider : FPPNavigatableElement {
    fun getComponentDef(): List<PsiElement>
}
