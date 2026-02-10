// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPComponentInstanceDefinition extends FPPNamedElement {

  @NotNull
  List<FPPExpression> getExpressionList();

  @NotNull
  FPPIdentifierDefinition getIdentifierDefinition();

  @Nullable
  FPPInitSpecifierSequence getInitSpecifierSequence();

  @NotNull
  FPPQualifiedIdentifierComponentDefinition getQualifiedIdentifierComponentDefinition();

}
