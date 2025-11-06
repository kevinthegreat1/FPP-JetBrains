package com.kevinthegreat.fpp

import com.intellij.lang.Commenter

class FPPCommenter : Commenter {
    override fun getLineCommentPrefix() = "#"

    override fun getBlockCommentPrefix() = ""

    override fun getBlockCommentSuffix() = null

    override fun getCommentedBlockCommentPrefix() = null

    override fun getCommentedBlockCommentSuffix() = null
}
