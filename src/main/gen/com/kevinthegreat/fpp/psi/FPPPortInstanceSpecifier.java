// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPPortInstanceSpecifier extends PsiElement {

  @NotNull
  List<FPPExpression> getExpressionList();

  @Nullable
  FPPGeneralPortKind getGeneralPortKind();

  @Nullable
  FPPPortInstanceType getPortInstanceType();

  @Nullable
  FPPQueueFullBehavior getQueueFullBehavior();

  @Nullable
  FPPSpecialPortInputKind getSpecialPortInputKind();

  @Nullable
  FPPSpecialPortKind getSpecialPortKind();

  @NotNull
  PsiElement getIdentifier();

}
