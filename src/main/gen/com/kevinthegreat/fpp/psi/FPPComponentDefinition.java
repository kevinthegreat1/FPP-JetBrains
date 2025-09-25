// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPComponentDefinition extends PsiElement {

  @NotNull
  FPPComponentKind getComponentKind();

  @NotNull
  FPPComponentMemberSequence getComponentMemberSequence();

  @NotNull
  PsiElement getIdentifier();

}
