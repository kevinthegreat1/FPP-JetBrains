// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPChoiceDefinition extends FPPNamedElement {

  @NotNull
  FPPIdentifierDefinition getIdentifierDefinition();

  @NotNull
  List<FPPTransitionExpression> getTransitionExpressionList();

  @NotNull
  PsiElement getIdentifier();

}
