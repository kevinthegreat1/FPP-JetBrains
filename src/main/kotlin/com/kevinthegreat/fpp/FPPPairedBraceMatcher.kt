package com.kevinthegreat.fpp

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.kevinthegreat.fpp.psi.FPPTypes

class FPPPairedBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<out BracePair?> = arrayOf(BracePair(FPPTypes.LEFT_BRACE, FPPTypes.RIGHT_BRACE, true))

    override fun isPairedBracesAllowedBeforeType(leftBrace: IElementType, context: IElementType?): Boolean = true

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset
}
