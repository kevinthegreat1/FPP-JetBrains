package com.kevinthegreat.fpp

import com.intellij.lang.ASTNode
import com.intellij.lang.folding.FoldingBuilderEx
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.util.TextRange
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiRecursiveElementWalkingVisitor
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.elementType
import com.intellij.psi.util.endOffset
import com.intellij.psi.util.startOffset
import com.kevinthegreat.fpp.psi.FPPTypes

class FPPFoldingBuilder : FoldingBuilderEx(), DumbAware {
    override fun buildFoldRegions(root: PsiElement, document: Document, quick: Boolean): Array<out FoldingDescriptor?> {
        val descriptors = ArrayList<FoldingDescriptor>()

        root.accept(object : PsiRecursiveElementWalkingVisitor() {
            override fun visitElement(element: PsiElement) {
                super.visitElement(element)

                if (!FPPUtil.isDef(element)) return

                val braces = PsiTreeUtil.getChildrenOfType(element, PsiElement::class.java)
                    ?.filter { it.elementType == FPPTypes.LEFT_BRACE || it.elementType == FPPTypes.RIGHT_BRACE }
                    ?.chunked(2) ?: return
                if (braces.any { it.size != 2 || it.first().elementType != FPPTypes.LEFT_BRACE || it.last().elementType != FPPTypes.RIGHT_BRACE }) return

                descriptors += braces.map { (left, right) -> FoldingDescriptor(left.node, TextRange(left.startOffset, right.endOffset)) }
            }
        })

        return descriptors.toTypedArray()
    }

    override fun isCollapsedByDefault(p0: ASTNode): Boolean = false

    override fun getPlaceholderText(p0: ASTNode): String = "{${StringUtil.THREE_DOTS}}"
}
