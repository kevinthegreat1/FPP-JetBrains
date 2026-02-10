package com.kevinthegreat.fpp.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.kevinthegreat.fpp.FPPUtil
import com.kevinthegreat.fpp.psi.FPPElementFactory
import com.kevinthegreat.fpp.psi.FPPNamedElement

abstract class FPPNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), FPPNamedElement {
    override fun getName(): String? = text

    override fun setName(name: String): PsiElement {
        val newModuleDef = FPPElementFactory.createModuleDef(project, name)
        val newIdDef = FPPUtil.getUnqualifiedNameElement(newModuleDef) ?: return this
        return replace(newIdDef)
    }

    override fun getNameIdentifier(): PsiElement? = this
}
