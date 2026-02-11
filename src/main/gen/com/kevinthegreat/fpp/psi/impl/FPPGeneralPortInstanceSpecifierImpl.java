// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kevinthegreat.fpp.psi.FPPTypes.*;
import com.kevinthegreat.fpp.psi.*;

public class FPPGeneralPortInstanceSpecifierImpl extends FPPNamedElementImpl implements FPPGeneralPortInstanceSpecifier {

  public FPPGeneralPortInstanceSpecifierImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitGeneralPortInstanceSpecifier(this);
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
  @NotNull
  public FPPGeneralPortKind getGeneralPortKind() {
    return findNotNullChildByClass(FPPGeneralPortKind.class);
  }

  @Override
  @NotNull
  public FPPIdentifierDefinition getIdentifierDefinition() {
    return findNotNullChildByClass(FPPIdentifierDefinition.class);
  }

  @Override
  @NotNull
  public FPPPortInstanceType getPortInstanceType() {
    return findNotNullChildByClass(FPPPortInstanceType.class);
  }

  @Override
  @Nullable
  public FPPQueueFullBehavior getQueueFullBehavior() {
    return findChildByClass(FPPQueueFullBehavior.class);
  }

}
