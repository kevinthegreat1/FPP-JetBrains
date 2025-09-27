// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.kevinthegreat.fpp.psi.impl.*;

public interface FPPTypes {

  IElementType ARITHMETIC_EXPRESSION = new FPPElementType("ARITHMETIC_EXPRESSION");
  IElementType ARITHMETIC_EXPRESSION_FACTOR = new FPPElementType("ARITHMETIC_EXPRESSION_FACTOR");
  IElementType ARITHMETIC_EXPRESSION_PRIMARY = new FPPElementType("ARITHMETIC_EXPRESSION_PRIMARY");
  IElementType ARITHMETIC_EXPRESSION_TERM = new FPPElementType("ARITHMETIC_EXPRESSION_TERM");
  IElementType COMMAND_KIND = new FPPElementType("COMMAND_KIND");
  IElementType COMMAND_SPECIFIER = new FPPElementType("COMMAND_SPECIFIER");
  IElementType COMPONENT_DEFINITION = new FPPElementType("COMPONENT_DEFINITION");
  IElementType COMPONENT_KIND = new FPPElementType("COMPONENT_KIND");
  IElementType COMPONENT_MEMBER = new FPPElementType("COMPONENT_MEMBER");
  IElementType COMPONENT_MEMBER_SEQUENCE = new FPPElementType("COMPONENT_MEMBER_SEQUENCE");
  IElementType EVENT_SEVERITY = new FPPElementType("EVENT_SEVERITY");
  IElementType EVENT_SPECIFIER = new FPPElementType("EVENT_SPECIFIER");
  IElementType EXPRESSION = new FPPElementType("EXPRESSION");
  IElementType FLOATING_POINT_TYPE_NAME = new FPPElementType("FLOATING_POINT_TYPE_NAME");
  IElementType FORMAL_PARAMETER = new FPPElementType("FORMAL_PARAMETER");
  IElementType GENERAL_PORT_KIND = new FPPElementType("GENERAL_PORT_KIND");
  IElementType MODULE_DEFINITION = new FPPElementType("MODULE_DEFINITION");
  IElementType MODULE_MEMBER = new FPPElementType("MODULE_MEMBER");
  IElementType MODULE_MEMBER_SEQUENCE = new FPPElementType("MODULE_MEMBER_SEQUENCE");
  IElementType PARAM_LIST = new FPPElementType("PARAM_LIST");
  IElementType PORT_DEFINITION = new FPPElementType("PORT_DEFINITION");
  IElementType PORT_INSTANCE_SPECIFIER = new FPPElementType("PORT_INSTANCE_SPECIFIER");
  IElementType PORT_INSTANCE_TYPE = new FPPElementType("PORT_INSTANCE_TYPE");
  IElementType PRIMITIVE_INTEGER_TYPE_NAME = new FPPElementType("PRIMITIVE_INTEGER_TYPE_NAME");
  IElementType QUALIFIED_IDENTIFIER = new FPPElementType("QUALIFIED_IDENTIFIER");
  IElementType QUALIFIED_IDENTIFIER_TYPE_NAME = new FPPElementType("QUALIFIED_IDENTIFIER_TYPE_NAME");
  IElementType QUEUE_FULL_BEHAVIOR = new FPPElementType("QUEUE_FULL_BEHAVIOR");
  IElementType SPECIAL_PORT_INPUT_KIND = new FPPElementType("SPECIAL_PORT_INPUT_KIND");
  IElementType SPECIAL_PORT_KIND = new FPPElementType("SPECIAL_PORT_KIND");
  IElementType STRING_TYPE_NAME = new FPPElementType("STRING_TYPE_NAME");
  IElementType TELEMETRY_CHANNEL_SPECIFIER = new FPPElementType("TELEMETRY_CHANNEL_SPECIFIER");
  IElementType TELEMETRY_LIMIT = new FPPElementType("TELEMETRY_LIMIT");
  IElementType TELEMETRY_LIMIT_SEQUENCE = new FPPElementType("TELEMETRY_LIMIT_SEQUENCE");
  IElementType TELEMETRY_UPDATE = new FPPElementType("TELEMETRY_UPDATE");
  IElementType TRANSLATION_UNIT = new FPPElementType("TRANSLATION_UNIT");
  IElementType TRANSLATION_UNIT_MEMBER = new FPPElementType("TRANSLATION_UNIT_MEMBER");
  IElementType TYPE_NAME = new FPPElementType("TYPE_NAME");

  IElementType ACTION = new FPPTokenType("action");
  IElementType ACTIVE = new FPPTokenType("active");
  IElementType ACTIVITY = new FPPTokenType("activity");
  IElementType ADD = new FPPTokenType("+");
  IElementType ALWAYS = new FPPTokenType("always");
  IElementType ARRAY = new FPPTokenType("array");
  IElementType ARROW = new FPPTokenType("->");
  IElementType ASSERT = new FPPTokenType("assert");
  IElementType ASSIGN = new FPPTokenType("=");
  IElementType ASYNC = new FPPTokenType("async");
  IElementType AT = new FPPTokenType("at");
  IElementType BASE = new FPPTokenType("base");
  IElementType BLOCK = new FPPTokenType("block");
  IElementType BOOL = new FPPTokenType("bool");
  IElementType CHANGE = new FPPTokenType("change");
  IElementType CHOICE = new FPPTokenType("choice");
  IElementType COLON = new FPPTokenType(":");
  IElementType COMMA = new FPPTokenType(",");
  IElementType COMMAND = new FPPTokenType("command");
  IElementType COMMENT = new FPPTokenType("COMMENT");
  IElementType COMPONENT = new FPPTokenType("component");
  IElementType CONNECTIONS = new FPPTokenType("connections");
  IElementType CONSTANT = new FPPTokenType("constant");
  IElementType CONTAINER = new FPPTokenType("container");
  IElementType CPU = new FPPTokenType("cpu");
  IElementType DEFAULT = new FPPTokenType("default");
  IElementType DIAGNOSTIC = new FPPTokenType("diagnostic");
  IElementType DIV = new FPPTokenType("/");
  IElementType DO = new FPPTokenType("do");
  IElementType DOT = new FPPTokenType(".");
  IElementType DROP = new FPPTokenType("drop");
  IElementType ELSE = new FPPTokenType("else");
  IElementType END_OF_LINE = new FPPTokenType("END_OF_LINE");
  IElementType ENTER = new FPPTokenType("enter");
  IElementType ENTRY = new FPPTokenType("entry");
  IElementType ENUM = new FPPTokenType("enum");
  IElementType EVENT = new FPPTokenType("event");
  IElementType EXIT = new FPPTokenType("exit");
  IElementType EXTERNAL = new FPPTokenType("external");
  IElementType F32 = new FPPTokenType("F32");
  IElementType F64 = new FPPTokenType("F64");
  IElementType FALSE = new FPPTokenType("false");
  IElementType FATAL = new FPPTokenType("fatal");
  IElementType FLOATING_POINT_LITERAL = new FPPTokenType("FLOATING_POINT_LITERAL");
  IElementType FORMAT = new FPPTokenType("format");
  IElementType GET = new FPPTokenType("get");
  IElementType GROUP = new FPPTokenType("group");
  IElementType GUARD = new FPPTokenType("guard");
  IElementType GUARDED = new FPPTokenType("guarded");
  IElementType HEALTH = new FPPTokenType("health");
  IElementType HIGH = new FPPTokenType("high");
  IElementType HOOK = new FPPTokenType("hook");
  IElementType I16 = new FPPTokenType("I16");
  IElementType I32 = new FPPTokenType("I32");
  IElementType I64 = new FPPTokenType("I64");
  IElementType I8 = new FPPTokenType("I8");
  IElementType ID = new FPPTokenType("id");
  IElementType IDENTIFIER = new FPPTokenType("IDENTIFIER");
  IElementType IF = new FPPTokenType("if");
  IElementType IMPORT = new FPPTokenType("import");
  IElementType INCLUDE = new FPPTokenType("include");
  IElementType INITIAL = new FPPTokenType("initial");
  IElementType INPUT = new FPPTokenType("input");
  IElementType INSTANCE = new FPPTokenType("instance");
  IElementType INTEGER_LITERAL = new FPPTokenType("INTEGER_LITERAL");
  IElementType INTERFACE = new FPPTokenType("interface");
  IElementType INTERNAL = new FPPTokenType("internal");
  IElementType LEFT_BRACE = new FPPTokenType("{");
  IElementType LEFT_BRACKET = new FPPTokenType("[");
  IElementType LEFT_PAREN = new FPPTokenType("(");
  IElementType LOCATE = new FPPTokenType("locate");
  IElementType LOW = new FPPTokenType("low");
  IElementType MACHINE = new FPPTokenType("machine");
  IElementType MATCH = new FPPTokenType("match");
  IElementType MODULE = new FPPTokenType("module");
  IElementType MUL = new FPPTokenType("*");
  IElementType OMIT = new FPPTokenType("omit");
  IElementType ON = new FPPTokenType("on");
  IElementType OPCODE = new FPPTokenType("opcode");
  IElementType ORANGE = new FPPTokenType("orange");
  IElementType OUTPUT = new FPPTokenType("output");
  IElementType PACKET = new FPPTokenType("packet");
  IElementType PACKETS = new FPPTokenType("packets");
  IElementType PARAM = new FPPTokenType("param");
  IElementType PASSIVE = new FPPTokenType("passive");
  IElementType PHASE = new FPPTokenType("phase");
  IElementType PORT = new FPPTokenType("port");
  IElementType POST_ANNOTATION = new FPPTokenType("POST_ANNOTATION");
  IElementType PRE_ANNOTATION = new FPPTokenType("PRE_ANNOTATION");
  IElementType PRIORITY = new FPPTokenType("priority");
  IElementType PRIVATE = new FPPTokenType("private");
  IElementType PRODUCT = new FPPTokenType("product");
  IElementType QUEUE = new FPPTokenType("queue");
  IElementType QUEUED = new FPPTokenType("queued");
  IElementType RECORD = new FPPTokenType("record");
  IElementType RECV = new FPPTokenType("recv");
  IElementType RED = new FPPTokenType("red");
  IElementType REF = new FPPTokenType("ref");
  IElementType REG = new FPPTokenType("reg");
  IElementType REQUEST = new FPPTokenType("request");
  IElementType RESP = new FPPTokenType("resp");
  IElementType RIGHT_BRACE = new FPPTokenType("}");
  IElementType RIGHT_BRACKET = new FPPTokenType("]");
  IElementType RIGHT_PAREN = new FPPTokenType(")");
  IElementType SAVE = new FPPTokenType("save");
  IElementType SEMICOLON = new FPPTokenType(";");
  IElementType SEND = new FPPTokenType("send");
  IElementType SERIAL = new FPPTokenType("serial");
  IElementType SET = new FPPTokenType("set");
  IElementType SEVERITY = new FPPTokenType("severity");
  IElementType SIGNAL = new FPPTokenType("signal");
  IElementType SIZE = new FPPTokenType("size");
  IElementType STACK = new FPPTokenType("stack");
  IElementType STATE = new FPPTokenType("state");
  IElementType STRING = new FPPTokenType("string");
  IElementType STRING_LITERAL = new FPPTokenType("STRING_LITERAL");
  IElementType STRUCT = new FPPTokenType("struct");
  IElementType SUB = new FPPTokenType("-");
  IElementType SYNC = new FPPTokenType("sync");
  IElementType TELEMETRY = new FPPTokenType("telemetry");
  IElementType TEXT = new FPPTokenType("text");
  IElementType THROTTLE = new FPPTokenType("throttle");
  IElementType TIME = new FPPTokenType("time");
  IElementType TOPOLOGY = new FPPTokenType("topology");
  IElementType TRUE = new FPPTokenType("true");
  IElementType TYPE = new FPPTokenType("type");
  IElementType U16 = new FPPTokenType("U16");
  IElementType U32 = new FPPTokenType("U32");
  IElementType U64 = new FPPTokenType("U64");
  IElementType U8 = new FPPTokenType("U8");
  IElementType UNMATCHED = new FPPTokenType("unmatched");
  IElementType UPDATE = new FPPTokenType("update");
  IElementType WARNING = new FPPTokenType("warning");
  IElementType WITH = new FPPTokenType("with");
  IElementType YELLOW = new FPPTokenType("yellow");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARITHMETIC_EXPRESSION) {
        return new FPPArithmeticExpressionImpl(node);
      }
      else if (type == ARITHMETIC_EXPRESSION_FACTOR) {
        return new FPPArithmeticExpressionFactorImpl(node);
      }
      else if (type == ARITHMETIC_EXPRESSION_PRIMARY) {
        return new FPPArithmeticExpressionPrimaryImpl(node);
      }
      else if (type == ARITHMETIC_EXPRESSION_TERM) {
        return new FPPArithmeticExpressionTermImpl(node);
      }
      else if (type == COMMAND_KIND) {
        return new FPPCommandKindImpl(node);
      }
      else if (type == COMMAND_SPECIFIER) {
        return new FPPCommandSpecifierImpl(node);
      }
      else if (type == COMPONENT_DEFINITION) {
        return new FPPComponentDefinitionImpl(node);
      }
      else if (type == COMPONENT_KIND) {
        return new FPPComponentKindImpl(node);
      }
      else if (type == COMPONENT_MEMBER) {
        return new FPPComponentMemberImpl(node);
      }
      else if (type == COMPONENT_MEMBER_SEQUENCE) {
        return new FPPComponentMemberSequenceImpl(node);
      }
      else if (type == EVENT_SEVERITY) {
        return new FPPEventSeverityImpl(node);
      }
      else if (type == EVENT_SPECIFIER) {
        return new FPPEventSpecifierImpl(node);
      }
      else if (type == EXPRESSION) {
        return new FPPExpressionImpl(node);
      }
      else if (type == FLOATING_POINT_TYPE_NAME) {
        return new FPPFloatingPointTypeNameImpl(node);
      }
      else if (type == FORMAL_PARAMETER) {
        return new FPPFormalParameterImpl(node);
      }
      else if (type == GENERAL_PORT_KIND) {
        return new FPPGeneralPortKindImpl(node);
      }
      else if (type == MODULE_DEFINITION) {
        return new FPPModuleDefinitionImpl(node);
      }
      else if (type == MODULE_MEMBER) {
        return new FPPModuleMemberImpl(node);
      }
      else if (type == MODULE_MEMBER_SEQUENCE) {
        return new FPPModuleMemberSequenceImpl(node);
      }
      else if (type == PARAM_LIST) {
        return new FPPParamListImpl(node);
      }
      else if (type == PORT_DEFINITION) {
        return new FPPPortDefinitionImpl(node);
      }
      else if (type == PORT_INSTANCE_SPECIFIER) {
        return new FPPPortInstanceSpecifierImpl(node);
      }
      else if (type == PORT_INSTANCE_TYPE) {
        return new FPPPortInstanceTypeImpl(node);
      }
      else if (type == PRIMITIVE_INTEGER_TYPE_NAME) {
        return new FPPPrimitiveIntegerTypeNameImpl(node);
      }
      else if (type == QUALIFIED_IDENTIFIER) {
        return new FPPQualifiedIdentifierImpl(node);
      }
      else if (type == QUALIFIED_IDENTIFIER_TYPE_NAME) {
        return new FPPQualifiedIdentifierTypeNameImpl(node);
      }
      else if (type == QUEUE_FULL_BEHAVIOR) {
        return new FPPQueueFullBehaviorImpl(node);
      }
      else if (type == SPECIAL_PORT_INPUT_KIND) {
        return new FPPSpecialPortInputKindImpl(node);
      }
      else if (type == SPECIAL_PORT_KIND) {
        return new FPPSpecialPortKindImpl(node);
      }
      else if (type == STRING_TYPE_NAME) {
        return new FPPStringTypeNameImpl(node);
      }
      else if (type == TELEMETRY_CHANNEL_SPECIFIER) {
        return new FPPTelemetryChannelSpecifierImpl(node);
      }
      else if (type == TELEMETRY_LIMIT) {
        return new FPPTelemetryLimitImpl(node);
      }
      else if (type == TELEMETRY_LIMIT_SEQUENCE) {
        return new FPPTelemetryLimitSequenceImpl(node);
      }
      else if (type == TELEMETRY_UPDATE) {
        return new FPPTelemetryUpdateImpl(node);
      }
      else if (type == TRANSLATION_UNIT) {
        return new FPPTranslationUnitImpl(node);
      }
      else if (type == TRANSLATION_UNIT_MEMBER) {
        return new FPPTranslationUnitMemberImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new FPPTypeNameImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
