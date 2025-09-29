// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPExpressionPrimary extends PsiElement {

  @Nullable
  FPPArrayExpression getArrayExpression();

  @Nullable
  FPPExpression getExpression();

  @Nullable
  FPPQualifiedIdentifier getQualifiedIdentifier();

  @Nullable
  FPPStructExpression getStructExpression();

  @Nullable
  PsiElement getBooleanLiteral();

  @Nullable
  PsiElement getFloatingPointLiteral();

  @Nullable
  PsiElement getIntegerLiteral();

  @Nullable
  PsiElement getStringLiteral();

}
