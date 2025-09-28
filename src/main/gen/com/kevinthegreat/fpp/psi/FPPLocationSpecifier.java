// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPLocationSpecifier extends PsiElement {

  @Nullable
  FPPComponentInstanceLocationSpecifier getComponentInstanceLocationSpecifier();

  @Nullable
  FPPComponentLocationSpecifier getComponentLocationSpecifier();

  @Nullable
  FPPConstantLocationSpecifier getConstantLocationSpecifier();

  @Nullable
  FPPPortLocationSpecifier getPortLocationSpecifier();

  @Nullable
  FPPStateMachineLocationSpecifier getStateMachineLocationSpecifier();

  @Nullable
  FPPTopologyLocationSpecifier getTopologyLocationSpecifier();

  @Nullable
  FPPTypeLocationSpecifier getTypeLocationSpecifier();

}
