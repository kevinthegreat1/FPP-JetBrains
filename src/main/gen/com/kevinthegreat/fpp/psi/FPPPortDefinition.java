// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPPortDefinition extends FPPNamedElement {

  @NotNull
  FPPIdentifierDefinition getIdentifierDefinition();

  @Nullable
  FPPParamList getParamList();

  @Nullable
  FPPTypeName getTypeName();

}
