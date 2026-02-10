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

public class FPPStructTypeMemberImpl extends FPPNamedElementImpl implements FPPStructTypeMember {

  public FPPStructTypeMemberImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitStructTypeMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FPPExpression getExpression() {
    return findChildByClass(FPPExpression.class);
  }

  @Override
  @NotNull
  public FPPIdentifierDefinition getIdentifierDefinition() {
    return findNotNullChildByClass(FPPIdentifierDefinition.class);
  }

  @Override
  @NotNull
  public FPPTypeName getTypeName() {
    return findNotNullChildByClass(FPPTypeName.class);
  }

  @Override
  @Nullable
  public PsiElement getStringLiteral() {
    return findChildByType(STRING_LITERAL);
  }

}
