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

public class FPPTelemetryChannelSpecifierImpl extends ASTWrapperPsiElement implements FPPTelemetryChannelSpecifier {

  public FPPTelemetryChannelSpecifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitTelemetryChannelSpecifier(this);
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
  public List<FPPTelemetryLimitSequence> getTelemetryLimitSequenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FPPTelemetryLimitSequence.class);
  }

  @Override
  @Nullable
  public FPPTelemetryUpdate getTelemetryUpdate() {
    return findChildByClass(FPPTelemetryUpdate.class);
  }

  @Override
  @NotNull
  public FPPTypeName getTypeName() {
    return findNotNullChildByClass(FPPTypeName.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getStringLiteral() {
    return findChildByType(STRING_LITERAL);
  }

}
