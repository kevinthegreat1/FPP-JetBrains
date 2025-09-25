package com.kevinthegreat.fpp;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;import com.intellij.psi.tree.IElementType;
import static com.kevinthegreat.fpp.psi.FPPTypes.*;

%%

%class FPPLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%public
%final
%eof{
  return;
%eof}

%state YYINITIAL
// 3.5. Comments
%state COMMENT
// 3.8. Automatic Suppression of Newlines
%state AFTER_EOL_SUPPRESSOR

IDENTIFIER      = [$a-zA-Z_]\w*
END_OF_LINE     = (\r?\n)
COMMENT         = "#" [^\r\n]*
WHITESPACE      = [ ]

%%
<YYINITIAL> {
    // 3.1. Reserved Words
    "F32"   { return F32; }
    "F64"   { return F64; }
    "I16"   { return I16; }
    "I32"   { return I32; }
    "I64"   { return I64; }
    "I8"    { return I8; }
    "U16"   { return U16; }
    "U32"   { return U32; }
    "U64"   { return U64; }
    "U8"    { return U8; }
    "action"      { return ACTION; }
    "active"      { return ACTIVE; }
    "activity"    { return ACTIVITY; }
    "always"      { return ALWAYS; }
    "array"       { return ARRAY; }
    "assert"      { return ASSERT; }
    "async"       { return ASYNC; }
    "at"          { return AT; }
    "base"        { return BASE; }
    "block"       { return BLOCK; }
    "bool"        { return BOOL; }
    "change"      { return CHANGE; }
    "choice"      { return CHOICE; }
    "command"     { return COMMAND; }
    "component"   { return COMPONENT; }
    "connections" { return CONNECTIONS; }
    "constant"    { return CONSTANT; }
    "container"   { return CONTAINER; }
    "cpu"         { return CPU; }
    "default"     { return DEFAULT; }
    "diagnostic"  { return DIAGNOSTIC; }
    "do"          { return DO; }
    "drop"        { return DROP; }
    "else"        { return ELSE; }
    "enter"       { return ENTER; }
    "entry"       { return ENTRY; }
    "enum"        { return ENUM; }
    "event"       { return EVENT; }
    "exit"        { return EXIT; }
    "external"    { return EXTERNAL; }
    "false"       { return FALSE; }
    "fatal"       { return FATAL; }
    "format"      { return FORMAT; }
    "get"         { return GET; }
    "group"       { return GROUP; }
    "guard"       { return GUARD; }
    "guarded"     { return GUARDED; }
    "health"      { return HEALTH; }
    "high"        { return HIGH; }
    "hook"        { return HOOK; }
    "id"          { return ID; }
    "if"          { return IF; }
    "import"      { return IMPORT; }
    "include"     { return INCLUDE; }
    "initial"     { return INITIAL; }
    "input"       { return INPUT; }
    "instance"    { return INSTANCE; }
    "interface"   { return INTERFACE; }
    "internal"    { return INTERNAL; }
    "locate"      { return LOCATE; }
    "low"         { return LOW; }
    "machine"     { return MACHINE; }
    "match"       { return MATCH; }
    "module"      { return MODULE; }
    "omit"        { return OMIT; }
    "on"          { return ON; }
    "opcode"      { return OPCODE; }
    "orange"      { return ORANGE; }
    "output"      { return OUTPUT; }
    "packet"      { return PACKET; }
    "packets"     { return PACKETS; }
    "param"       { return PARAM; }
    "passive"     { return PASSIVE; }
    "phase"       { return PHASE; }
    "port"        { return PORT; }
    "priority"    { return PRIORITY; }
    "private"     { return PRIVATE; }
    "product"     { return PRODUCT; }
    "queue"       { return QUEUE; }
    "queued"      { return QUEUED; }
    "record"      { return RECORD; }
    "recv"        { return RECV; }
    "red"         { return RED; }
    "ref"         { return REF; }
    "reg"         { return REG; }
    "request"     { return REQUEST; }
    "resp"        { return RESP; }
    "save"        { return SAVE; }
    "send"        { return SEND; }
    "serial"      { return SERIAL; }
    "set"         { return SET; }
    "severity"    { return SEVERITY; }
    "signal"      { return SIGNAL; }
    "size"        { return SIZE; }
    "stack"       { return STACK; }
    "state"       { return STATE; }
    "string"      { return STRING; }
    "struct"      { return STRUCT; }
    "sync"        { return SYNC; }
    "telemetry"   { return TELEMETRY; }
    "text"        { return TEXT; }
    "throttle"    { return THROTTLE; }
    "time"        { return TIME; }
    "topology"    { return TOPOLOGY; }
    "true"        { return TRUE; }
    "type"        { return TYPE; }
    "unmatched"   { return UNMATCHED; }
    "update"      { return UPDATE; }
    "warning"     { return WARNING; }
    "with"        { return WITH; }
    "yellow"      { return YELLOW; }

    // 3.2. Symbols
    // 3.8. Automatic Suppression of Newlines
    "("  { yybegin(AFTER_EOL_SUPPRESSOR); return LEFT_PAREN; }
    "*"  { yybegin(AFTER_EOL_SUPPRESSOR); return MUL; }
    "+"  { yybegin(AFTER_EOL_SUPPRESSOR); return ADD; }
    ","  { yybegin(AFTER_EOL_SUPPRESSOR); return COMMA; }
    "-"  { yybegin(AFTER_EOL_SUPPRESSOR); return SUB; }
    "->" { yybegin(AFTER_EOL_SUPPRESSOR); return ARROW; }
    "/"  { yybegin(AFTER_EOL_SUPPRESSOR); return DIV; }
    ":"  { yybegin(AFTER_EOL_SUPPRESSOR); return COLON; }
    ";"  { yybegin(AFTER_EOL_SUPPRESSOR); return SEMICOLON; }
    "="  { yybegin(AFTER_EOL_SUPPRESSOR); return ASSIGN; }
    "["  { yybegin(AFTER_EOL_SUPPRESSOR); return LEFT_BRACKET; }
    "{"  { yybegin(AFTER_EOL_SUPPRESSOR); return LEFT_BRACE; }
    // 3.2. Symbols
    ")"  { return RIGHT_PAREN; }
    "."  { return DOT; }
    "]"  { return RIGHT_BRACKET; }
    "}"  { return RIGHT_BRACE; }

    // 3.3. Identifiers
    {IDENTIFIER}    { return IDENTIFIER; }
    // 3.4. End-of-Line Tokens
    // 3.9. Collapsing of Newlines
    {END_OF_LINE}+      { return END_OF_LINE; }
    // 3.5. Comments
    {COMMENT}           { yybegin(COMMENT); }
    // 3.6. Whitespace and Non-Printable Characters
    {WHITESPACE}+       {}
    // 3.7. Explicit Line Continuations
    "\\" {END_OF_LINE}   {}

    .    { return TokenType.BAD_CHARACTER; }
}

// 3.5. Comments
<COMMENT> {
    {END_OF_LINE}+  { yybegin(YYINITIAL); return END_OF_LINE; }
    .               {}
}

// 3.8. Automatic Suppression of Newlines
<AFTER_EOL_SUPPRESSOR> {
    {WHITESPACE}+   {}
    {END_OF_LINE}+  { yybegin(YYINITIAL); }
    .               { yybegin(YYINITIAL); yypushback(1); }
}
