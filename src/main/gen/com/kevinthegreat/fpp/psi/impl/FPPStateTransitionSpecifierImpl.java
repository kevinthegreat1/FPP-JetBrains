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

public class FPPStateTransitionSpecifierImpl extends ASTWrapperPsiElement implements FPPStateTransitionSpecifier {

  public FPPStateTransitionSpecifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitStateTransitionSpecifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FPPIdentifierGuardDefinition getIdentifierGuardDefinition() {
    return findChildByClass(FPPIdentifierGuardDefinition.class);
  }

  @Override
  @NotNull
  public FPPIdentifierSignalDefinition getIdentifierSignalDefinition() {
    return findNotNullChildByClass(FPPIdentifierSignalDefinition.class);
  }

  @Override
  @NotNull
  public FPPTransitionOrDo getTransitionOrDo() {
    return findNotNullChildByClass(FPPTransitionOrDo.class);
  }

}
