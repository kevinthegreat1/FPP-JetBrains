// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPCommandSpecifier extends PsiElement {

  @NotNull
  FPPCommandKind getCommandKind();

  @Nullable
  FPPParamList getParamList();

  @Nullable
  FPPQueueFullBehavior getQueueFullBehavior();

  @NotNull
  PsiElement getIdentifier();

}
