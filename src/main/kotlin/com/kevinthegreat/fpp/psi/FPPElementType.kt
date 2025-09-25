package com.kevinthegreat.fpp.psi

import com.intellij.psi.tree.IElementType
import com.kevinthegreat.fpp.FPPLanguage
import org.jetbrains.annotations.NonNls

class FPPElementType : IElementType {
    constructor(@NonNls debugName: String) : super(debugName, FPPLanguage)
}
