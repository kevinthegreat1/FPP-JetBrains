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
  // TYPE identifier_definition
  public static boolean abstract_type_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "abstract_type_definition")) return false;
    if (!nextTokenIs(builder_, TYPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TYPE);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, ABSTRACT_TYPE_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // ACTION identifier_definition [ COLON type_name ]
  public static boolean action_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "action_definition")) return false;
    if (!nextTokenIs(builder_, ACTION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ACTION);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && action_definition_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, ACTION_DEFINITION, result_);
    return result_;
  }

  // [ COLON type_name ]
  private static boolean action_definition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "action_definition_2")) return false;
    action_definition_2_0(builder_, level_ + 1);
    return true;
  }

  // COLON type_name
  private static boolean action_definition_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "action_definition_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (identifier_action_definition (COMMA | END_OF_LINE)*)*
  public static boolean action_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "action_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ACTION_SEQUENCE, "<action sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!action_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "action_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // identifier_action_definition (COMMA | END_OF_LINE)*
  private static boolean action_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "action_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_action_definition(builder_, level_ + 1);
    result_ = result_ && action_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean action_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "action_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!action_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "action_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean action_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "action_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // [ DICTIONARY ] TYPE identifier_definition ASSIGN type_name
  public static boolean alias_type_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "alias_type_definition")) return false;
    if (!nextTokenIs(builder_, "<alias type definition>", DICTIONARY, TYPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ALIAS_TYPE_DEFINITION, "<alias type definition>");
    result_ = alias_type_definition_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPE);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    result_ = result_ && type_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ DICTIONARY ]
  private static boolean alias_type_definition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "alias_type_definition_0")) return false;
    consumeToken(builder_, DICTIONARY);
    return true;
  }

  /* ********************************************************** */
  // arithmetic_expression_multiplicative ( ( ADD | SUB ) arithmetic_expression_multiplicative )*
  public static boolean arithmetic_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARITHMETIC_EXPRESSION, "<arithmetic expression>");
    result_ = arithmetic_expression_multiplicative(builder_, level_ + 1);
    result_ = result_ && arithmetic_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( ( ADD | SUB ) arithmetic_expression_multiplicative )*
  private static boolean arithmetic_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!arithmetic_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arithmetic_expression_1", pos_)) break;
    }
    return true;
  }

  // ( ADD | SUB ) arithmetic_expression_multiplicative
  private static boolean arithmetic_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = arithmetic_expression_1_0_0(builder_, level_ + 1);
    result_ = result_ && arithmetic_expression_multiplicative(builder_, level_ + 1);
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
  // arithmetic_expression_unary ( ( MUL | DIV ) arithmetic_expression_unary )*
  public static boolean arithmetic_expression_multiplicative(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_multiplicative")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARITHMETIC_EXPRESSION_MULTIPLICATIVE, "<arithmetic expression multiplicative>");
    result_ = arithmetic_expression_unary(builder_, level_ + 1);
    result_ = result_ && arithmetic_expression_multiplicative_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( ( MUL | DIV ) arithmetic_expression_unary )*
  private static boolean arithmetic_expression_multiplicative_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_multiplicative_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!arithmetic_expression_multiplicative_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arithmetic_expression_multiplicative_1", pos_)) break;
    }
    return true;
  }

  // ( MUL | DIV ) arithmetic_expression_unary
  private static boolean arithmetic_expression_multiplicative_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_multiplicative_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = arithmetic_expression_multiplicative_1_0_0(builder_, level_ + 1);
    result_ = result_ && arithmetic_expression_unary(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MUL | DIV
  private static boolean arithmetic_expression_multiplicative_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_multiplicative_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, MUL);
    if (!result_) result_ = consumeToken(builder_, DIV);
    return result_;
  }

  /* ********************************************************** */
  // SUB arithmetic_expression_unary
  //                                 | expression_postfix
  public static boolean arithmetic_expression_unary(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_unary")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARITHMETIC_EXPRESSION_UNARY, "<arithmetic expression unary>");
    result_ = arithmetic_expression_unary_0(builder_, level_ + 1);
    if (!result_) result_ = expression_postfix(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // SUB arithmetic_expression_unary
  private static boolean arithmetic_expression_unary_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arithmetic_expression_unary_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SUB);
    result_ = result_ && arithmetic_expression_unary(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ DICTIONARY ] ARRAY identifier_definition ASSIGN LEFT_BRACKET expression RIGHT_BRACKET type_name [ DEFAULT expression ] [ FORMAT STRING_LITERAL ]
  public static boolean array_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_definition")) return false;
    if (!nextTokenIs(builder_, "<array definition>", ARRAY, DICTIONARY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARRAY_DEFINITION, "<array definition>");
    result_ = array_definition_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ARRAY);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, ASSIGN, LEFT_BRACKET);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    result_ = result_ && type_name(builder_, level_ + 1);
    result_ = result_ && array_definition_8(builder_, level_ + 1);
    result_ = result_ && array_definition_9(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ DICTIONARY ]
  private static boolean array_definition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_definition_0")) return false;
    consumeToken(builder_, DICTIONARY);
    return true;
  }

  // [ DEFAULT expression ]
  private static boolean array_definition_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_definition_8")) return false;
    array_definition_8_0(builder_, level_ + 1);
    return true;
  }

  // DEFAULT expression
  private static boolean array_definition_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_definition_8_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DEFAULT);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ FORMAT STRING_LITERAL ]
  private static boolean array_definition_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_definition_9")) return false;
    parseTokens(builder_, 0, FORMAT, STRING_LITERAL);
    return true;
  }

  /* ********************************************************** */
  // (expression (COMMA | END_OF_LINE)*)*
  public static boolean array_element_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_element_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARRAY_ELEMENT_SEQUENCE, "<array element sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!array_element_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_element_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // expression (COMMA | END_OF_LINE)*
  private static boolean array_element_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_element_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && array_element_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean array_element_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_element_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!array_element_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_element_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean array_element_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_element_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // LEFT_BRACKET array_element_sequence RIGHT_BRACKET
  public static boolean array_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_expression")) return false;
    if (!nextTokenIs(builder_, LEFT_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && array_element_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, ARRAY_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // TRUE | FALSE
  public static boolean boolean_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "boolean_literal")) return false;
    if (!nextTokenIs(builder_, "<boolean literal>", FALSE, TRUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BOOLEAN_LITERAL, "<boolean literal>");
    result_ = consumeToken(builder_, TRUE);
    if (!result_) result_ = consumeToken(builder_, FALSE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // CHOICE identifier_definition LEFT_BRACE IF identifier_guard_definition transition_expression ELSE transition_expression RIGHT_BRACE
  public static boolean choice_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "choice_definition")) return false;
    if (!nextTokenIs(builder_, CHOICE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CHOICE);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, LEFT_BRACE, IF);
    result_ = result_ && identifier_guard_definition(builder_, level_ + 1);
    result_ = result_ && transition_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ELSE);
    result_ = result_ && transition_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, CHOICE_DEFINITION, result_);
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
  // command_kind COMMAND identifier_definition [ LEFT_PAREN param_list RIGHT_PAREN ] [ OPCODE expression ] [ PRIORITY expression ] [ queue_full_behavior ]
  public static boolean command_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_specifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMMAND_SPECIFIER, "<command specifier>");
    result_ = command_kind(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMAND);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
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
  // component_kind COMPONENT identifier_definition LEFT_BRACE component_member_sequence RIGHT_BRACE
  public static boolean component_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_definition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPONENT_DEFINITION, "<component definition>");
    result_ = component_kind(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMPONENT);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && component_member_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // INSTANCE identifier_definition COLON qualified_identifier_component_definition BASE ID expression [ TYPE STRING_LITERAL ] [ AT STRING_LITERAL ] [ QUEUE SIZE expression ] [ STACK SIZE expression ] [ PRIORITY expression ] [ CPU expression ] [ LEFT_BRACE init_specifier_sequence RIGHT_BRACE ]
  public static boolean component_instance_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition")) return false;
    if (!nextTokenIs(builder_, INSTANCE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INSTANCE);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && qualified_identifier_component_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, BASE, ID);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && component_instance_definition_7(builder_, level_ + 1);
    result_ = result_ && component_instance_definition_8(builder_, level_ + 1);
    result_ = result_ && component_instance_definition_9(builder_, level_ + 1);
    result_ = result_ && component_instance_definition_10(builder_, level_ + 1);
    result_ = result_ && component_instance_definition_11(builder_, level_ + 1);
    result_ = result_ && component_instance_definition_12(builder_, level_ + 1);
    result_ = result_ && component_instance_definition_13(builder_, level_ + 1);
    exit_section_(builder_, marker_, COMPONENT_INSTANCE_DEFINITION, result_);
    return result_;
  }

  // [ TYPE STRING_LITERAL ]
  private static boolean component_instance_definition_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_7")) return false;
    parseTokens(builder_, 0, TYPE, STRING_LITERAL);
    return true;
  }

  // [ AT STRING_LITERAL ]
  private static boolean component_instance_definition_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_8")) return false;
    parseTokens(builder_, 0, AT, STRING_LITERAL);
    return true;
  }

  // [ QUEUE SIZE expression ]
  private static boolean component_instance_definition_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_9")) return false;
    component_instance_definition_9_0(builder_, level_ + 1);
    return true;
  }

  // QUEUE SIZE expression
  private static boolean component_instance_definition_9_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_9_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, QUEUE, SIZE);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ STACK SIZE expression ]
  private static boolean component_instance_definition_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_10")) return false;
    component_instance_definition_10_0(builder_, level_ + 1);
    return true;
  }

  // STACK SIZE expression
  private static boolean component_instance_definition_10_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_10_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, STACK, SIZE);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ PRIORITY expression ]
  private static boolean component_instance_definition_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_11")) return false;
    component_instance_definition_11_0(builder_, level_ + 1);
    return true;
  }

  // PRIORITY expression
  private static boolean component_instance_definition_11_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_11_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PRIORITY);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ CPU expression ]
  private static boolean component_instance_definition_12(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_12")) return false;
    component_instance_definition_12_0(builder_, level_ + 1);
    return true;
  }

  // CPU expression
  private static boolean component_instance_definition_12_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_12_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CPU);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ LEFT_BRACE init_specifier_sequence RIGHT_BRACE ]
  private static boolean component_instance_definition_13(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_13")) return false;
    component_instance_definition_13_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_BRACE init_specifier_sequence RIGHT_BRACE
  private static boolean component_instance_definition_13_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_definition_13_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && init_specifier_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LOCATE INSTANCE qualified_identifier_component_instance_definition AT STRING_LITERAL
  public static boolean component_instance_location_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_location_specifier")) return false;
    if (!nextTokenIs(builder_, LOCATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LOCATE, INSTANCE);
    result_ = result_ && qualified_identifier_component_instance_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, AT, STRING_LITERAL);
    exit_section_(builder_, marker_, COMPONENT_INSTANCE_LOCATION_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ PRIVATE ] INSTANCE qualified_identifier_component_instance_definition
  public static boolean component_instance_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_specifier")) return false;
    if (!nextTokenIs(builder_, "<component instance specifier>", INSTANCE, PRIVATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPONENT_INSTANCE_SPECIFIER, "<component instance specifier>");
    result_ = component_instance_specifier_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, INSTANCE);
    result_ = result_ && qualified_identifier_component_instance_definition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ PRIVATE ]
  private static boolean component_instance_specifier_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_instance_specifier_0")) return false;
    consumeToken(builder_, PRIVATE);
    return true;
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
  // LOCATE COMPONENT qualified_identifier_component_definition AT STRING_LITERAL
  public static boolean component_location_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_location_specifier")) return false;
    if (!nextTokenIs(builder_, LOCATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LOCATE, COMPONENT);
    result_ = result_ && qualified_identifier_component_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, AT, STRING_LITERAL);
    exit_section_(builder_, marker_, COMPONENT_LOCATION_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // constant_definition
  //                   | state_machine_definition
  //                   | struct_definition
  //                   | command_specifier
  //                   | container_specifier
  //                   | parameter_specifier
  //                   | port_instance_specifier
  //                   | port_matching_specifier
  //                   | record_specifier
  //                   | state_machine_instance_specifier
  //                   | telemetry_channel_specifier
  //                   | abstract_type_definition
  //                   | alias_type_definition
  //                   | array_definition
  //                   | enum_definition
  //                   | event_specifier
  //                   | include_specifier
  //                   | internal_port_specifier
  //                   | interface_import_specifier
  public static boolean component_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPONENT_MEMBER, "<component member>");
    result_ = constant_definition(builder_, level_ + 1);
    if (!result_) result_ = state_machine_definition(builder_, level_ + 1);
    if (!result_) result_ = struct_definition(builder_, level_ + 1);
    if (!result_) result_ = command_specifier(builder_, level_ + 1);
    if (!result_) result_ = container_specifier(builder_, level_ + 1);
    if (!result_) result_ = parameter_specifier(builder_, level_ + 1);
    if (!result_) result_ = port_instance_specifier(builder_, level_ + 1);
    if (!result_) result_ = port_matching_specifier(builder_, level_ + 1);
    if (!result_) result_ = record_specifier(builder_, level_ + 1);
    if (!result_) result_ = state_machine_instance_specifier(builder_, level_ + 1);
    if (!result_) result_ = telemetry_channel_specifier(builder_, level_ + 1);
    if (!result_) result_ = abstract_type_definition(builder_, level_ + 1);
    if (!result_) result_ = alias_type_definition(builder_, level_ + 1);
    if (!result_) result_ = array_definition(builder_, level_ + 1);
    if (!result_) result_ = enum_definition(builder_, level_ + 1);
    if (!result_) result_ = event_specifier(builder_, level_ + 1);
    if (!result_) result_ = include_specifier(builder_, level_ + 1);
    if (!result_) result_ = internal_port_specifier(builder_, level_ + 1);
    if (!result_) result_ = interface_import_specifier(builder_, level_ + 1);
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
  // [ UNMATCHED ] port_instance_identifier [ LEFT_BRACKET expression RIGHT_BRACKET ] ARROW port_instance_identifier [ LEFT_BRACKET expression RIGHT_BRACKET ]
  public static boolean connection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "connection")) return false;
    if (!nextTokenIs(builder_, "<connection>", IDENTIFIER, UNMATCHED)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONNECTION, "<connection>");
    result_ = connection_0(builder_, level_ + 1);
    result_ = result_ && port_instance_identifier(builder_, level_ + 1);
    result_ = result_ && connection_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ARROW);
    result_ = result_ && port_instance_identifier(builder_, level_ + 1);
    result_ = result_ && connection_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ UNMATCHED ]
  private static boolean connection_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "connection_0")) return false;
    consumeToken(builder_, UNMATCHED);
    return true;
  }

  // [ LEFT_BRACKET expression RIGHT_BRACKET ]
  private static boolean connection_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "connection_2")) return false;
    connection_2_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_BRACKET expression RIGHT_BRACKET
  private static boolean connection_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "connection_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ LEFT_BRACKET expression RIGHT_BRACKET ]
  private static boolean connection_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "connection_5")) return false;
    connection_5_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_BRACKET expression RIGHT_BRACKET
  private static boolean connection_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "connection_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // direct_graph_specifier
  //                                 | pattern_graph_specifier
  public static boolean connection_graph_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "connection_graph_specifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONNECTION_GRAPH_SPECIFIER, "<connection graph specifier>");
    result_ = direct_graph_specifier(builder_, level_ + 1);
    if (!result_) result_ = pattern_graph_specifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (connection (COMMA | END_OF_LINE)*)*
  public static boolean connection_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "connection_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONNECTION_SEQUENCE, "<connection sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!connection_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "connection_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // connection (COMMA | END_OF_LINE)*
  private static boolean connection_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "connection_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = connection(builder_, level_ + 1);
    result_ = result_ && connection_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean connection_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "connection_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!connection_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "connection_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean connection_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "connection_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // [ DICTIONARY ] CONSTANT identifier_definition ASSIGN expression
  public static boolean constant_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_definition")) return false;
    if (!nextTokenIs(builder_, "<constant definition>", CONSTANT, DICTIONARY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONSTANT_DEFINITION, "<constant definition>");
    result_ = constant_definition_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CONSTANT);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ DICTIONARY ]
  private static boolean constant_definition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_definition_0")) return false;
    consumeToken(builder_, DICTIONARY);
    return true;
  }

  /* ********************************************************** */
  // LOCATE [ DICTIONARY ] CONSTANT qualified_identifier_constant_definition AT STRING_LITERAL
  public static boolean constant_location_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_location_specifier")) return false;
    if (!nextTokenIs(builder_, LOCATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LOCATE);
    result_ = result_ && constant_location_specifier_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CONSTANT);
    result_ = result_ && qualified_identifier_constant_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, AT, STRING_LITERAL);
    exit_section_(builder_, marker_, CONSTANT_LOCATION_SPECIFIER, result_);
    return result_;
  }

  // [ DICTIONARY ]
  private static boolean constant_location_specifier_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_location_specifier_1")) return false;
    consumeToken(builder_, DICTIONARY);
    return true;
  }

  /* ********************************************************** */
  // PRODUCT identifier_definition [ ID expression ] [ DEFAULT PRIORITY expression ]
  public static boolean container_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_specifier")) return false;
    if (!nextTokenIs(builder_, PRODUCT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PRODUCT);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && container_specifier_2(builder_, level_ + 1);
    result_ = result_ && container_specifier_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONTAINER_SPECIFIER, result_);
    return result_;
  }

  // [ ID expression ]
  private static boolean container_specifier_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_specifier_2")) return false;
    container_specifier_2_0(builder_, level_ + 1);
    return true;
  }

  // ID expression
  private static boolean container_specifier_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_specifier_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ DEFAULT PRIORITY expression ]
  private static boolean container_specifier_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_specifier_3")) return false;
    container_specifier_3_0(builder_, level_ + 1);
    return true;
  }

  // DEFAULT PRIORITY expression
  private static boolean container_specifier_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "container_specifier_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DEFAULT, PRIORITY);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONNECTIONS identifier_definition LEFT_BRACE connection_sequence RIGHT_BRACE
  public static boolean direct_graph_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "direct_graph_specifier")) return false;
    if (!nextTokenIs(builder_, CONNECTIONS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONNECTIONS);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && connection_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, DIRECT_GRAPH_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // DO LEFT_BRACE action_sequence RIGHT_BRACE
  public static boolean do_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_expression")) return false;
    if (!nextTokenIs(builder_, DO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DO, LEFT_BRACE);
    result_ = result_ && action_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, DO_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier_definition [ ASSIGN expression ]
  public static boolean enum_constant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_constant")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_definition(builder_, level_ + 1);
    result_ = result_ && enum_constant_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ENUM_CONSTANT, result_);
    return result_;
  }

  // [ ASSIGN expression ]
  private static boolean enum_constant_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_constant_1")) return false;
    enum_constant_1_0(builder_, level_ + 1);
    return true;
  }

  // ASSIGN expression
  private static boolean enum_constant_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_constant_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (enum_constant (COMMA | END_OF_LINE)*)*
  public static boolean enum_constant_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_constant_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUM_CONSTANT_SEQUENCE, "<enum constant sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!enum_constant_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_constant_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // enum_constant (COMMA | END_OF_LINE)*
  private static boolean enum_constant_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_constant_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = enum_constant(builder_, level_ + 1);
    result_ = result_ && enum_constant_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean enum_constant_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_constant_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!enum_constant_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enum_constant_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean enum_constant_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_constant_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // [ DICTIONARY ] ENUM identifier_definition [ COLON type_name ] LEFT_BRACE enum_constant_sequence RIGHT_BRACE [ DEFAULT expression ]
  public static boolean enum_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_definition")) return false;
    if (!nextTokenIs(builder_, "<enum definition>", DICTIONARY, ENUM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUM_DEFINITION, "<enum definition>");
    result_ = enum_definition_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ENUM);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && enum_definition_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && enum_constant_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    result_ = result_ && enum_definition_7(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ DICTIONARY ]
  private static boolean enum_definition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_definition_0")) return false;
    consumeToken(builder_, DICTIONARY);
    return true;
  }

  // [ COLON type_name ]
  private static boolean enum_definition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_definition_3")) return false;
    enum_definition_3_0(builder_, level_ + 1);
    return true;
  }

  // COLON type_name
  private static boolean enum_definition_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_definition_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ DEFAULT expression ]
  private static boolean enum_definition_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_definition_7")) return false;
    enum_definition_7_0(builder_, level_ + 1);
    return true;
  }

  // DEFAULT expression
  private static boolean enum_definition_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enum_definition_7_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DEFAULT);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
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
  // EVENT identifier_definition [ LEFT_PAREN param_list RIGHT_PAREN ] SEVERITY event_severity [ ID expression ] FORMAT STRING_LITERAL [ THROTTLE expression ]
  public static boolean event_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "event_specifier")) return false;
    if (!nextTokenIs(builder_, EVENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EVENT);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
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
  // expression_primary expression_postfix_operations*
  public static boolean expression_postfix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_postfix")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_POSTFIX, "<expression postfix>");
    result_ = expression_primary(builder_, level_ + 1);
    result_ = result_ && expression_postfix_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // expression_postfix_operations*
  private static boolean expression_postfix_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_postfix_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!expression_postfix_operations(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expression_postfix_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // expression LEFT_BRACKET expression RIGHT_BRACKET // 10.3. Array Subscript Expressions
  //                                 | expression DOT IDENTIFIER
  public static boolean expression_postfix_operations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_postfix_operations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_POSTFIX_OPERATIONS, "<expression postfix operations>");
    result_ = expression_postfix_operations_0(builder_, level_ + 1);
    if (!result_) result_ = expression_postfix_operations_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // expression LEFT_BRACKET expression RIGHT_BRACKET
  private static boolean expression_postfix_operations_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_postfix_operations_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression DOT IDENTIFIER
  private static boolean expression_postfix_operations_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_postfix_operations_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOT, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // array_expression
  //                     | boolean_literal // 10.4. Boolean Literals
  //                     | FLOATING_POINT_LITERAL // 10.6. Floating-Point Literals
  //                     | qualified_identifier // 10.7. Identifier Expressions
  //                     | INTEGER_LITERAL // 10.8. Integer Literals
  //                     | LEFT_PAREN expression RIGHT_PAREN // 10.9. Parenthesis Expressions
  //                     | STRING_LITERAL // 10.10. String Literals
  //                     | struct_expression
  public static boolean expression_primary(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_primary")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_PRIMARY, "<expression primary>");
    result_ = array_expression(builder_, level_ + 1);
    if (!result_) result_ = boolean_literal(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, FLOATING_POINT_LITERAL);
    if (!result_) result_ = qualified_identifier(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, INTEGER_LITERAL);
    if (!result_) result_ = expression_primary_5(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING_LITERAL);
    if (!result_) result_ = struct_expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LEFT_PAREN expression RIGHT_PAREN
  private static boolean expression_primary_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_primary_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
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
  // [ REF ] identifier_definition COLON type_name
  public static boolean formal_parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "formal_parameter")) return false;
    if (!nextTokenIs(builder_, "<formal parameter>", IDENTIFIER, REF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FORMAL_PARAMETER, "<formal parameter>");
    result_ = formal_parameter_0(builder_, level_ + 1);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
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
  // END_OF_LINE* translation_unit
  static boolean fpp_file(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fpp_file")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = fpp_file_0(builder_, level_ + 1);
    result_ = result_ && translation_unit(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // END_OF_LINE*
  private static boolean fpp_file_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fpp_file_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, END_OF_LINE)) break;
      if (!empty_element_parsed_guard_(builder_, "fpp_file_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // general_port_kind PORT identifier_definition COLON [ LEFT_BRACKET expression RIGHT_BRACKET ] port_instance_type [ PRIORITY expression ] [ queue_full_behavior ]
  public static boolean general_port_instance_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_port_instance_specifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GENERAL_PORT_INSTANCE_SPECIFIER, "<general port instance specifier>");
    result_ = general_port_kind(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PORT);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && general_port_instance_specifier_4(builder_, level_ + 1);
    result_ = result_ && port_instance_type(builder_, level_ + 1);
    result_ = result_ && general_port_instance_specifier_6(builder_, level_ + 1);
    result_ = result_ && general_port_instance_specifier_7(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ LEFT_BRACKET expression RIGHT_BRACKET ]
  private static boolean general_port_instance_specifier_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_port_instance_specifier_4")) return false;
    general_port_instance_specifier_4_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_BRACKET expression RIGHT_BRACKET
  private static boolean general_port_instance_specifier_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_port_instance_specifier_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ PRIORITY expression ]
  private static boolean general_port_instance_specifier_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_port_instance_specifier_6")) return false;
    general_port_instance_specifier_6_0(builder_, level_ + 1);
    return true;
  }

  // PRIORITY expression
  private static boolean general_port_instance_specifier_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_port_instance_specifier_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PRIORITY);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ queue_full_behavior ]
  private static boolean general_port_instance_specifier_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_port_instance_specifier_7")) return false;
    queue_full_behavior(builder_, level_ + 1);
    return true;
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
  // GUARD identifier_definition [ COLON type_name ]
  public static boolean guard_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "guard_definition")) return false;
    if (!nextTokenIs(builder_, GUARD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, GUARD);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && guard_definition_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, GUARD_DEFINITION, result_);
    return result_;
  }

  // [ COLON type_name ]
  private static boolean guard_definition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "guard_definition_2")) return false;
    guard_definition_2_0(builder_, level_ + 1);
    return true;
  }

  // COLON type_name
  private static boolean guard_definition_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "guard_definition_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean identifier_action_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_action_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, IDENTIFIER_ACTION_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean identifier_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, IDENTIFIER_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean identifier_general_port_instance(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_general_port_instance")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, IDENTIFIER_GENERAL_PORT_INSTANCE, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean identifier_guard_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_guard_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, IDENTIFIER_GUARD_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean identifier_signal_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_signal_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, IDENTIFIER_SIGNAL_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // INCLUDE STRING_LITERAL
  public static boolean include_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_specifier")) return false;
    if (!nextTokenIs(builder_, INCLUDE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, INCLUDE, STRING_LITERAL);
    exit_section_(builder_, marker_, INCLUDE_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // PHASE expression STRING_LITERAL
  public static boolean init_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "init_specifier")) return false;
    if (!nextTokenIs(builder_, PHASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PHASE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, STRING_LITERAL);
    exit_section_(builder_, marker_, INIT_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // (init_specifier (SEMICOLON | END_OF_LINE)*)*
  public static boolean init_specifier_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "init_specifier_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INIT_SPECIFIER_SEQUENCE, "<init specifier sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!init_specifier_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "init_specifier_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // init_specifier (SEMICOLON | END_OF_LINE)*
  private static boolean init_specifier_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "init_specifier_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = init_specifier(builder_, level_ + 1);
    result_ = result_ && init_specifier_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SEMICOLON | END_OF_LINE)*
  private static boolean init_specifier_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "init_specifier_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!init_specifier_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "init_specifier_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // SEMICOLON | END_OF_LINE
  private static boolean init_specifier_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "init_specifier_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // INITIAL transition_expression
  public static boolean initial_transition_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "initial_transition_specifier")) return false;
    if (!nextTokenIs(builder_, INITIAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INITIAL);
    result_ = result_ && transition_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, INITIAL_TRANSITION_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // (qualified_identifier_component_instance_definition (COMMA | END_OF_LINE)*)*
  public static boolean instance_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instance_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INSTANCE_SEQUENCE, "<instance sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!instance_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "instance_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // qualified_identifier_component_instance_definition (COMMA | END_OF_LINE)*
  private static boolean instance_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instance_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier_component_instance_definition(builder_, level_ + 1);
    result_ = result_ && instance_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean instance_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instance_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!instance_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "instance_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean instance_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "instance_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // IMPORT qualified_identifier_port_interface_definition
  public static boolean interface_import_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interface_import_specifier")) return false;
    if (!nextTokenIs(builder_, IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IMPORT);
    result_ = result_ && qualified_identifier_port_interface_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, INTERFACE_IMPORT_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // INTERNAL PORT identifier_definition [ LEFT_PAREN param_list RIGHT_PAREN ] [ PRIORITY expression ] [ queue_full_behavior ]
  public static boolean internal_port_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_port_specifier")) return false;
    if (!nextTokenIs(builder_, INTERNAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, INTERNAL, PORT);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && internal_port_specifier_3(builder_, level_ + 1);
    result_ = result_ && internal_port_specifier_4(builder_, level_ + 1);
    result_ = result_ && internal_port_specifier_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, INTERNAL_PORT_SPECIFIER, result_);
    return result_;
  }

  // [ LEFT_PAREN param_list RIGHT_PAREN ]
  private static boolean internal_port_specifier_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_port_specifier_3")) return false;
    internal_port_specifier_3_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_PAREN param_list RIGHT_PAREN
  private static boolean internal_port_specifier_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_port_specifier_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_PAREN);
    result_ = result_ && param_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ PRIORITY expression ]
  private static boolean internal_port_specifier_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_port_specifier_4")) return false;
    internal_port_specifier_4_0(builder_, level_ + 1);
    return true;
  }

  // PRIORITY expression
  private static boolean internal_port_specifier_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_port_specifier_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PRIORITY);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ queue_full_behavior ]
  private static boolean internal_port_specifier_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "internal_port_specifier_5")) return false;
    queue_full_behavior(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // component_instance_location_specifier
  //                         | component_location_specifier
  //                         | constant_location_specifier
  //                         | port_interface_location_specifier
  //                         | port_location_specifier
  //                         | state_machine_location_specifier
  //                         | topology_location_specifier
  //                         | type_location_specifier
  public static boolean location_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "location_specifier")) return false;
    if (!nextTokenIs(builder_, LOCATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = component_instance_location_specifier(builder_, level_ + 1);
    if (!result_) result_ = component_location_specifier(builder_, level_ + 1);
    if (!result_) result_ = constant_location_specifier(builder_, level_ + 1);
    if (!result_) result_ = port_interface_location_specifier(builder_, level_ + 1);
    if (!result_) result_ = port_location_specifier(builder_, level_ + 1);
    if (!result_) result_ = state_machine_location_specifier(builder_, level_ + 1);
    if (!result_) result_ = topology_location_specifier(builder_, level_ + 1);
    if (!result_) result_ = type_location_specifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, LOCATION_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // MODULE identifier_definition LEFT_BRACE module_member_sequence RIGHT_BRACE
  public static boolean module_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_definition")) return false;
    if (!nextTokenIs(builder_, MODULE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MODULE);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && module_member_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, MODULE_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // component_definition
  //                  | component_instance_definition
  //                  | constant_definition
  //                  | module_definition
  //                  | port_definition
  //                  | port_interface_definition
  //                  | state_machine_definition
  //                  | struct_definition
  //                  | topology_definition
  //                  | location_specifier
  //                  | abstract_type_definition
  //                  | alias_type_definition
  //                  | array_definition
  //                  | enum_definition
  //                  | include_specifier
  public static boolean module_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_MEMBER, "<module member>");
    result_ = component_definition(builder_, level_ + 1);
    if (!result_) result_ = component_instance_definition(builder_, level_ + 1);
    if (!result_) result_ = constant_definition(builder_, level_ + 1);
    if (!result_) result_ = module_definition(builder_, level_ + 1);
    if (!result_) result_ = port_definition(builder_, level_ + 1);
    if (!result_) result_ = port_interface_definition(builder_, level_ + 1);
    if (!result_) result_ = state_machine_definition(builder_, level_ + 1);
    if (!result_) result_ = struct_definition(builder_, level_ + 1);
    if (!result_) result_ = topology_definition(builder_, level_ + 1);
    if (!result_) result_ = location_specifier(builder_, level_ + 1);
    if (!result_) result_ = abstract_type_definition(builder_, level_ + 1);
    if (!result_) result_ = alias_type_definition(builder_, level_ + 1);
    if (!result_) result_ = array_definition(builder_, level_ + 1);
    if (!result_) result_ = enum_definition(builder_, level_ + 1);
    if (!result_) result_ = include_specifier(builder_, level_ + 1);
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
  // include_specifier
  public static boolean non_annotatable_include_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_annotatable_include_specifier")) return false;
    if (!nextTokenIs(builder_, INCLUDE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = include_specifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, NON_ANNOTATABLE_INCLUDE_SPECIFIER, result_);
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
  // [ EXTERNAL ] PARAM identifier_definition COLON type_name [ DEFAULT expression ] [ ID expression ] [ SET OPCODE expression ] [ SAVE OPCODE expression ]
  public static boolean parameter_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_specifier")) return false;
    if (!nextTokenIs(builder_, "<parameter specifier>", EXTERNAL, PARAM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARAMETER_SPECIFIER, "<parameter specifier>");
    result_ = parameter_specifier_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PARAM);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && type_name(builder_, level_ + 1);
    result_ = result_ && parameter_specifier_5(builder_, level_ + 1);
    result_ = result_ && parameter_specifier_6(builder_, level_ + 1);
    result_ = result_ && parameter_specifier_7(builder_, level_ + 1);
    result_ = result_ && parameter_specifier_8(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ EXTERNAL ]
  private static boolean parameter_specifier_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_specifier_0")) return false;
    consumeToken(builder_, EXTERNAL);
    return true;
  }

  // [ DEFAULT expression ]
  private static boolean parameter_specifier_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_specifier_5")) return false;
    parameter_specifier_5_0(builder_, level_ + 1);
    return true;
  }

  // DEFAULT expression
  private static boolean parameter_specifier_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_specifier_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DEFAULT);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ID expression ]
  private static boolean parameter_specifier_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_specifier_6")) return false;
    parameter_specifier_6_0(builder_, level_ + 1);
    return true;
  }

  // ID expression
  private static boolean parameter_specifier_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_specifier_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ SET OPCODE expression ]
  private static boolean parameter_specifier_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_specifier_7")) return false;
    parameter_specifier_7_0(builder_, level_ + 1);
    return true;
  }

  // SET OPCODE expression
  private static boolean parameter_specifier_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_specifier_7_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SET, OPCODE);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ SAVE OPCODE expression ]
  private static boolean parameter_specifier_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_specifier_8")) return false;
    parameter_specifier_8_0(builder_, level_ + 1);
    return true;
  }

  // SAVE OPCODE expression
  private static boolean parameter_specifier_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_specifier_8_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SAVE, OPCODE);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // pattern_kind CONNECTIONS INSTANCE qualified_identifier_component_instance_definition [ LEFT_BRACE instance_sequence RIGHT_BRACE ]
  public static boolean pattern_graph_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_graph_specifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PATTERN_GRAPH_SPECIFIER, "<pattern graph specifier>");
    result_ = pattern_kind(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, CONNECTIONS, INSTANCE);
    result_ = result_ && qualified_identifier_component_instance_definition(builder_, level_ + 1);
    result_ = result_ && pattern_graph_specifier_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ LEFT_BRACE instance_sequence RIGHT_BRACE ]
  private static boolean pattern_graph_specifier_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_graph_specifier_4")) return false;
    pattern_graph_specifier_4_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_BRACE instance_sequence RIGHT_BRACE
  private static boolean pattern_graph_specifier_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_graph_specifier_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && instance_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // COMMAND
  //                 | EVENT
  //                 | HEALTH
  //                 | PARAM
  //                 | TELEMETRY
  //                 | TEXT EVENT
  //                 | TIME
  public static boolean pattern_kind(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern_kind")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PATTERN_KIND, "<pattern kind>");
    result_ = consumeToken(builder_, COMMAND);
    if (!result_) result_ = consumeToken(builder_, EVENT);
    if (!result_) result_ = consumeToken(builder_, HEALTH);
    if (!result_) result_ = consumeToken(builder_, PARAM);
    if (!result_) result_ = consumeToken(builder_, TELEMETRY);
    if (!result_) result_ = parseTokens(builder_, 0, TEXT, EVENT);
    if (!result_) result_ = consumeToken(builder_, TIME);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PORT identifier_definition [ LEFT_PAREN param_list RIGHT_PAREN ] [ ARROW type_name ]
  public static boolean port_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_definition")) return false;
    if (!nextTokenIs(builder_, PORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PORT);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
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
  // qualified_identifier_component_instance_definition DOT IDENTIFIER
  public static boolean port_instance_identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_identifier")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier_component_instance_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOT, IDENTIFIER);
    exit_section_(builder_, marker_, PORT_INSTANCE_IDENTIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // general_port_instance_specifier | special_port_instance_specifier
  public static boolean port_instance_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_specifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PORT_INSTANCE_SPECIFIER, "<port instance specifier>");
    result_ = general_port_instance_specifier(builder_, level_ + 1);
    if (!result_) result_ = special_port_instance_specifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // qualified_identifier_port_definition
  //                         | SERIAL
  public static boolean port_instance_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_instance_type")) return false;
    if (!nextTokenIs(builder_, "<port instance type>", IDENTIFIER, SERIAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PORT_INSTANCE_TYPE, "<port instance type>");
    result_ = qualified_identifier_port_definition(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SERIAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // INTERFACE identifier_definition LEFT_BRACE port_interface_member_sequence RIGHT_BRACE
  public static boolean port_interface_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_interface_definition")) return false;
    if (!nextTokenIs(builder_, INTERFACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INTERFACE);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && port_interface_member_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, PORT_INTERFACE_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // LOCATE INTERFACE qualified_identifier_port_interface_definition AT STRING_LITERAL
  public static boolean port_interface_location_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_interface_location_specifier")) return false;
    if (!nextTokenIs(builder_, LOCATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LOCATE, INTERFACE);
    result_ = result_ && qualified_identifier_port_interface_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, AT, STRING_LITERAL);
    exit_section_(builder_, marker_, PORT_INTERFACE_LOCATION_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // port_instance_specifier
  //                         | interface_import_specifier
  public static boolean port_interface_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_interface_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PORT_INTERFACE_MEMBER, "<port interface member>");
    result_ = port_instance_specifier(builder_, level_ + 1);
    if (!result_) result_ = interface_import_specifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (port_interface_member (SEMICOLON | END_OF_LINE)*)*
  public static boolean port_interface_member_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_interface_member_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PORT_INTERFACE_MEMBER_SEQUENCE, "<port interface member sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!port_interface_member_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "port_interface_member_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // port_interface_member (SEMICOLON | END_OF_LINE)*
  private static boolean port_interface_member_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_interface_member_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = port_interface_member(builder_, level_ + 1);
    result_ = result_ && port_interface_member_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SEMICOLON | END_OF_LINE)*
  private static boolean port_interface_member_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_interface_member_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!port_interface_member_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "port_interface_member_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // SEMICOLON | END_OF_LINE
  private static boolean port_interface_member_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_interface_member_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // LOCATE PORT qualified_identifier_port_definition AT STRING_LITERAL
  public static boolean port_location_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_location_specifier")) return false;
    if (!nextTokenIs(builder_, LOCATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LOCATE, PORT);
    result_ = result_ && qualified_identifier_port_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, AT, STRING_LITERAL);
    exit_section_(builder_, marker_, PORT_LOCATION_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // MATCH identifier_general_port_instance WITH identifier_general_port_instance
  public static boolean port_matching_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "port_matching_specifier")) return false;
    if (!nextTokenIs(builder_, MATCH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MATCH);
    result_ = result_ && identifier_general_port_instance(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, WITH);
    result_ = result_ && identifier_general_port_instance(builder_, level_ + 1);
    exit_section_(builder_, marker_, PORT_MATCHING_SPECIFIER, result_);
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
  public static boolean qualified_identifier_component_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_component_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER_COMPONENT_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualified_identifier
  public static boolean qualified_identifier_component_instance_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_component_instance_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER_COMPONENT_INSTANCE_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualified_identifier
  public static boolean qualified_identifier_constant_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_constant_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER_CONSTANT_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualified_identifier
  public static boolean qualified_identifier_port_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_port_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER_PORT_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualified_identifier
  public static boolean qualified_identifier_port_interface_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_port_interface_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER_PORT_INTERFACE_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualified_identifier
  public static boolean qualified_identifier_state_machine_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_state_machine_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER_STATE_MACHINE_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualified_identifier
  public static boolean qualified_identifier_state_or_choice_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_state_or_choice_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER_STATE_OR_CHOICE_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualified_identifier
  public static boolean qualified_identifier_topology_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_topology_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER_TOPOLOGY_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualified_identifier
  public static boolean qualified_identifier_type_location_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified_identifier_type_location_specifier")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_IDENTIFIER_TYPE_LOCATION_SPECIFIER, result_);
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
  // PRODUCT RECORD identifier_definition COLON type_name [ ARRAY ] [ ID expression ]
  public static boolean record_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "record_specifier")) return false;
    if (!nextTokenIs(builder_, PRODUCT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PRODUCT, RECORD);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && type_name(builder_, level_ + 1);
    result_ = result_ && record_specifier_5(builder_, level_ + 1);
    result_ = result_ && record_specifier_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, RECORD_SPECIFIER, result_);
    return result_;
  }

  // [ ARRAY ]
  private static boolean record_specifier_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "record_specifier_5")) return false;
    consumeToken(builder_, ARRAY);
    return true;
  }

  // [ ID expression ]
  private static boolean record_specifier_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "record_specifier_6")) return false;
    record_specifier_6_0(builder_, level_ + 1);
    return true;
  }

  // ID expression
  private static boolean record_specifier_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "record_specifier_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // SIGNAL identifier_definition [ COLON type_name ]
  public static boolean signal_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_definition")) return false;
    if (!nextTokenIs(builder_, SIGNAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SIGNAL);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && signal_definition_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, SIGNAL_DEFINITION, result_);
    return result_;
  }

  // [ COLON type_name ]
  private static boolean signal_definition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_definition_2")) return false;
    signal_definition_2_0(builder_, level_ + 1);
    return true;
  }

  // COLON type_name
  private static boolean signal_definition_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "signal_definition_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && type_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
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
  // [ special_port_input_kind ] special_port_kind PORT identifier_definition [ PRIORITY expression ] [ queue_full_behavior ]
  public static boolean special_port_instance_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "special_port_instance_specifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SPECIAL_PORT_INSTANCE_SPECIFIER, "<special port instance specifier>");
    result_ = special_port_instance_specifier_0(builder_, level_ + 1);
    result_ = result_ && special_port_kind(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PORT);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && special_port_instance_specifier_4(builder_, level_ + 1);
    result_ = result_ && special_port_instance_specifier_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ special_port_input_kind ]
  private static boolean special_port_instance_specifier_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "special_port_instance_specifier_0")) return false;
    special_port_input_kind(builder_, level_ + 1);
    return true;
  }

  // [ PRIORITY expression ]
  private static boolean special_port_instance_specifier_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "special_port_instance_specifier_4")) return false;
    special_port_instance_specifier_4_0(builder_, level_ + 1);
    return true;
  }

  // PRIORITY expression
  private static boolean special_port_instance_specifier_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "special_port_instance_specifier_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PRIORITY);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ queue_full_behavior ]
  private static boolean special_port_instance_specifier_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "special_port_instance_specifier_5")) return false;
    queue_full_behavior(builder_, level_ + 1);
    return true;
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
  // STATE identifier_definition [ LEFT_BRACE state_definition_member_sequence RIGHT_BRACE ]
  public static boolean state_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_definition")) return false;
    if (!nextTokenIs(builder_, STATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STATE);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && state_definition_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, STATE_DEFINITION, result_);
    return result_;
  }

  // [ LEFT_BRACE state_definition_member_sequence RIGHT_BRACE ]
  private static boolean state_definition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_definition_2")) return false;
    state_definition_2_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_BRACE state_definition_member_sequence RIGHT_BRACE
  private static boolean state_definition_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_definition_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && state_definition_member_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // initial_transition_specifier
  //                         | choice_definition
  //                         | state_definition
  //                         | state_transition_specifier
  //                         | state_entry_specifier
  //                         | state_exit_specifier
  public static boolean state_definition_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_definition_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATE_DEFINITION_MEMBER, "<state definition member>");
    result_ = initial_transition_specifier(builder_, level_ + 1);
    if (!result_) result_ = choice_definition(builder_, level_ + 1);
    if (!result_) result_ = state_definition(builder_, level_ + 1);
    if (!result_) result_ = state_transition_specifier(builder_, level_ + 1);
    if (!result_) result_ = state_entry_specifier(builder_, level_ + 1);
    if (!result_) result_ = state_exit_specifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (state_definition_member (SEMICOLON | END_OF_LINE)*)*
  public static boolean state_definition_member_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_definition_member_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATE_DEFINITION_MEMBER_SEQUENCE, "<state definition member sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!state_definition_member_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "state_definition_member_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // state_definition_member (SEMICOLON | END_OF_LINE)*
  private static boolean state_definition_member_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_definition_member_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = state_definition_member(builder_, level_ + 1);
    result_ = result_ && state_definition_member_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SEMICOLON | END_OF_LINE)*
  private static boolean state_definition_member_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_definition_member_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!state_definition_member_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "state_definition_member_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // SEMICOLON | END_OF_LINE
  private static boolean state_definition_member_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_definition_member_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // ENTRY do_expression
  public static boolean state_entry_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_entry_specifier")) return false;
    if (!nextTokenIs(builder_, ENTRY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ENTRY);
    result_ = result_ && do_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, STATE_ENTRY_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // EXIT do_expression
  public static boolean state_exit_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_exit_specifier")) return false;
    if (!nextTokenIs(builder_, EXIT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXIT);
    result_ = result_ && do_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, STATE_EXIT_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // STATE MACHINE identifier_definition [ LEFT_BRACE state_machine_member_sequence RIGHT_BRACE ]
  public static boolean state_machine_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_definition")) return false;
    if (!nextTokenIs(builder_, STATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, STATE, MACHINE);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && state_machine_definition_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, STATE_MACHINE_DEFINITION, result_);
    return result_;
  }

  // [ LEFT_BRACE state_machine_member_sequence RIGHT_BRACE ]
  private static boolean state_machine_definition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_definition_3")) return false;
    state_machine_definition_3_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_BRACE state_machine_member_sequence RIGHT_BRACE
  private static boolean state_machine_definition_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_definition_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && state_machine_member_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // STATE MACHINE INSTANCE identifier_definition COLON qualified_identifier_state_machine_definition [ PRIORITY expression ] [ queue_full_behavior ]
  public static boolean state_machine_instance_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_instance_specifier")) return false;
    if (!nextTokenIs(builder_, STATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, STATE, MACHINE, INSTANCE);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && qualified_identifier_state_machine_definition(builder_, level_ + 1);
    result_ = result_ && state_machine_instance_specifier_6(builder_, level_ + 1);
    result_ = result_ && state_machine_instance_specifier_7(builder_, level_ + 1);
    exit_section_(builder_, marker_, STATE_MACHINE_INSTANCE_SPECIFIER, result_);
    return result_;
  }

  // [ PRIORITY expression ]
  private static boolean state_machine_instance_specifier_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_instance_specifier_6")) return false;
    state_machine_instance_specifier_6_0(builder_, level_ + 1);
    return true;
  }

  // PRIORITY expression
  private static boolean state_machine_instance_specifier_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_instance_specifier_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PRIORITY);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ queue_full_behavior ]
  private static boolean state_machine_instance_specifier_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_instance_specifier_7")) return false;
    queue_full_behavior(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // LOCATE STATE MACHINE qualified_identifier_state_machine_definition AT STRING_LITERAL
  public static boolean state_machine_location_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_location_specifier")) return false;
    if (!nextTokenIs(builder_, LOCATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LOCATE, STATE, MACHINE);
    result_ = result_ && qualified_identifier_state_machine_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, AT, STRING_LITERAL);
    exit_section_(builder_, marker_, STATE_MACHINE_LOCATION_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // choice_definition
  //                         | guard_definition
  //                         | initial_transition_specifier
  //                         | signal_definition
  //                         | state_definition
  //                         | action_definition
  public static boolean state_machine_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATE_MACHINE_MEMBER, "<state machine member>");
    result_ = choice_definition(builder_, level_ + 1);
    if (!result_) result_ = guard_definition(builder_, level_ + 1);
    if (!result_) result_ = initial_transition_specifier(builder_, level_ + 1);
    if (!result_) result_ = signal_definition(builder_, level_ + 1);
    if (!result_) result_ = state_definition(builder_, level_ + 1);
    if (!result_) result_ = action_definition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (state_machine_member (SEMICOLON | END_OF_LINE)*)*
  public static boolean state_machine_member_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_member_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATE_MACHINE_MEMBER_SEQUENCE, "<state machine member sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!state_machine_member_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "state_machine_member_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // state_machine_member (SEMICOLON | END_OF_LINE)*
  private static boolean state_machine_member_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_member_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = state_machine_member(builder_, level_ + 1);
    result_ = result_ && state_machine_member_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SEMICOLON | END_OF_LINE)*
  private static boolean state_machine_member_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_member_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!state_machine_member_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "state_machine_member_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // SEMICOLON | END_OF_LINE
  private static boolean state_machine_member_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_machine_member_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // ON identifier_signal_definition [ IF identifier_guard_definition ] transition_or_do
  public static boolean state_transition_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_transition_specifier")) return false;
    if (!nextTokenIs(builder_, ON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ON);
    result_ = result_ && identifier_signal_definition(builder_, level_ + 1);
    result_ = result_ && state_transition_specifier_2(builder_, level_ + 1);
    result_ = result_ && transition_or_do(builder_, level_ + 1);
    exit_section_(builder_, marker_, STATE_TRANSITION_SPECIFIER, result_);
    return result_;
  }

  // [ IF identifier_guard_definition ]
  private static boolean state_transition_specifier_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_transition_specifier_2")) return false;
    state_transition_specifier_2_0(builder_, level_ + 1);
    return true;
  }

  // IF identifier_guard_definition
  private static boolean state_transition_specifier_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "state_transition_specifier_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IF);
    result_ = result_ && identifier_guard_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
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
  // [ DICTIONARY ] STRUCT identifier_definition LEFT_BRACE struct_type_member_sequence RIGHT_BRACE [ DEFAULT expression ]
  public static boolean struct_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_definition")) return false;
    if (!nextTokenIs(builder_, "<struct definition>", DICTIONARY, STRUCT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRUCT_DEFINITION, "<struct definition>");
    result_ = struct_definition_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, STRUCT);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && struct_type_member_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    result_ = result_ && struct_definition_6(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ DICTIONARY ]
  private static boolean struct_definition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_definition_0")) return false;
    consumeToken(builder_, DICTIONARY);
    return true;
  }

  // [ DEFAULT expression ]
  private static boolean struct_definition_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_definition_6")) return false;
    struct_definition_6_0(builder_, level_ + 1);
    return true;
  }

  // DEFAULT expression
  private static boolean struct_definition_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_definition_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DEFAULT);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier_definition ASSIGN expression
  public static boolean struct_element(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_element")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, STRUCT_ELEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (struct_element (COMMA | END_OF_LINE)*)*
  public static boolean struct_element_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_element_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRUCT_ELEMENT_SEQUENCE, "<struct element sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!struct_element_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_element_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // struct_element (COMMA | END_OF_LINE)*
  private static boolean struct_element_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_element_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = struct_element(builder_, level_ + 1);
    result_ = result_ && struct_element_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean struct_element_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_element_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!struct_element_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_element_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean struct_element_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_element_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // LEFT_BRACE struct_element_sequence RIGHT_BRACE
  public static boolean struct_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_expression")) return false;
    if (!nextTokenIs(builder_, LEFT_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && struct_element_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, STRUCT_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier_definition COLON [ LEFT_BRACKET expression RIGHT_BRACKET ] type_name [ FORMAT STRING_LITERAL ]
  public static boolean struct_type_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_type_member")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && struct_type_member_2(builder_, level_ + 1);
    result_ = result_ && type_name(builder_, level_ + 1);
    result_ = result_ && struct_type_member_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, STRUCT_TYPE_MEMBER, result_);
    return result_;
  }

  // [ LEFT_BRACKET expression RIGHT_BRACKET ]
  private static boolean struct_type_member_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_type_member_2")) return false;
    struct_type_member_2_0(builder_, level_ + 1);
    return true;
  }

  // LEFT_BRACKET expression RIGHT_BRACKET
  private static boolean struct_type_member_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_type_member_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_BRACKET);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ FORMAT STRING_LITERAL ]
  private static boolean struct_type_member_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_type_member_4")) return false;
    parseTokens(builder_, 0, FORMAT, STRING_LITERAL);
    return true;
  }

  /* ********************************************************** */
  // (struct_type_member (COMMA | END_OF_LINE)*)*
  public static boolean struct_type_member_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_type_member_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRUCT_TYPE_MEMBER_SEQUENCE, "<struct type member sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!struct_type_member_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_type_member_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // struct_type_member (COMMA | END_OF_LINE)*
  private static boolean struct_type_member_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_type_member_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = struct_type_member(builder_, level_ + 1);
    result_ = result_ && struct_type_member_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean struct_type_member_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_type_member_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!struct_type_member_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "struct_type_member_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean struct_type_member_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "struct_type_member_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // qualified_identifier_component_instance_definition DOT IDENTIFIER
  public static boolean telemetry_channel_identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_identifier")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualified_identifier_component_instance_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOT, IDENTIFIER);
    exit_section_(builder_, marker_, TELEMETRY_CHANNEL_IDENTIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // (telemetry_channel_identifier (COMMA | END_OF_LINE)*)*
  public static boolean telemetry_channel_identifier_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_identifier_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TELEMETRY_CHANNEL_IDENTIFIER_SEQUENCE, "<telemetry channel identifier sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!telemetry_channel_identifier_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "telemetry_channel_identifier_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // telemetry_channel_identifier (COMMA | END_OF_LINE)*
  private static boolean telemetry_channel_identifier_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_identifier_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = telemetry_channel_identifier(builder_, level_ + 1);
    result_ = result_ && telemetry_channel_identifier_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean telemetry_channel_identifier_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_identifier_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!telemetry_channel_identifier_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "telemetry_channel_identifier_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean telemetry_channel_identifier_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_identifier_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // TELEMETRY identifier_definition COLON type_name [ ID expression ] [ UPDATE telemetry_update ] [ FORMAT STRING_LITERAL ] [ LOW LEFT_BRACE telemetry_limit_sequence RIGHT_BRACE ] [ HIGH LEFT_BRACE telemetry_limit_sequence RIGHT_BRACE ]
  public static boolean telemetry_channel_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_channel_specifier")) return false;
    if (!nextTokenIs(builder_, TELEMETRY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TELEMETRY);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
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
  // include_specifier
  //                                 | telemetry_packet_specifier
  public static boolean telemetry_packet_group_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_group_member")) return false;
    if (!nextTokenIs(builder_, "<telemetry packet group member>", INCLUDE, PACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TELEMETRY_PACKET_GROUP_MEMBER, "<telemetry packet group member>");
    result_ = include_specifier(builder_, level_ + 1);
    if (!result_) result_ = telemetry_packet_specifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (telemetry_packet_group_member (COMMA | END_OF_LINE)*)*
  public static boolean telemetry_packet_group_member_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_group_member_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TELEMETRY_PACKET_GROUP_MEMBER_SEQUENCE, "<telemetry packet group member sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!telemetry_packet_group_member_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "telemetry_packet_group_member_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // telemetry_packet_group_member (COMMA | END_OF_LINE)*
  private static boolean telemetry_packet_group_member_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_group_member_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = telemetry_packet_group_member(builder_, level_ + 1);
    result_ = result_ && telemetry_packet_group_member_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean telemetry_packet_group_member_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_group_member_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!telemetry_packet_group_member_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "telemetry_packet_group_member_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean telemetry_packet_group_member_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_group_member_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // non_annotatable_include_specifier
  //                             | telemetry_channel_identifier
  public static boolean telemetry_packet_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_member")) return false;
    if (!nextTokenIs(builder_, "<telemetry packet member>", IDENTIFIER, INCLUDE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TELEMETRY_PACKET_MEMBER, "<telemetry packet member>");
    result_ = non_annotatable_include_specifier(builder_, level_ + 1);
    if (!result_) result_ = telemetry_channel_identifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (telemetry_packet_member (COMMA | END_OF_LINE)*)*
  public static boolean telemetry_packet_member_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_member_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TELEMETRY_PACKET_MEMBER_SEQUENCE, "<telemetry packet member sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!telemetry_packet_member_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "telemetry_packet_member_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // telemetry_packet_member (COMMA | END_OF_LINE)*
  private static boolean telemetry_packet_member_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_member_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = telemetry_packet_member(builder_, level_ + 1);
    result_ = result_ && telemetry_packet_member_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA | END_OF_LINE)*
  private static boolean telemetry_packet_member_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_member_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!telemetry_packet_member_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "telemetry_packet_member_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // COMMA | END_OF_LINE
  private static boolean telemetry_packet_member_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_member_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // TELEMETRY PACKETS IDENTIFIER LEFT_BRACE telemetry_packet_group_member_sequence RIGHT_BRACE [ OMIT LEFT_BRACE telemetry_channel_identifier_sequence RIGHT_BRACE ]
  public static boolean telemetry_packet_set_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_set_specifier")) return false;
    if (!nextTokenIs(builder_, TELEMETRY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, TELEMETRY, PACKETS, IDENTIFIER, LEFT_BRACE);
    result_ = result_ && telemetry_packet_group_member_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    result_ = result_ && telemetry_packet_set_specifier_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, TELEMETRY_PACKET_SET_SPECIFIER, result_);
    return result_;
  }

  // [ OMIT LEFT_BRACE telemetry_channel_identifier_sequence RIGHT_BRACE ]
  private static boolean telemetry_packet_set_specifier_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_set_specifier_6")) return false;
    telemetry_packet_set_specifier_6_0(builder_, level_ + 1);
    return true;
  }

  // OMIT LEFT_BRACE telemetry_channel_identifier_sequence RIGHT_BRACE
  private static boolean telemetry_packet_set_specifier_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_set_specifier_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, OMIT, LEFT_BRACE);
    result_ = result_ && telemetry_channel_identifier_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PACKET IDENTIFIER [ ID expression ] GROUP expression LEFT_BRACE telemetry_packet_member_sequence RIGHT_BRACE
  public static boolean telemetry_packet_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_specifier")) return false;
    if (!nextTokenIs(builder_, PACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PACKET, IDENTIFIER);
    result_ = result_ && telemetry_packet_specifier_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GROUP);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && telemetry_packet_member_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, TELEMETRY_PACKET_SPECIFIER, result_);
    return result_;
  }

  // [ ID expression ]
  private static boolean telemetry_packet_specifier_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_specifier_2")) return false;
    telemetry_packet_specifier_2_0(builder_, level_ + 1);
    return true;
  }

  // ID expression
  private static boolean telemetry_packet_specifier_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "telemetry_packet_specifier_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
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
  // TOPOLOGY identifier_definition LEFT_BRACE topology_member_sequence RIGHT_BRACE
  public static boolean topology_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topology_definition")) return false;
    if (!nextTokenIs(builder_, TOPOLOGY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TOPOLOGY);
    result_ = result_ && identifier_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LEFT_BRACE);
    result_ = result_ && topology_member_sequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACE);
    exit_section_(builder_, marker_, TOPOLOGY_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IMPORT qualified_identifier_topology_definition
  public static boolean topology_import_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topology_import_specifier")) return false;
    if (!nextTokenIs(builder_, IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IMPORT);
    result_ = result_ && qualified_identifier_topology_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, TOPOLOGY_IMPORT_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // LOCATE TOPOLOGY qualified_identifier_topology_definition AT STRING_LITERAL
  public static boolean topology_location_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topology_location_specifier")) return false;
    if (!nextTokenIs(builder_, LOCATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LOCATE, TOPOLOGY);
    result_ = result_ && qualified_identifier_topology_definition(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, AT, STRING_LITERAL);
    exit_section_(builder_, marker_, TOPOLOGY_LOCATION_SPECIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // component_instance_specifier
  //                     | connection_graph_specifier
  //                     | telemetry_packet_set_specifier
  //                     | topology_import_specifier
  //                     | include_specifier
  public static boolean topology_member(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topology_member")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TOPOLOGY_MEMBER, "<topology member>");
    result_ = component_instance_specifier(builder_, level_ + 1);
    if (!result_) result_ = connection_graph_specifier(builder_, level_ + 1);
    if (!result_) result_ = telemetry_packet_set_specifier(builder_, level_ + 1);
    if (!result_) result_ = topology_import_specifier(builder_, level_ + 1);
    if (!result_) result_ = include_specifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (topology_member (SEMICOLON | END_OF_LINE)*)*
  public static boolean topology_member_sequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topology_member_sequence")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TOPOLOGY_MEMBER_SEQUENCE, "<topology member sequence>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!topology_member_sequence_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "topology_member_sequence", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // topology_member (SEMICOLON | END_OF_LINE)*
  private static boolean topology_member_sequence_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topology_member_sequence_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = topology_member(builder_, level_ + 1);
    result_ = result_ && topology_member_sequence_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SEMICOLON | END_OF_LINE)*
  private static boolean topology_member_sequence_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topology_member_sequence_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!topology_member_sequence_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "topology_member_sequence_0_1", pos_)) break;
    }
    return true;
  }

  // SEMICOLON | END_OF_LINE
  private static boolean topology_member_sequence_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "topology_member_sequence_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = consumeToken(builder_, END_OF_LINE);
    return result_;
  }

  /* ********************************************************** */
  // [ do_expression ] ENTER qualified_identifier_state_or_choice_definition
  public static boolean transition_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "transition_expression")) return false;
    if (!nextTokenIs(builder_, "<transition expression>", DO, ENTER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TRANSITION_EXPRESSION, "<transition expression>");
    result_ = transition_expression_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ENTER);
    result_ = result_ && qualified_identifier_state_or_choice_definition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ do_expression ]
  private static boolean transition_expression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "transition_expression_0")) return false;
    do_expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // transition_expression
  //                     | do_expression
  public static boolean transition_or_do(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "transition_or_do")) return false;
    if (!nextTokenIs(builder_, "<transition or do>", DO, ENTER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TRANSITION_OR_DO, "<transition or do>");
    result_ = transition_expression(builder_, level_ + 1);
    if (!result_) result_ = do_expression(builder_, level_ + 1);
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
  // LOCATE [ DICTIONARY ] TYPE qualified_identifier_type_location_specifier AT STRING_LITERAL
  public static boolean type_location_specifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_location_specifier")) return false;
    if (!nextTokenIs(builder_, LOCATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LOCATE);
    result_ = result_ && type_location_specifier_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPE);
    result_ = result_ && qualified_identifier_type_location_specifier(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, AT, STRING_LITERAL);
    exit_section_(builder_, marker_, TYPE_LOCATION_SPECIFIER, result_);
    return result_;
  }

  // [ DICTIONARY ]
  private static boolean type_location_specifier_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_location_specifier_1")) return false;
    consumeToken(builder_, DICTIONARY);
    return true;
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
