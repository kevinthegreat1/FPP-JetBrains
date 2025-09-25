package com.kevinthegreat.fpp

import com.intellij.openapi.fileTypes.LanguageFileType

object FPPFileType : LanguageFileType(FPPLanguage) {
    override fun getName(): String = "FPP File"
    @Suppress("DialogTitleCapitalization")
    override fun getDescription(): String = "F Prime Prime file"
    override fun getDefaultExtension(): String = "fpp"
    override fun getIcon() = FPPIcons.FPRIME
}
