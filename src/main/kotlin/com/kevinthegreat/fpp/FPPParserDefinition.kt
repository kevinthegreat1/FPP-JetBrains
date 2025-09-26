package com.kevinthegreat.fpp

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.kevinthegreat.fpp.parser.FPPParser
import com.kevinthegreat.fpp.psi.FPPFile
import com.kevinthegreat.fpp.psi.FPPTokenSets
import com.kevinthegreat.fpp.psi.FPPTypes

class FPPParserDefinition : ParserDefinition {
    override fun createLexer(project: Project?) = FPPLexerAdapter()

    override fun createParser(project: Project?) = FPPParser()

    override fun getFileNodeType() = FILE

    override fun getCommentTokens() = FPPTokenSets.COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createElement(node: ASTNode?): PsiElement = FPPTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider) = FPPFile(viewProvider)
}

val FILE = IFileElementType(FPPLanguage)
