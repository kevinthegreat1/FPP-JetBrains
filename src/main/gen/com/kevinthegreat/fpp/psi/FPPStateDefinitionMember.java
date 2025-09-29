// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPStateDefinitionMember extends PsiElement {

  @Nullable
  FPPChoiceDefinition getChoiceDefinition();

  @Nullable
  FPPInitialTransitionSpecifier getInitialTransitionSpecifier();

  @Nullable
  FPPStateDefinition getStateDefinition();

  @Nullable
  FPPStateEntrySpecifier getStateEntrySpecifier();

  @Nullable
  FPPStateExitSpecifier getStateExitSpecifier();

  @Nullable
  FPPStateTransitionSpecifier getStateTransitionSpecifier();

}
