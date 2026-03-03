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

public class FPPQualifiedIdentifierComponentInstanceDefinitionQualifierImpl extends ASTWrapperPsiElement implements FPPQualifiedIdentifierComponentInstanceDefinitionQualifier {

  public FPPQualifiedIdentifierComponentInstanceDefinitionQualifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitQualifiedIdentifierComponentInstanceDefinitionQualifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FPPQualifiedIdentifierQualifier getQualifiedIdentifierQualifier() {
    return findNotNullChildByClass(FPPQualifiedIdentifierQualifier.class);
  }

}
