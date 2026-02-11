// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPParameterSpecifier extends FPPNamedElement {

  @NotNull
  List<FPPExpression> getExpressionList();

  @NotNull
  FPPIdentifierDefinition getIdentifierDefinition();

  @NotNull
  FPPTypeName getTypeName();

}
