package com.kevinthegreat.fpp.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.kevinthegreat.fpp.FPPUtil
import com.kevinthegreat.fpp.psi.FPPElementFactory
import com.kevinthegreat.fpp.psi.FPPNamedElement

abstract class FPPNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), FPPNamedElement {
    override fun getName(): String? = FPPUtil.getUnqualifiedName(this)

    override fun setName(name: String): PsiElement {
        val oldIdDef = FPPUtil.getUnqualifiedNameElement(this) ?: return this
        val newModuleDef = FPPElementFactory.createModuleDef(project, name)
        val newIdDef = FPPUtil.getUnqualifiedNameElement(newModuleDef) ?: return this
        oldIdDef.replace(newIdDef)
        return this
    }

    override fun getNameIdentifier(): PsiElement? = FPPUtil.getUnqualifiedNameElement(this)

    override fun getTextOffset(): Int = nameIdentifier?.textOffset ?: super.getTextOffset()
}
