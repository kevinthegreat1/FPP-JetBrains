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

public class FPPExpressionPrimaryImpl extends ASTWrapperPsiElement implements FPPExpressionPrimary {

  public FPPExpressionPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitExpressionPrimary(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FPPArrayExpression getArrayExpression() {
    return findChildByClass(FPPArrayExpression.class);
  }

  @Override
  @Nullable
  public FPPBooleanLiteral getBooleanLiteral() {
    return findChildByClass(FPPBooleanLiteral.class);
  }

  @Override
  @Nullable
  public FPPExpression getExpression() {
    return findChildByClass(FPPExpression.class);
  }

  @Override
  @Nullable
  public FPPQualifiedIdentifier getQualifiedIdentifier() {
    return findChildByClass(FPPQualifiedIdentifier.class);
  }

  @Override
  @Nullable
  public FPPStructExpression getStructExpression() {
    return findChildByClass(FPPStructExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getFloatingPointLiteral() {
    return findChildByType(FLOATING_POINT_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getIntegerLiteral() {
    return findChildByType(INTEGER_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getStringLiteral() {
    return findChildByType(STRING_LITERAL);
  }

}
