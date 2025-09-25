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

public class FPPTypeNameImpl extends ASTWrapperPsiElement implements FPPTypeName {

  public FPPTypeNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitTypeName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FPPFloatingPointTypeName getFloatingPointTypeName() {
    return findChildByClass(FPPFloatingPointTypeName.class);
  }

  @Override
  @Nullable
  public FPPPrimitiveIntegerTypeName getPrimitiveIntegerTypeName() {
    return findChildByClass(FPPPrimitiveIntegerTypeName.class);
  }

  @Override
  @Nullable
  public FPPQualifiedIdentifierTypeName getQualifiedIdentifierTypeName() {
    return findChildByClass(FPPQualifiedIdentifierTypeName.class);
  }

  @Override
  @Nullable
  public FPPStringTypeName getStringTypeName() {
    return findChildByClass(FPPStringTypeName.class);
  }

}
