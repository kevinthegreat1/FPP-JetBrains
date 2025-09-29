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

public class FPPStateDefinitionMemberImpl extends ASTWrapperPsiElement implements FPPStateDefinitionMember {

  public FPPStateDefinitionMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitStateDefinitionMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FPPChoiceDefinition getChoiceDefinition() {
    return findChildByClass(FPPChoiceDefinition.class);
  }

  @Override
  @Nullable
  public FPPInitialTransitionSpecifier getInitialTransitionSpecifier() {
    return findChildByClass(FPPInitialTransitionSpecifier.class);
  }

  @Override
  @Nullable
  public FPPStateDefinition getStateDefinition() {
    return findChildByClass(FPPStateDefinition.class);
  }

  @Override
  @Nullable
  public FPPStateEntrySpecifier getStateEntrySpecifier() {
    return findChildByClass(FPPStateEntrySpecifier.class);
  }

  @Override
  @Nullable
  public FPPStateExitSpecifier getStateExitSpecifier() {
    return findChildByClass(FPPStateExitSpecifier.class);
  }

  @Override
  @Nullable
  public FPPStateTransitionSpecifier getStateTransitionSpecifier() {
    return findChildByClass(FPPStateTransitionSpecifier.class);
  }

}
