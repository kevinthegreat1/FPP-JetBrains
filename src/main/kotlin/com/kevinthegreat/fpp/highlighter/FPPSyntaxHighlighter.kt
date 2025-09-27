package com.kevinthegreat.fpp.highlighter

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.kevinthegreat.fpp.FPPLexerAdapter
import com.kevinthegreat.fpp.psi.FPPTypes

class FPPSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        private val PREDEFINED_SYMBOL = TextAttributesKey.createTextAttributesKey("FPP_PREDEFINED_SYMBOL", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL)
        private val KEYWORD = TextAttributesKey.createTextAttributesKey("FPP_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        private val COMMENT = TextAttributesKey.createTextAttributesKey("FPP_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        private val ANNOTATION = TextAttributesKey.createTextAttributesKey("FPP_ANNOTATION", DefaultLanguageHighlighterColors.DOC_COMMENT)
        private val OPERATION_SIGN = TextAttributesKey.createTextAttributesKey("FPP_OPERATION_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        private val NUMBER = TextAttributesKey.createTextAttributesKey("FPP_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        private val STRING = TextAttributesKey.createTextAttributesKey("FPP_STRING", DefaultLanguageHighlighterColors.STRING)

        private val PREDEFINED_SYMBOL_KEYS = arrayOf(PREDEFINED_SYMBOL)
        private val KEYWORD_KEYS = arrayOf(KEYWORD)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val ANNOTATION_KEYS = arrayOf(ANNOTATION)
        private val OPERATION_SIGN_KEYS = arrayOf(OPERATION_SIGN)
        private val NUMBER_KEYS = arrayOf(NUMBER)
        private val STRING_KEYS = arrayOf(STRING)

        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }

    override fun getHighlightingLexer() = FPPLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType) = when (tokenType) {
        // 3.1. Reserved Words
        FPPTypes.F32, FPPTypes.F64, FPPTypes.I16, FPPTypes.I32, FPPTypes.I64, FPPTypes.I8, FPPTypes.U16, FPPTypes.U32, FPPTypes.U64, FPPTypes.U8 -> PREDEFINED_SYMBOL_KEYS
        FPPTypes.ACTION, FPPTypes.ACTIVE, FPPTypes.ACTIVITY, FPPTypes.ALWAYS, FPPTypes.ARRAY, FPPTypes.ASSERT, FPPTypes.ASYNC, FPPTypes.AT, FPPTypes.BASE, FPPTypes.BLOCK, FPPTypes.BOOL, FPPTypes.CHANGE, FPPTypes.CHOICE, FPPTypes.COMMAND, FPPTypes.COMPONENT, FPPTypes.CONNECTIONS, FPPTypes.CONSTANT, FPPTypes.CONTAINER, FPPTypes.CPU, FPPTypes.DEFAULT, FPPTypes.DIAGNOSTIC, FPPTypes.DO, FPPTypes.DROP, FPPTypes.ELSE, FPPTypes.ENTER, FPPTypes.ENTRY, FPPTypes.ENUM, FPPTypes.EVENT, FPPTypes.EXIT, FPPTypes.EXTERNAL, FPPTypes.FALSE, FPPTypes.FATAL, FPPTypes.FORMAT, FPPTypes.GET, FPPTypes.GROUP, FPPTypes.GUARD, FPPTypes.GUARDED, FPPTypes.HEALTH, FPPTypes.HIGH, FPPTypes.HOOK, FPPTypes.ID, FPPTypes.IF, FPPTypes.IMPORT, FPPTypes.INCLUDE, FPPTypes.INITIAL, FPPTypes.INPUT, FPPTypes.INSTANCE, FPPTypes.INTERFACE, FPPTypes.INTERNAL, FPPTypes.LOCATE, FPPTypes.LOW, FPPTypes.MACHINE, FPPTypes.MATCH, FPPTypes.MODULE, FPPTypes.OMIT, FPPTypes.ON, FPPTypes.OPCODE, FPPTypes.ORANGE, FPPTypes.OUTPUT, FPPTypes.PACKET, FPPTypes.PACKETS, FPPTypes.PARAM, FPPTypes.PASSIVE, FPPTypes.PHASE, FPPTypes.PORT, FPPTypes.PRIORITY, FPPTypes.PRIVATE, FPPTypes.PRODUCT, FPPTypes.QUEUE, FPPTypes.QUEUED, FPPTypes.RECORD, FPPTypes.RECV, FPPTypes.RED, FPPTypes.REF, FPPTypes.REG, FPPTypes.REQUEST, FPPTypes.RESP, FPPTypes.SAVE, FPPTypes.SEND, FPPTypes.SERIAL, FPPTypes.SET, FPPTypes.SEVERITY, FPPTypes.SIGNAL, FPPTypes.SIZE, FPPTypes.STACK, FPPTypes.STATE, FPPTypes.STRING, FPPTypes.STRUCT, FPPTypes.SYNC, FPPTypes.TELEMETRY, FPPTypes.TEXT, FPPTypes.THROTTLE, FPPTypes.TIME, FPPTypes.TOPOLOGY, FPPTypes.TRUE, FPPTypes.TYPE, FPPTypes.UNMATCHED, FPPTypes.UPDATE, FPPTypes.WARNING, FPPTypes.WITH, FPPTypes.YELLOW -> KEYWORD_KEYS
        // 3.5. Comments
        FPPTypes.COMMENT -> COMMENT_KEYS
        // 13.2. Annotations
        FPPTypes.PRE_ANNOTATION, FPPTypes.POST_ANNOTATION -> ANNOTATION_KEYS
        // 10. Expressions
        FPPTypes.ADD, FPPTypes.SUB, FPPTypes.MUL, FPPTypes.DIV -> OPERATION_SIGN_KEYS
        // 10.6. Floating-Point Literals
        // 10.8. Integer Literals
        FPPTypes.FLOATING_POINT_LITERAL, FPPTypes.INTEGER_LITERAL -> NUMBER_KEYS
        // 10.10. String Literals
        FPPTypes.STRING_LITERAL -> STRING_KEYS

        else -> EMPTY_KEYS
    }
}
