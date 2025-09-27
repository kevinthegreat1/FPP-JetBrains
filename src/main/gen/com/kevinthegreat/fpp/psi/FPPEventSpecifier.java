// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPEventSpecifier extends PsiElement {

  @NotNull
  FPPEventSeverity getEventSeverity();

  @NotNull
  List<FPPExpression> getExpressionList();

  @Nullable
  FPPParamList getParamList();

  @NotNull
  PsiElement getIdentifier();

  @NotNull
  PsiElement getStringLiteral();

}
