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

public class FPPPatternGraphSpecifierImpl extends ASTWrapperPsiElement implements FPPPatternGraphSpecifier {

  public FPPPatternGraphSpecifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitPatternGraphSpecifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FPPInstanceSequence getInstanceSequence() {
    return findChildByClass(FPPInstanceSequence.class);
  }

  @Override
  @NotNull
  public FPPPatternKind getPatternKind() {
    return findNotNullChildByClass(FPPPatternKind.class);
  }

  @Override
  @NotNull
  public FPPQualifiedIdentifierComponentInstanceDefinition getQualifiedIdentifierComponentInstanceDefinition() {
    return findNotNullChildByClass(FPPQualifiedIdentifierComponentInstanceDefinition.class);
  }

}
