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

public class FPPCommandSpecifierImpl extends ASTWrapperPsiElement implements FPPCommandSpecifier {

  public FPPCommandSpecifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitCommandSpecifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FPPCommandKind getCommandKind() {
    return findNotNullChildByClass(FPPCommandKind.class);
  }

  @Override
  @Nullable
  public FPPParamList getParamList() {
    return findChildByClass(FPPParamList.class);
  }

  @Override
  @Nullable
  public FPPQueueFullBehavior getQueueFullBehavior() {
    return findChildByClass(FPPQueueFullBehavior.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
