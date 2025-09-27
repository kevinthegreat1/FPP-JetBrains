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

public class FPPPortInstanceSpecifierImpl extends ASTWrapperPsiElement implements FPPPortInstanceSpecifier {

  public FPPPortInstanceSpecifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitPortInstanceSpecifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FPPExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FPPExpression.class);
  }

  @Override
  @Nullable
  public FPPGeneralPortKind getGeneralPortKind() {
    return findChildByClass(FPPGeneralPortKind.class);
  }

  @Override
  @Nullable
  public FPPPortInstanceType getPortInstanceType() {
    return findChildByClass(FPPPortInstanceType.class);
  }

  @Override
  @Nullable
  public FPPQueueFullBehavior getQueueFullBehavior() {
    return findChildByClass(FPPQueueFullBehavior.class);
  }

  @Override
  @Nullable
  public FPPSpecialPortInputKind getSpecialPortInputKind() {
    return findChildByClass(FPPSpecialPortInputKind.class);
  }

  @Override
  @Nullable
  public FPPSpecialPortKind getSpecialPortKind() {
    return findChildByClass(FPPSpecialPortKind.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
