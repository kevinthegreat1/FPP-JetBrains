// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPCommandSpecifier extends FPPNamedElement {

  @NotNull
  FPPCommandKind getCommandKind();

  @NotNull
  List<FPPExpression> getExpressionList();

  @NotNull
  FPPIdentifierDefinition getIdentifierDefinition();

  @Nullable
  FPPParamList getParamList();

  @Nullable
  FPPQueueFullBehavior getQueueFullBehavior();

}
