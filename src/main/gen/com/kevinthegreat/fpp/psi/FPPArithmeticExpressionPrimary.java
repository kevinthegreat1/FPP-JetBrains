// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPArithmeticExpressionPrimary extends PsiElement {

  @Nullable
  FPPExpression getExpression();

  @Nullable
  FPPQualifiedIdentifier getQualifiedIdentifier();

  @Nullable
  PsiElement getFloatingPointLiteral();

  @Nullable
  PsiElement getIntegerLiteral();

}
