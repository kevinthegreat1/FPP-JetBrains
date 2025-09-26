package com.kevinthegreat.fpp.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.kevinthegreat.fpp.FPPFileType
import com.kevinthegreat.fpp.FPPLanguage

class FPPFile : PsiFileBase {
    constructor(viewProvider: FileViewProvider) : super(viewProvider, FPPLanguage)

    override fun getFileType(): FileType {
        return FPPFileType
    }

    override fun toString(): String {
        return "FPP File"
    }
}
