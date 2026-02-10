// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPStructTypeMember extends FPPNamedElement {

  @Nullable
  FPPExpression getExpression();

  @NotNull
  FPPIdentifierDefinition getIdentifierDefinition();

  @NotNull
  FPPTypeName getTypeName();

  @Nullable
  PsiElement getStringLiteral();

}
