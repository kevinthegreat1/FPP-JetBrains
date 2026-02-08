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

public class FPPComponentInstanceDefinitionImpl extends ASTWrapperPsiElement implements FPPComponentInstanceDefinition {

  public FPPComponentInstanceDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitComponentInstanceDefinition(this);
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
  public FPPInitSpecifierSequence getInitSpecifierSequence() {
    return findChildByClass(FPPInitSpecifierSequence.class);
  }

  @Override
  @NotNull
  public FPPQualifiedIdentifierComponentDefinition getQualifiedIdentifierComponentDefinition() {
    return findNotNullChildByClass(FPPQualifiedIdentifierComponentDefinition.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
