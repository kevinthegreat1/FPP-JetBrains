// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.kevinthegreat.fpp.psi.FPPTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FPPParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return fpp_file(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // ASYNC | GUARDED | SYNC
  public static boolean command_kind(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_kind")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMMAND_KIND, "<command kind>");
    result_ = consumeToken(builder_, ASYNC);
    if (!result_) result_ = consumeToken(builder_, GUARDED);
    if (!result_) result_ = consumeToken(builder_, SYNC);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // command_kind COMMAND IDENTIFIER [ LEFT_PAREN param_list RIGHT_PAREN ] [ OPCODE expression ] [ PRIORITY expression ] [ queue_full_behavior ]
  public static boolean command_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_specifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMMAND_SPECIFIER, "<command specifier>");
    result_ = command_kind(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMAND, IDENTIFIER);
    result_ = result_ && command_specifier_3(builder_, level_ + 1);
    result_ = result_ && command_specifier_4(builder_, level_ + 1);
    result_ = result_ && command_specifier_5(builder_, level_ + 1);
    result_ = result_ && command_specifier_6(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ LEFT_PAREN param_list RIGHT_PAREN ]
  private static boolean command_specifier_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_specifier_3")) return false;
    command_specifier_3_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_PAREN param_list RIGHT_PAREN
  private static boolean command_specifier_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_specifier_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && param_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ OPCODE expression ]
  private static boolean command_specifier_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_specifier_4")) return false;
    parseTokens(builder_, 0, OPCODE, EXPRESSION);
    return true;
  }

  // [ PRIORITY expression ]
  private static boolean command_specifier_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_specifier_5")) return false;
    parseTokens(builder_, 0, PRIORITY, EXPRESSION);
    return true;
  }

  // [ queue_full_behavior ]
  private static boolean command_specifier_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_specifier_6")) return false;
    queue_full_behavior(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // component_kind COMPONENT IDENTIFIER LEFT_BRACE component_member_sequence RIGHT_BRACE
  public static boolean component_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_definition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPONENT_DEFINITION, "<component definition>");
    result_ = component_kind(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMPONENT, IDENTIFIER, LEFT_BRACE);
    result_ = result_ && component_member_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ACTIVE | PASSIVE | QUEUED
  public static boolean component_kind(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_kind")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPONENT_KIND, "<component kind>");
    result_ = consumeToken(builder_, ACTIVE);
    if (!result_) result_ = consumeToken(builder_, PASSIVE);
    if (!result_) result_ = consumeToken(builder_, QUEUED);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // command_specifier
  public static boolean component_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPONENT_MEMBER, "<component member>");
    result_ = command_specifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (component_member (SEMICOLON | END_OF_LINE)*)*
  public static boolean component_member_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_member_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPONENT_MEMBER_SEQUENCE, "<component member sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!component_member_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "component_member_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // component_member (SEMICOLON | END_OF_LINE)*
  private static boolean component_member_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_member_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = component_member(builder_, level_ + 1);
    result_ = result_ && component_member_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SEMICOLON | END_OF_LINE)*
  private static boolean component_member_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_member_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!component_member_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "component_member_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // SEMICOLON | END_OF_LINE
  private static boolean component_member_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_member_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // F32 | F64
  public static boolean floating_point_type_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "floating_point_type_name")) return false;
    if (!nextTokenIs(builder_, "<floating point type name>", F32, F64)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FLOATING_POINT_TYPE_NAME, "<floating point type name>");
    result_ = consumeToken(builder_, F32);
    if (!result_) result_ = consumeToken(builder_, F64);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [ REF ] IDENTIFIER COLON type_name
  public static boolean formal_parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "formal_parameter")) return false;
    if (!nextTokenIs(builder_, "<formal parameter>", IDENTIFIER, REF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FORMAL_PARAMETER, "<formal parameter>");
    result_ = formal_parameter_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && type_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ REF ]
  private static boolean formal_parameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "formal_parameter_0")) return false;
    consumeToken(builder_, REF);
    return true;
  }

  /* ********************************************************** */
  // translation_unit
  static boolean fpp_file(PsiBuilder builder_, int level_) {
    return translation_unit(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // MODULE IDENTIFIER LEFT_BRACE module_member_sequence RIGHT_BRACE
  public static boolean module_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_definition")) return false;
    if (!nextTokenIs(builder_, MODULE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, MODULE, IDENTIFIER, LEFT_BRACE);
    result_ = result_ && module_member_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, MODULE_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // component_definition
  // //                 | component_instance_definition
  // //                 | constant_definition
  //                  | module_definition
  public static boolean module_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_MEMBER, "<module member>");
    result_ = component_definition(builder_, level_ + 1);
    if (!result_) result_ = module_definition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (module_member (SEMICOLON | END_OF_LINE)*)*
  public static boolean module_member_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_member_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_MEMBER_SEQUENCE, "<module member sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!module_member_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "module_member_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // module_member (SEMICOLON | END_OF_LINE)*
  private static boolean module_member_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_member_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = module_member(builder_, level_ + 1);
    result_ = result_ && module_member_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SEMICOLON | END_OF_LINE)*
  private static boolean module_member_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_member_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!module_member_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "module_member_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // SEMICOLON | END_OF_LINE
  private static boolean module_member_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_member_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // (formal_parameter (COMMA | END_OF_LINE)*)*
  public static boolean param_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "param_list")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARAM_LIST, "<param list>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!param_list_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "param_list", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // formal_parameter (COMMA | END_OF_LINE)*
  private static boolean param_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "param_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = formal_parameter(builder_, level_ + 1);
    result_ = result_ && param_list_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean param_list_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "param_list_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!param_list_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "param_list_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean param_list_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "param_list_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // U8 | U16 | U32 | U64 | I8 | I16 | I32 | I64
  public static boolean primitive_integer_type_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primitive_integer_type_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRIMITIVE_INTEGER_TYPE_NAME, "<primitive integer type name>");
    result_ = consumeToken(builder_, U8);
    if (!result_) result_ = consumeToken(builder_, U16);
    if (!result_) result_ = consumeToken(builder_, U32);
    if (!result_) result_ = consumeToken(builder_, U64);
    if (!result_) result_ = consumeToken(builder_, I8);
    if (!result_) result_ = consumeToken(builder_, I16);
    if (!result_) result_ = consumeToken(builder_, I32);
    if (!result_) result_ = consumeToken(builder_, I64);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER (DOT IDENTIFIER)*
  public static boolean qualified_identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && qualified_identifier_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER, result_);
    return result_;
  }

  // (DOT IDENTIFIER)*
  private static boolean qualified_identifier_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!qualified_identifier_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "qualified_identifier_1", pos_)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean qualified_identifier_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualified_identifier
  public static boolean qualified_identifier_type_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_type_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER_TYPE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // ASSERT | BLOCK | DROP | HOOK
  public static boolean queue_full_behavior(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "queue_full_behavior")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, QUEUE_FULL_BEHAVIOR, "<queue full behavior>");
    result_ = consumeToken(builder_, ASSERT);
    if (!result_) result_ = consumeToken(builder_, BLOCK);
    if (!result_) result_ = consumeToken(builder_, DROP);
    if (!result_) result_ = consumeToken(builder_, HOOK);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // STRING [ SIZE expression ]
  public static boolean string_type_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_type_name")) return false;
    if (!nextTokenIs(builder_, STRING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING);
    result_ = result_ && string_type_name_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, STRING_TYPE_NAME, result_);
    return result_;
  }

  // [ SIZE expression ]
  private static boolean string_type_name_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_type_name_1")) return false;
    parseTokens(builder_, 0, SIZE, EXPRESSION);
    return true;
  }

  /* ********************************************************** */
  // (translation_unit_member (SEMICOLON | END_OF_LINE)*)*
  public static boolean translation_unit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "translation_unit")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TRANSLATION_UNIT, "<translation unit>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!translation_unit_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "translation_unit", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // translation_unit_member (SEMICOLON | END_OF_LINE)*
  private static boolean translation_unit_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "translation_unit_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = translation_unit_member(builder_, level_ + 1);
    result_ = result_ && translation_unit_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SEMICOLON | END_OF_LINE)*
  private static boolean translation_unit_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "translation_unit_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!translation_unit_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "translation_unit_0_1", pos_)) break;
    }
    return true;
  }

  // SEMICOLON | END_OF_LINE
  private static boolean translation_unit_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "translation_unit_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // module_member
  public static boolean translation_unit_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "translation_unit_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TRANSLATION_UNIT_MEMBER, "<translation unit member>");
    result_ = module_member(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // primitive_integer_type_name
  //               | floating_point_type_name
  //               | BOOL
  //               | string_type_name
  //               | qualified_identifier_type_name
  public static boolean type_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_NAME, "<type name>");
    result_ = primitive_integer_type_name(builder_, level_ + 1);
    if (!result_) result_ = floating_point_type_name(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, BOOL);
    if (!result_) result_ = string_type_name(builder_, level_ + 1);
    if (!result_) result_ = qualified_identifier_type_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

}
