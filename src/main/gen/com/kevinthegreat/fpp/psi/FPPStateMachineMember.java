// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPStateMachineMember extends PsiElement {

  @Nullable
  FPPActionDefinition getActionDefinition();

  @Nullable
  FPPChoiceDefinition getChoiceDefinition();

  @Nullable
  FPPGuardDefinition getGuardDefinition();

  @Nullable
  FPPInitialTransitionSpecifier getInitialTransitionSpecifier();

  @Nullable
  FPPSignalDefinition getSignalDefinition();

  @Nullable
  FPPStateDefinition getStateDefinition();

}
