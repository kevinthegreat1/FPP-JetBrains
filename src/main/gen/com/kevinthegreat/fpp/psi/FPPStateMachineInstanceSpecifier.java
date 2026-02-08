// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPStateMachineInstanceSpecifier extends PsiElement {

  @Nullable
  FPPExpression getExpression();

  @NotNull
  FPPQualifiedIdentifierStateMachineDefinition getQualifiedIdentifierStateMachineDefinition();

  @Nullable
  FPPQueueFullBehavior getQueueFullBehavior();

  @NotNull
  PsiElement getIdentifier();

}
