package com.kevinthegreat.fpp.psi

import com.intellij.psi.tree.TokenSet

object FPPTokenSets {
    val IDENTIFIERS = TokenSet.create(FPPTypes.IDENTIFIER, FPPTypes.IDENTIFIER_DEFINITION)
    val COMMENTS = TokenSet.create(FPPTypes.COMMENT, FPPTypes.PRE_ANNOTATION, FPPTypes.POST_ANNOTATION)
}
