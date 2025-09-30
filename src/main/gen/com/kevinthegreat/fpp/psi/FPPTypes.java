// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.kevinthegreat.fpp.psi.impl.*;

public interface FPPTypes {

  IElementType ABSTRACT_TYPE_DEFINITION = new FPPElementType("ABSTRACT_TYPE_DEFINITION");
  IElementType ACTION_DEFINITION = new FPPElementType("ACTION_DEFINITION");
  IElementType ACTION_SEQUENCE = new FPPElementType("ACTION_SEQUENCE");
  IElementType ALIAS_TYPE_DEFINITION = new FPPElementType("ALIAS_TYPE_DEFINITION");
  IElementType ARITHMETIC_EXPRESSION = new FPPElementType("ARITHMETIC_EXPRESSION");
  IElementType ARITHMETIC_EXPRESSION_MULTIPLICATIVE = new FPPElementType("ARITHMETIC_EXPRESSION_MULTIPLICATIVE");
  IElementType ARITHMETIC_EXPRESSION_UNARY = new FPPElementType("ARITHMETIC_EXPRESSION_UNARY");
  IElementType ARRAY_DEFINITION = new FPPElementType("ARRAY_DEFINITION");
  IElementType ARRAY_ELEMENT_SEQUENCE = new FPPElementType("ARRAY_ELEMENT_SEQUENCE");
  IElementType ARRAY_EXPRESSION = new FPPElementType("ARRAY_EXPRESSION");
  IElementType BOOLEAN_LITERAL = new FPPElementType("BOOLEAN_LITERAL");
  IElementType CHOICE_DEFINITION = new FPPElementType("CHOICE_DEFINITION");
  IElementType COMMAND_KIND = new FPPElementType("COMMAND_KIND");
  IElementType COMMAND_SPECIFIER = new FPPElementType("COMMAND_SPECIFIER");
  IElementType COMPONENT_DEFINITION = new FPPElementType("COMPONENT_DEFINITION");
  IElementType COMPONENT_INSTANCE_DEFINITION = new FPPElementType("COMPONENT_INSTANCE_DEFINITION");
  IElementType COMPONENT_INSTANCE_LOCATION_SPECIFIER = new FPPElementType("COMPONENT_INSTANCE_LOCATION_SPECIFIER");
  IElementType COMPONENT_INSTANCE_SPECIFIER = new FPPElementType("COMPONENT_INSTANCE_SPECIFIER");
  IElementType COMPONENT_KIND = new FPPElementType("COMPONENT_KIND");
  IElementType COMPONENT_LOCATION_SPECIFIER = new FPPElementType("COMPONENT_LOCATION_SPECIFIER");
  IElementType COMPONENT_MEMBER = new FPPElementType("COMPONENT_MEMBER");
  IElementType COMPONENT_MEMBER_SEQUENCE = new FPPElementType("COMPONENT_MEMBER_SEQUENCE");
  IElementType CONNECTION = new FPPElementType("CONNECTION");
  IElementType CONNECTION_GRAPH_SPECIFIER = new FPPElementType("CONNECTION_GRAPH_SPECIFIER");
  IElementType CONNECTION_SEQUENCE = new FPPElementType("CONNECTION_SEQUENCE");
  IElementType CONSTANT_DEFINITION = new FPPElementType("CONSTANT_DEFINITION");
  IElementType CONSTANT_LOCATION_SPECIFIER = new FPPElementType("CONSTANT_LOCATION_SPECIFIER");
  IElementType CONTAINER_SPECIFIER = new FPPElementType("CONTAINER_SPECIFIER");
  IElementType DIRECT_GRAPH_SPECIFIER = new FPPElementType("DIRECT_GRAPH_SPECIFIER");
  IElementType DO_EXPRESSION = new FPPElementType("DO_EXPRESSION");
  IElementType ENUM_CONSTANT = new FPPElementType("ENUM_CONSTANT");
  IElementType ENUM_CONSTANT_SEQUENCE = new FPPElementType("ENUM_CONSTANT_SEQUENCE");
  IElementType ENUM_DEFINITION = new FPPElementType("ENUM_DEFINITION");
  IElementType EVENT_SEVERITY = new FPPElementType("EVENT_SEVERITY");
  IElementType EVENT_SPECIFIER = new FPPElementType("EVENT_SPECIFIER");
  IElementType EXPRESSION = new FPPElementType("EXPRESSION");
  IElementType EXPRESSION_POSTFIX = new FPPElementType("EXPRESSION_POSTFIX");
  IElementType EXPRESSION_POSTFIX_OPERATIONS = new FPPElementType("EXPRESSION_POSTFIX_OPERATIONS");
  IElementType EXPRESSION_PRIMARY = new FPPElementType("EXPRESSION_PRIMARY");
  IElementType FLOATING_POINT_TYPE_NAME = new FPPElementType("FLOATING_POINT_TYPE_NAME");
  IElementType FORMAL_PARAMETER = new FPPElementType("FORMAL_PARAMETER");
  IElementType GENERAL_PORT_KIND = new FPPElementType("GENERAL_PORT_KIND");
  IElementType GUARD_DEFINITION = new FPPElementType("GUARD_DEFINITION");
  IElementType INCLUDE_SPECIFIER = new FPPElementType("INCLUDE_SPECIFIER");
  IElementType INITIAL_TRANSITION_SPECIFIER = new FPPElementType("INITIAL_TRANSITION_SPECIFIER");
  IElementType INIT_SPECIFIER = new FPPElementType("INIT_SPECIFIER");
  IElementType INIT_SPECIFIER_SEQUENCE = new FPPElementType("INIT_SPECIFIER_SEQUENCE");
  IElementType INSTANCE_SEQUENCE = new FPPElementType("INSTANCE_SEQUENCE");
  IElementType INTERFACE_IMPORT_SPECIFIER = new FPPElementType("INTERFACE_IMPORT_SPECIFIER");
  IElementType INTERNAL_PORT_SPECIFIER = new FPPElementType("INTERNAL_PORT_SPECIFIER");
  IElementType LOCATION_SPECIFIER = new FPPElementType("LOCATION_SPECIFIER");
  IElementType MODULE_DEFINITION = new FPPElementType("MODULE_DEFINITION");
  IElementType MODULE_MEMBER = new FPPElementType("MODULE_MEMBER");
  IElementType MODULE_MEMBER_SEQUENCE = new FPPElementType("MODULE_MEMBER_SEQUENCE");
  IElementType NON_ANNOTATABLE_INCLUDE_SPECIFIER = new FPPElementType("NON_ANNOTATABLE_INCLUDE_SPECIFIER");
  IElementType PARAMETER_SPECIFIER = new FPPElementType("PARAMETER_SPECIFIER");
  IElementType PARAM_LIST = new FPPElementType("PARAM_LIST");
  IElementType PATTERN_GRAPH_SPECIFIER = new FPPElementType("PATTERN_GRAPH_SPECIFIER");
  IElementType PATTERN_KIND = new FPPElementType("PATTERN_KIND");
  IElementType PORT_DEFINITION = new FPPElementType("PORT_DEFINITION");
  IElementType PORT_INSTANCE_IDENTIFIER = new FPPElementType("PORT_INSTANCE_IDENTIFIER");
  IElementType PORT_INSTANCE_SPECIFIER = new FPPElementType("PORT_INSTANCE_SPECIFIER");
  IElementType PORT_INSTANCE_TYPE = new FPPElementType("PORT_INSTANCE_TYPE");
  IElementType PORT_INTERFACE_DEFINITION = new FPPElementType("PORT_INTERFACE_DEFINITION");
  IElementType PORT_INTERFACE_MEMBER = new FPPElementType("PORT_INTERFACE_MEMBER");
  IElementType PORT_INTERFACE_MEMBER_SEQUENCE = new FPPElementType("PORT_INTERFACE_MEMBER_SEQUENCE");
  IElementType PORT_LOCATION_SPECIFIER = new FPPElementType("PORT_LOCATION_SPECIFIER");
  IElementType PORT_MATCHING_SPECIFIER = new FPPElementType("PORT_MATCHING_SPECIFIER");
  IElementType PRIMITIVE_INTEGER_TYPE_NAME = new FPPElementType("PRIMITIVE_INTEGER_TYPE_NAME");
  IElementType QUALIFIED_IDENTIFIER = new FPPElementType("QUALIFIED_IDENTIFIER");
  IElementType QUALIFIED_IDENTIFIER_TYPE_NAME = new FPPElementType("QUALIFIED_IDENTIFIER_TYPE_NAME");
  IElementType QUEUE_FULL_BEHAVIOR = new FPPElementType("QUEUE_FULL_BEHAVIOR");
  IElementType RECORD_SPECIFIER = new FPPElementType("RECORD_SPECIFIER");
  IElementType SIGNAL_DEFINITION = new FPPElementType("SIGNAL_DEFINITION");
  IElementType SPECIAL_PORT_INPUT_KIND = new FPPElementType("SPECIAL_PORT_INPUT_KIND");
  IElementType SPECIAL_PORT_KIND = new FPPElementType("SPECIAL_PORT_KIND");
  IElementType STATE_DEFINITION = new FPPElementType("STATE_DEFINITION");
  IElementType STATE_DEFINITION_MEMBER = new FPPElementType("STATE_DEFINITION_MEMBER");
  IElementType STATE_DEFINITION_MEMBER_SEQUENCE = new FPPElementType("STATE_DEFINITION_MEMBER_SEQUENCE");
  IElementType STATE_ENTRY_SPECIFIER = new FPPElementType("STATE_ENTRY_SPECIFIER");
  IElementType STATE_EXIT_SPECIFIER = new FPPElementType("STATE_EXIT_SPECIFIER");
  IElementType STATE_MACHINE_DEFINITION = new FPPElementType("STATE_MACHINE_DEFINITION");
  IElementType STATE_MACHINE_INSTANCE_SPECIFIER = new FPPElementType("STATE_MACHINE_INSTANCE_SPECIFIER");
  IElementType STATE_MACHINE_LOCATION_SPECIFIER = new FPPElementType("STATE_MACHINE_LOCATION_SPECIFIER");
  IElementType STATE_MACHINE_MEMBER = new FPPElementType("STATE_MACHINE_MEMBER");
  IElementType STATE_MACHINE_MEMBER_SEQUENCE = new FPPElementType("STATE_MACHINE_MEMBER_SEQUENCE");
  IElementType STATE_TRANSITION_SPECIFIER = new FPPElementType("STATE_TRANSITION_SPECIFIER");
  IElementType STRING_TYPE_NAME = new FPPElementType("STRING_TYPE_NAME");
  IElementType STRUCT_DEFINITION = new FPPElementType("STRUCT_DEFINITION");
  IElementType STRUCT_ELEMENT = new FPPElementType("STRUCT_ELEMENT");
  IElementType STRUCT_ELEMENT_SEQUENCE = new FPPElementType("STRUCT_ELEMENT_SEQUENCE");
  IElementType STRUCT_EXPRESSION = new FPPElementType("STRUCT_EXPRESSION");
  IElementType STRUCT_TYPE_MEMBER = new FPPElementType("STRUCT_TYPE_MEMBER");
  IElementType STRUCT_TYPE_MEMBER_SEQUENCE = new FPPElementType("STRUCT_TYPE_MEMBER_SEQUENCE");
  IElementType TELEMETRY_CHANNEL_IDENTIFIER = new FPPElementType("TELEMETRY_CHANNEL_IDENTIFIER");
  IElementType TELEMETRY_CHANNEL_IDENTIFIER_SEQUENCE = new FPPElementType("TELEMETRY_CHANNEL_IDENTIFIER_SEQUENCE");
  IElementType TELEMETRY_CHANNEL_SPECIFIER = new FPPElementType("TELEMETRY_CHANNEL_SPECIFIER");
  IElementType TELEMETRY_LIMIT = new FPPElementType("TELEMETRY_LIMIT");
  IElementType TELEMETRY_LIMIT_SEQUENCE = new FPPElementType("TELEMETRY_LIMIT_SEQUENCE");
  IElementType TELEMETRY_PACKET_GROUP_MEMBER = new FPPElementType("TELEMETRY_PACKET_GROUP_MEMBER");
  IElementType TELEMETRY_PACKET_GROUP_MEMBER_SEQUENCE = new FPPElementType("TELEMETRY_PACKET_GROUP_MEMBER_SEQUENCE");
  IElementType TELEMETRY_PACKET_MEMBER = new FPPElementType("TELEMETRY_PACKET_MEMBER");
  IElementType TELEMETRY_PACKET_MEMBER_SEQUENCE = new FPPElementType("TELEMETRY_PACKET_MEMBER_SEQUENCE");
  IElementType TELEMETRY_PACKET_SET_SPECIFIER = new FPPElementType("TELEMETRY_PACKET_SET_SPECIFIER");
  IElementType TELEMETRY_PACKET_SPECIFIER = new FPPElementType("TELEMETRY_PACKET_SPECIFIER");
  IElementType TELEMETRY_UPDATE = new FPPElementType("TELEMETRY_UPDATE");
  IElementType TOPOLOGY_DEFINITION = new FPPElementType("TOPOLOGY_DEFINITION");
  IElementType TOPOLOGY_IMPORT_SPECIFIER = new FPPElementType("TOPOLOGY_IMPORT_SPECIFIER");
  IElementType TOPOLOGY_LOCATION_SPECIFIER = new FPPElementType("TOPOLOGY_LOCATION_SPECIFIER");
  IElementType TOPOLOGY_MEMBER = new FPPElementType("TOPOLOGY_MEMBER");
  IElementType TOPOLOGY_MEMBER_SEQUENCE = new FPPElementType("TOPOLOGY_MEMBER_SEQUENCE");
  IElementType TRANSITION_EXPRESSION = new FPPElementType("TRANSITION_EXPRESSION");
  IElementType TRANSITION_OR_DO = new FPPElementType("TRANSITION_OR_DO");
  IElementType TRANSLATION_UNIT = new FPPElementType("TRANSLATION_UNIT");
  IElementType TRANSLATION_UNIT_MEMBER = new FPPElementType("TRANSLATION_UNIT_MEMBER");
  IElementType TYPE_LOCATION_SPECIFIER = new FPPElementType("TYPE_LOCATION_SPECIFIER");
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
      if (type == ABSTRACT_TYPE_DEFINITION) {
        return new FPPAbstractTypeDefinitionImpl(node);
      }
      else if (type == ACTION_DEFINITION) {
        return new FPPActionDefinitionImpl(node);
      }
      else if (type == ACTION_SEQUENCE) {
        return new FPPActionSequenceImpl(node);
      }
      else if (type == ALIAS_TYPE_DEFINITION) {
        return new FPPAliasTypeDefinitionImpl(node);
      }
      else if (type == ARITHMETIC_EXPRESSION) {
        return new FPPArithmeticExpressionImpl(node);
      }
      else if (type == ARITHMETIC_EXPRESSION_MULTIPLICATIVE) {
        return new FPPArithmeticExpressionMultiplicativeImpl(node);
      }
      else if (type == ARITHMETIC_EXPRESSION_UNARY) {
        return new FPPArithmeticExpressionUnaryImpl(node);
      }
      else if (type == ARRAY_DEFINITION) {
        return new FPPArrayDefinitionImpl(node);
      }
      else if (type == ARRAY_ELEMENT_SEQUENCE) {
        return new FPPArrayElementSequenceImpl(node);
      }
      else if (type == ARRAY_EXPRESSION) {
        return new FPPArrayExpressionImpl(node);
      }
      else if (type == BOOLEAN_LITERAL) {
        return new FPPBooleanLiteralImpl(node);
      }
      else if (type == CHOICE_DEFINITION) {
        return new FPPChoiceDefinitionImpl(node);
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
      else if (type == COMPONENT_INSTANCE_DEFINITION) {
        return new FPPComponentInstanceDefinitionImpl(node);
      }
      else if (type == COMPONENT_INSTANCE_LOCATION_SPECIFIER) {
        return new FPPComponentInstanceLocationSpecifierImpl(node);
      }
      else if (type == COMPONENT_INSTANCE_SPECIFIER) {
        return new FPPComponentInstanceSpecifierImpl(node);
      }
      else if (type == COMPONENT_KIND) {
        return new FPPComponentKindImpl(node);
      }
      else if (type == COMPONENT_LOCATION_SPECIFIER) {
        return new FPPComponentLocationSpecifierImpl(node);
      }
      else if (type == COMPONENT_MEMBER) {
        return new FPPComponentMemberImpl(node);
      }
      else if (type == COMPONENT_MEMBER_SEQUENCE) {
        return new FPPComponentMemberSequenceImpl(node);
      }
      else if (type == CONNECTION) {
        return new FPPConnectionImpl(node);
      }
      else if (type == CONNECTION_GRAPH_SPECIFIER) {
        return new FPPConnectionGraphSpecifierImpl(node);
      }
      else if (type == CONNECTION_SEQUENCE) {
        return new FPPConnectionSequenceImpl(node);
      }
      else if (type == CONSTANT_DEFINITION) {
        return new FPPConstantDefinitionImpl(node);
      }
      else if (type == CONSTANT_LOCATION_SPECIFIER) {
        return new FPPConstantLocationSpecifierImpl(node);
      }
      else if (type == CONTAINER_SPECIFIER) {
        return new FPPContainerSpecifierImpl(node);
      }
      else if (type == DIRECT_GRAPH_SPECIFIER) {
        return new FPPDirectGraphSpecifierImpl(node);
      }
      else if (type == DO_EXPRESSION) {
        return new FPPDoExpressionImpl(node);
      }
      else if (type == ENUM_CONSTANT) {
        return new FPPEnumConstantImpl(node);
      }
      else if (type == ENUM_CONSTANT_SEQUENCE) {
        return new FPPEnumConstantSequenceImpl(node);
      }
      else if (type == ENUM_DEFINITION) {
        return new FPPEnumDefinitionImpl(node);
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
      else if (type == EXPRESSION_POSTFIX) {
        return new FPPExpressionPostfixImpl(node);
      }
      else if (type == EXPRESSION_POSTFIX_OPERATIONS) {
        return new FPPExpressionPostfixOperationsImpl(node);
      }
      else if (type == EXPRESSION_PRIMARY) {
        return new FPPExpressionPrimaryImpl(node);
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
      else if (type == GUARD_DEFINITION) {
        return new FPPGuardDefinitionImpl(node);
      }
      else if (type == INCLUDE_SPECIFIER) {
        return new FPPIncludeSpecifierImpl(node);
      }
      else if (type == INITIAL_TRANSITION_SPECIFIER) {
        return new FPPInitialTransitionSpecifierImpl(node);
      }
      else if (type == INIT_SPECIFIER) {
        return new FPPInitSpecifierImpl(node);
      }
      else if (type == INIT_SPECIFIER_SEQUENCE) {
        return new FPPInitSpecifierSequenceImpl(node);
      }
      else if (type == INSTANCE_SEQUENCE) {
        return new FPPInstanceSequenceImpl(node);
      }
      else if (type == INTERFACE_IMPORT_SPECIFIER) {
        return new FPPInterfaceImportSpecifierImpl(node);
      }
      else if (type == INTERNAL_PORT_SPECIFIER) {
        return new FPPInternalPortSpecifierImpl(node);
      }
      else if (type == LOCATION_SPECIFIER) {
        return new FPPLocationSpecifierImpl(node);
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
      else if (type == NON_ANNOTATABLE_INCLUDE_SPECIFIER) {
        return new FPPNonAnnotatableIncludeSpecifierImpl(node);
      }
      else if (type == PARAMETER_SPECIFIER) {
        return new FPPParameterSpecifierImpl(node);
      }
      else if (type == PARAM_LIST) {
        return new FPPParamListImpl(node);
      }
      else if (type == PATTERN_GRAPH_SPECIFIER) {
        return new FPPPatternGraphSpecifierImpl(node);
      }
      else if (type == PATTERN_KIND) {
        return new FPPPatternKindImpl(node);
      }
      else if (type == PORT_DEFINITION) {
        return new FPPPortDefinitionImpl(node);
      }
      else if (type == PORT_INSTANCE_IDENTIFIER) {
        return new FPPPortInstanceIdentifierImpl(node);
      }
      else if (type == PORT_INSTANCE_SPECIFIER) {
        return new FPPPortInstanceSpecifierImpl(node);
      }
      else if (type == PORT_INSTANCE_TYPE) {
        return new FPPPortInstanceTypeImpl(node);
      }
      else if (type == PORT_INTERFACE_DEFINITION) {
        return new FPPPortInterfaceDefinitionImpl(node);
      }
      else if (type == PORT_INTERFACE_MEMBER) {
        return new FPPPortInterfaceMemberImpl(node);
      }
      else if (type == PORT_INTERFACE_MEMBER_SEQUENCE) {
        return new FPPPortInterfaceMemberSequenceImpl(node);
      }
      else if (type == PORT_LOCATION_SPECIFIER) {
        return new FPPPortLocationSpecifierImpl(node);
      }
      else if (type == PORT_MATCHING_SPECIFIER) {
        return new FPPPortMatchingSpecifierImpl(node);
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
      else if (type == RECORD_SPECIFIER) {
        return new FPPRecordSpecifierImpl(node);
      }
      else if (type == SIGNAL_DEFINITION) {
        return new FPPSignalDefinitionImpl(node);
      }
      else if (type == SPECIAL_PORT_INPUT_KIND) {
        return new FPPSpecialPortInputKindImpl(node);
      }
      else if (type == SPECIAL_PORT_KIND) {
        return new FPPSpecialPortKindImpl(node);
      }
      else if (type == STATE_DEFINITION) {
        return new FPPStateDefinitionImpl(node);
      }
      else if (type == STATE_DEFINITION_MEMBER) {
        return new FPPStateDefinitionMemberImpl(node);
      }
      else if (type == STATE_DEFINITION_MEMBER_SEQUENCE) {
        return new FPPStateDefinitionMemberSequenceImpl(node);
      }
      else if (type == STATE_ENTRY_SPECIFIER) {
        return new FPPStateEntrySpecifierImpl(node);
      }
      else if (type == STATE_EXIT_SPECIFIER) {
        return new FPPStateExitSpecifierImpl(node);
      }
      else if (type == STATE_MACHINE_DEFINITION) {
        return new FPPStateMachineDefinitionImpl(node);
      }
      else if (type == STATE_MACHINE_INSTANCE_SPECIFIER) {
        return new FPPStateMachineInstanceSpecifierImpl(node);
      }
      else if (type == STATE_MACHINE_LOCATION_SPECIFIER) {
        return new FPPStateMachineLocationSpecifierImpl(node);
      }
      else if (type == STATE_MACHINE_MEMBER) {
        return new FPPStateMachineMemberImpl(node);
      }
      else if (type == STATE_MACHINE_MEMBER_SEQUENCE) {
        return new FPPStateMachineMemberSequenceImpl(node);
      }
      else if (type == STATE_TRANSITION_SPECIFIER) {
        return new FPPStateTransitionSpecifierImpl(node);
      }
      else if (type == STRING_TYPE_NAME) {
        return new FPPStringTypeNameImpl(node);
      }
      else if (type == STRUCT_DEFINITION) {
        return new FPPStructDefinitionImpl(node);
      }
      else if (type == STRUCT_ELEMENT) {
        return new FPPStructElementImpl(node);
      }
      else if (type == STRUCT_ELEMENT_SEQUENCE) {
        return new FPPStructElementSequenceImpl(node);
      }
      else if (type == STRUCT_EXPRESSION) {
        return new FPPStructExpressionImpl(node);
      }
      else if (type == STRUCT_TYPE_MEMBER) {
        return new FPPStructTypeMemberImpl(node);
      }
      else if (type == STRUCT_TYPE_MEMBER_SEQUENCE) {
        return new FPPStructTypeMemberSequenceImpl(node);
      }
      else if (type == TELEMETRY_CHANNEL_IDENTIFIER) {
        return new FPPTelemetryChannelIdentifierImpl(node);
      }
      else if (type == TELEMETRY_CHANNEL_IDENTIFIER_SEQUENCE) {
        return new FPPTelemetryChannelIdentifierSequenceImpl(node);
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
      else if (type == TELEMETRY_PACKET_GROUP_MEMBER) {
        return new FPPTelemetryPacketGroupMemberImpl(node);
      }
      else if (type == TELEMETRY_PACKET_GROUP_MEMBER_SEQUENCE) {
        return new FPPTelemetryPacketGroupMemberSequenceImpl(node);
      }
      else if (type == TELEMETRY_PACKET_MEMBER) {
        return new FPPTelemetryPacketMemberImpl(node);
      }
      else if (type == TELEMETRY_PACKET_MEMBER_SEQUENCE) {
        return new FPPTelemetryPacketMemberSequenceImpl(node);
      }
      else if (type == TELEMETRY_PACKET_SET_SPECIFIER) {
        return new FPPTelemetryPacketSetSpecifierImpl(node);
      }
      else if (type == TELEMETRY_PACKET_SPECIFIER) {
        return new FPPTelemetryPacketSpecifierImpl(node);
      }
      else if (type == TELEMETRY_UPDATE) {
        return new FPPTelemetryUpdateImpl(node);
      }
      else if (type == TOPOLOGY_DEFINITION) {
        return new FPPTopologyDefinitionImpl(node);
      }
      else if (type == TOPOLOGY_IMPORT_SPECIFIER) {
        return new FPPTopologyImportSpecifierImpl(node);
      }
      else if (type == TOPOLOGY_LOCATION_SPECIFIER) {
        return new FPPTopologyLocationSpecifierImpl(node);
      }
      else if (type == TOPOLOGY_MEMBER) {
        return new FPPTopologyMemberImpl(node);
      }
      else if (type == TOPOLOGY_MEMBER_SEQUENCE) {
        return new FPPTopologyMemberSequenceImpl(node);
      }
      else if (type == TRANSITION_EXPRESSION) {
        return new FPPTransitionExpressionImpl(node);
      }
      else if (type == TRANSITION_OR_DO) {
        return new FPPTransitionOrDoImpl(node);
      }
      else if (type == TRANSLATION_UNIT) {
        return new FPPTranslationUnitImpl(node);
      }
      else if (type == TRANSLATION_UNIT_MEMBER) {
        return new FPPTranslationUnitMemberImpl(node);
      }
      else if (type == TYPE_LOCATION_SPECIFIER) {
        return new FPPTypeLocationSpecifierImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new FPPTypeNameImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
