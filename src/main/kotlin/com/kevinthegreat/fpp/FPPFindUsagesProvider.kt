package com.kevinthegreat.fpp

import com.intellij.lang.cacheBuilder.DefaultWordsScanner
import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.TokenSet
import com.kevinthegreat.fpp.psi.FPPIdentifierDefinition
import com.kevinthegreat.fpp.psi.FPPNamedElement
import com.kevinthegreat.fpp.psi.FPPTokenSets
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.NonNls

class FPPFindUsagesProvider : FindUsagesProvider {
    override fun getWordsScanner(): WordsScanner =
        DefaultWordsScanner(FPPLexerAdapter(), FPPTokenSets.IDENTIFIERS, FPPTokenSets.COMMENTS, TokenSet.EMPTY)

    override fun canFindUsagesFor(element: PsiElement): Boolean = element is FPPNamedElement

    override fun getHelpId(element: PsiElement): @NonNls String? = null

    override fun getType(element: PsiElement): @Nls String =
        if (element is FPPIdentifierDefinition) "FPP identifier definition" else ""

    override fun getDescriptiveName(element: PsiElement): @Nls String = FPPUtil.getQualifiedName(element) ?: ""

    override fun getNodeText(element: PsiElement, useFullName: Boolean): @Nls String = FPPUtil.getQualifiedName(element) ?: ""
}
