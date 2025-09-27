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
  // arithmetic_expression_term ( ( ADD | SUB ) arithmetic_expression_term )*
  public static boolean arithmetic_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARITHMETIC_EXPRESSION, "<arithmetic expression>");
    result_ = arithmetic_expression_term(builder_, level_ + 1);
    result_ = result_ && arithmetic_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( ( ADD | SUB ) arithmetic_expression_term )*
  private static boolean arithmetic_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!arithmetic_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arithmetic_expression_1", pos_)) break;
    }
    return true;
  }

  // ( ADD | SUB ) arithmetic_expression_term
  private static boolean arithmetic_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = arithmetic_expression_1_0_0(builder_, level_ + 1);
    result_ = result_ && arithmetic_expression_term(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ADD | SUB
  private static boolean arithmetic_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, ADD);
    if (!result_) result_ = consumeToken(builder_, SUB);
    return result_;
  }

  /* ********************************************************** */
  // SUB arithmetic_expression_factor
  //                                 | arithmetic_expression_primary
  public static boolean arithmetic_expression_factor(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_factor")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARITHMETIC_EXPRESSION_FACTOR, "<arithmetic expression factor>");
    result_ = arithmetic_expression_factor_0(builder_, level_ + 1);
    if (!result_) result_ = arithmetic_expression_primary(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // SUB arithmetic_expression_factor
  private static boolean arithmetic_expression_factor_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_factor_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SUB);
    result_ = result_ && arithmetic_expression_factor(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL
  //                                 | FLOATING_POINT_LITERAL
  //                                 | qualified_identifier
  //                                 | LEFT_PAREN expression RIGHT_PAREN
  public static boolean arithmetic_expression_primary(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_primary")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARITHMETIC_EXPRESSION_PRIMARY, "<arithmetic expression primary>");
    result_ = consumeToken(builder_, INTEGER_LITERAL);
    if (!result_) result_ = consumeToken(builder_, FLOATING_POINT_LITERAL);
    if (!result_) result_ = qualified_identifier(builder_, level_ + 1);
    if (!result_) result_ = arithmetic_expression_primary_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LEFT_PAREN expression RIGHT_PAREN
  private static boolean arithmetic_expression_primary_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_primary_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // arithmetic_expression_factor ( ( MUL | DIV ) arithmetic_expression_factor )*
  public static boolean arithmetic_expression_term(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_term")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARITHMETIC_EXPRESSION_TERM, "<arithmetic expression term>");
    result_ = arithmetic_expression_factor(builder_, level_ + 1);
    result_ = result_ && arithmetic_expression_term_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( ( MUL | DIV ) arithmetic_expression_factor )*
  private static boolean arithmetic_expression_term_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_term_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!arithmetic_expression_term_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arithmetic_expression_term_1", pos_)) break;
    }
    return true;
  }

  // ( MUL | DIV ) arithmetic_expression_factor
  private static boolean arithmetic_expression_term_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_term_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = arithmetic_expression_term_1_0_0(builder_, level_ + 1);
    result_ = result_ && arithmetic_expression_factor(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MUL | DIV
  private static boolean arithmetic_expression_term_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_term_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, MUL);
    if (!result_) result_ = consumeToken(builder_, DIV);
    return result_;
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
    command_specifier_4_0(builder_, level_ + 1);
    return true;
  }

  // OPCODE expression
  private static boolean command_specifier_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_specifier_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPCODE);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ PRIORITY expression ]
  private static boolean command_specifier_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_specifier_5")) return false;
    command_specifier_5_0(builder_, level_ + 1);
    return true;
  }

  // PRIORITY expression
  private static boolean command_specifier_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_specifier_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PRIORITY);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
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
  // //component_member ::= constant_definition
  // //                  | state_machine_definition
  // //                  | struct_definition
  // //                  | command_specifier
  // //                  | container_specifier
  // //                  | parameter_specifier
  //                   | port_instance_specifier
  // //                  | record_specifier
  // //                  | state_machine_instance_specifier
  //                   | telemetry_channel_specifier
  // //                  | abstract_type_definition
  // //                  | alias_type_definition
  // //                  | array_definition
  // //                  | enum_definition
  //                   | event_specifier
  public static boolean component_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPONENT_MEMBER, "<component member>");
    result_ = command_specifier(builder_, level_ + 1);
    if (!result_) result_ = port_instance_specifier(builder_, level_ + 1);
    if (!result_) result_ = telemetry_channel_specifier(builder_, level_ + 1);
    if (!result_) result_ = event_specifier(builder_, level_ + 1);
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
  // ACTIVITY HIGH
  //             | ACTIVITY LOW
  //             | COMMAND
  //             | DIAGNOSTIC
  //             | FATAL
  //             | WARNING HIGH
  //             | WARNING LOW
  public static boolean event_severity(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "event_severity")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EVENT_SEVERITY, "<event severity>");
    result_ = parseTokens(builder_, 0, ACTIVITY, HIGH);
    if (!result_) result_ = parseTokens(builder_, 0, ACTIVITY, LOW);
    if (!result_) result_ = consumeToken(builder_, COMMAND);
    if (!result_) result_ = consumeToken(builder_, DIAGNOSTIC);
    if (!result_) result_ = consumeToken(builder_, FATAL);
    if (!result_) result_ = parseTokens(builder_, 0, WARNING, HIGH);
    if (!result_) result_ = parseTokens(builder_, 0, WARNING, LOW);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // EVENT IDENTIFIER [ LEFT_PAREN param_list RIGHT_PAREN ] SEVERITY event_severity [ ID expression ] FORMAT STRING_LITERAL [ THROTTLE expression ]
  public static boolean event_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "event_specifier")) return false;
    if (!nextTokenIs(builder_, EVENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EVENT, IDENTIFIER);
    result_ = result_ && event_specifier_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEVERITY);
    result_ = result_ && event_severity(builder_, level_ + 1);
    result_ = result_ && event_specifier_5(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, FORMAT, STRING_LITERAL);
    result_ = result_ && event_specifier_8(builder_, level_ + 1);
    exit_section_(builder_, marker_, EVENT_SPECIFIER, result_);
    return result_;
  }

  // [ LEFT_PAREN param_list RIGHT_PAREN ]
  private static boolean event_specifier_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "event_specifier_2")) return false;
    event_specifier_2_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_PAREN param_list RIGHT_PAREN
  private static boolean event_specifier_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "event_specifier_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && param_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ID expression ]
  private static boolean event_specifier_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "event_specifier_5")) return false;
    event_specifier_5_0(builder_, level_ + 1);
    return true;
  }

  // ID expression
  private static boolean event_specifier_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "event_specifier_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ THROTTLE expression ]
  private static boolean event_specifier_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "event_specifier_8")) return false;
    event_specifier_8_0(builder_, level_ + 1);
    return true;
  }

  // THROTTLE expression
  private static boolean event_specifier_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "event_specifier_8_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THROTTLE);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // arithmetic_expression
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = arithmetic_expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
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
  // ASYNC INPUT
  //                         | GUARDED INPUT
  //                         | OUTPUT
  //                         | SYNC INPUT
  public static boolean general_port_kind(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_port_kind")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GENERAL_PORT_KIND, "<general port kind>");
    result_ = parseTokens(builder_, 0, ASYNC, INPUT);
    if (!result_) result_ = parseTokens(builder_, 0, GUARDED, INPUT);
    if (!result_) result_ = consumeToken(builder_, OUTPUT);
    if (!result_) result_ = parseTokens(builder_, 0, SYNC, INPUT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
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
  //                  | port_definition
  public static boolean module_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_MEMBER, "<module member>");
    result_ = component_definition(builder_, level_ + 1);
    if (!result_) result_ = module_definition(builder_, level_ + 1);
    if (!result_) result_ = port_definition(builder_, level_ + 1);
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
  // PORT IDENTIFIER [ LEFT_PAREN param_list RIGHT_PAREN ] [ ARROW type_name ]
  public static boolean port_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_definition")) return false;
    if (!nextTokenIs(builder_, PORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PORT, IDENTIFIER);
    result_ = result_ && port_definition_2(builder_, level_ + 1);
    result_ = result_ && port_definition_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, PORT_DEFINITION, result_);
    return result_;
  }

  // [ LEFT_PAREN param_list RIGHT_PAREN ]
  private static boolean port_definition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_definition_2")) return false;
    port_definition_2_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_PAREN param_list RIGHT_PAREN
  private static boolean port_definition_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_definition_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && param_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ARROW type_name ]
  private static boolean port_definition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_definition_3")) return false;
    port_definition_3_0(builder_, level_ + 1);
    return true;
  }

  // ARROW type_name
  private static boolean port_definition_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_definition_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ARROW);
    result_ = result_ && type_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // general_port_kind PORT IDENTIFIER COLON [ LEFT_BRACKET expression RIGHT_BRACKET ] port_instance_type [ PRIORITY expression ] [ queue_full_behavior ]
  //                             | [ special_port_input_kind ] special_port_kind PORT IDENTIFIER [ PRIORITY expression ] [ queue_full_behavior ]
  public static boolean port_instance_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PORT_INSTANCE_SPECIFIER, "<port instance specifier>");
    result_ = port_instance_specifier_0(builder_, level_ + 1);
    if (!result_) result_ = port_instance_specifier_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // general_port_kind PORT IDENTIFIER COLON [ LEFT_BRACKET expression RIGHT_BRACKET ] port_instance_type [ PRIORITY expression ] [ queue_full_behavior ]
  private static boolean port_instance_specifier_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = general_port_kind(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, PORT, IDENTIFIER, COLON);
    result_ = result_ && port_instance_specifier_0_4(builder_, level_ + 1);
    result_ = result_ && port_instance_type(builder_, level_ + 1);
    result_ = result_ && port_instance_specifier_0_6(builder_, level_ + 1);
    result_ = result_ && port_instance_specifier_0_7(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ LEFT_BRACKET expression RIGHT_BRACKET ]
  private static boolean port_instance_specifier_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier_0_4")) return false;
    port_instance_specifier_0_4_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_BRACKET expression RIGHT_BRACKET
  private static boolean port_instance_specifier_0_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier_0_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ PRIORITY expression ]
  private static boolean port_instance_specifier_0_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier_0_6")) return false;
    port_instance_specifier_0_6_0(builder_, level_ + 1);
    return true;
  }

  // PRIORITY expression
  private static boolean port_instance_specifier_0_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier_0_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PRIORITY);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ queue_full_behavior ]
  private static boolean port_instance_specifier_0_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier_0_7")) return false;
    queue_full_behavior(builder_, level_ + 1);
    return true;
  }

  // [ special_port_input_kind ] special_port_kind PORT IDENTIFIER [ PRIORITY expression ] [ queue_full_behavior ]
  private static boolean port_instance_specifier_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = port_instance_specifier_1_0(builder_, level_ + 1);
    result_ = result_ && special_port_kind(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, PORT, IDENTIFIER);
    result_ = result_ && port_instance_specifier_1_4(builder_, level_ + 1);
    result_ = result_ && port_instance_specifier_1_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ special_port_input_kind ]
  private static boolean port_instance_specifier_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier_1_0")) return false;
    special_port_input_kind(builder_, level_ + 1);
    return true;
  }

  // [ PRIORITY expression ]
  private static boolean port_instance_specifier_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier_1_4")) return false;
    port_instance_specifier_1_4_0(builder_, level_ + 1);
    return true;
  }

  // PRIORITY expression
  private static boolean port_instance_specifier_1_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier_1_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PRIORITY);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ queue_full_behavior ]
  private static boolean port_instance_specifier_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier_1_5")) return false;
    queue_full_behavior(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // qualified_identifier
  //                         | SERIAL
  public static boolean port_instance_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_type")) return false;
    if (!nextTokenIs(builder_, "<port instance type>", IDENTIFIER, SERIAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PORT_INSTANCE_TYPE, "<port instance type>");
    result_ = qualified_identifier(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SERIAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
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
  // ASYNC | GUARDED | SYNC
  public static boolean special_port_input_kind(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "special_port_input_kind")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SPECIAL_PORT_INPUT_KIND, "<special port input kind>");
    result_ = consumeToken(builder_, ASYNC);
    if (!result_) result_ = consumeToken(builder_, GUARDED);
    if (!result_) result_ = consumeToken(builder_, SYNC);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // COMMAND RECV
  //                         | COMMAND REG
  //                         | COMMAND RESP
  //                         | EVENT
  //                         | PARAM GET
  //                         | PARAM SET
  //                         | PRODUCT GET
  //                         | PRODUCT RECV
  //                         | PRODUCT REQUEST
  //                         | PRODUCT SEND
  //                         | TELEMETRY
  //                         | TEXT EVENT
  //                         | TIME GET
  public static boolean special_port_kind(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "special_port_kind")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SPECIAL_PORT_KIND, "<special port kind>");
    result_ = parseTokens(builder_, 0, COMMAND, RECV);
    if (!result_) result_ = parseTokens(builder_, 0, COMMAND, REG);
    if (!result_) result_ = parseTokens(builder_, 0, COMMAND, RESP);
    if (!result_) result_ = consumeToken(builder_, EVENT);
    if (!result_) result_ = parseTokens(builder_, 0, PARAM, GET);
    if (!result_) result_ = parseTokens(builder_, 0, PARAM, SET);
    if (!result_) result_ = parseTokens(builder_, 0, PRODUCT, GET);
    if (!result_) result_ = parseTokens(builder_, 0, PRODUCT, RECV);
    if (!result_) result_ = parseTokens(builder_, 0, PRODUCT, REQUEST);
    if (!result_) result_ = parseTokens(builder_, 0, PRODUCT, SEND);
    if (!result_) result_ = consumeToken(builder_, TELEMETRY);
    if (!result_) result_ = parseTokens(builder_, 0, TEXT, EVENT);
    if (!result_) result_ = parseTokens(builder_, 0, TIME, GET);
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
    string_type_name_1_0(builder_, level_ + 1);
    return true;
  }

  // SIZE expression
  private static boolean string_type_name_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_type_name_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SIZE);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TELEMETRY IDENTIFIER COLON type_name [ ID expression ] [ UPDATE telemetry_update ] [ FORMAT STRING_LITERAL ] [ LOW LEFT_BRACE telemetry_limit_sequence RIGHT_BRACE ] [ HIGH LEFT_BRACE telemetry_limit_sequence RIGHT_BRACE ]
  public static boolean telemetry_channel_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_specifier")) return false;
    if (!nextTokenIs(builder_, TELEMETRY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, TELEMETRY, IDENTIFIER, COLON);
    result_ = result_ && type_name(builder_, level_ + 1);
    result_ = result_ && telemetry_channel_specifier_4(builder_, level_ + 1);
    result_ = result_ && telemetry_channel_specifier_5(builder_, level_ + 1);
    result_ = result_ && telemetry_channel_specifier_6(builder_, level_ + 1);
    result_ = result_ && telemetry_channel_specifier_7(builder_, level_ + 1);
    result_ = result_ && telemetry_channel_specifier_8(builder_, level_ + 1);
    exit_section_(builder_, marker_, TELEMETRY_CHANNEL_SPECIFIER, result_);
    return result_;
  }

  // [ ID expression ]
  private static boolean telemetry_channel_specifier_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_specifier_4")) return false;
    telemetry_channel_specifier_4_0(builder_, level_ + 1);
    return true;
  }

  // ID expression
  private static boolean telemetry_channel_specifier_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_specifier_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ UPDATE telemetry_update ]
  private static boolean telemetry_channel_specifier_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_specifier_5")) return false;
    telemetry_channel_specifier_5_0(builder_, level_ + 1);
    return true;
  }

  // UPDATE telemetry_update
  private static boolean telemetry_channel_specifier_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_specifier_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, UPDATE);
    result_ = result_ && telemetry_update(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ FORMAT STRING_LITERAL ]
  private static boolean telemetry_channel_specifier_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_specifier_6")) return false;
    parseTokens(builder_, 0, FORMAT, STRING_LITERAL);
    return true;
  }

  // [ LOW LEFT_BRACE telemetry_limit_sequence RIGHT_BRACE ]
  private static boolean telemetry_channel_specifier_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_specifier_7")) return false;
    telemetry_channel_specifier_7_0(builder_, level_ + 1);
    return true;
  }

  // LOW LEFT_BRACE telemetry_limit_sequence RIGHT_BRACE
  private static boolean telemetry_channel_specifier_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_specifier_7_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LOW, LEFT_BRACE);
    result_ = result_ && telemetry_limit_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ HIGH LEFT_BRACE telemetry_limit_sequence RIGHT_BRACE ]
  private static boolean telemetry_channel_specifier_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_specifier_8")) return false;
    telemetry_channel_specifier_8_0(builder_, level_ + 1);
    return true;
  }

  // HIGH LEFT_BRACE telemetry_limit_sequence RIGHT_BRACE
  private static boolean telemetry_channel_specifier_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_specifier_8_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, HIGH, LEFT_BRACE);
    result_ = result_ && telemetry_limit_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // RED expression
  //                     | ORANGE expression
  //                     | YELLOW expression
  public static boolean telemetry_limit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_limit")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TELEMETRY_LIMIT, "<telemetry limit>");
    result_ = telemetry_limit_0(builder_, level_ + 1);
    if (!result_) result_ = telemetry_limit_1(builder_, level_ + 1);
    if (!result_) result_ = telemetry_limit_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // RED expression
  private static boolean telemetry_limit_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_limit_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RED);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ORANGE expression
  private static boolean telemetry_limit_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_limit_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ORANGE);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // YELLOW expression
  private static boolean telemetry_limit_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_limit_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, YELLOW);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (telemetry_limit (COMMA | END_OF_LINE)*)*
  public static boolean telemetry_limit_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_limit_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TELEMETRY_LIMIT_SEQUENCE, "<telemetry limit sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!telemetry_limit_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "telemetry_limit_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // telemetry_limit (COMMA | END_OF_LINE)*
  private static boolean telemetry_limit_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_limit_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = telemetry_limit(builder_, level_ + 1);
    result_ = result_ && telemetry_limit_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean telemetry_limit_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_limit_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!telemetry_limit_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "telemetry_limit_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean telemetry_limit_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_limit_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // ALWAYS | ON CHANGE
  public static boolean telemetry_update(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_update")) return false;
    if (!nextTokenIs(builder_, "<telemetry update>", ALWAYS, ON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TELEMETRY_UPDATE, "<telemetry update>");
    result_ = consumeToken(builder_, ALWAYS);
    if (!result_) result_ = parseTokens(builder_, 0, ON, CHANGE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
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
