// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kevinthegreat.fpp.psi.FPPTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.kevinthegreat.fpp.psi.*;

public class FPPStateMachineMemberImpl extends ASTWrapperPsiElement implements FPPStateMachineMember {

  public FPPStateMachineMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitStateMachineMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FPPActionDefinition getActionDefinition() {
    return findChildByClass(FPPActionDefinition.class);
  }

  @Override
  @Nullable
  public FPPChoiceDefinition getChoiceDefinition() {
    return findChildByClass(FPPChoiceDefinition.class);
  }

  @Override
  @Nullable
  public FPPGuardDefinition getGuardDefinition() {
    return findChildByClass(FPPGuardDefinition.class);
  }

  @Override
  @Nullable
  public FPPInitialTransitionSpecifier getInitialTransitionSpecifier() {
    return findChildByClass(FPPInitialTransitionSpecifier.class);
  }

  @Override
  @Nullable
  public FPPSignalDefinition getSignalDefinition() {
    return findChildByClass(FPPSignalDefinition.class);
  }

  @Override
  @Nullable
  public FPPStateDefinition getStateDefinition() {
    return findChildByClass(FPPStateDefinition.class);
  }

}
