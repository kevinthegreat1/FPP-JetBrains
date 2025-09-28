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

public class FPPConnectionGraphSpecifierImpl extends ASTWrapperPsiElement implements FPPConnectionGraphSpecifier {

  public FPPConnectionGraphSpecifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitConnectionGraphSpecifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FPPDirectGraphSpecifier getDirectGraphSpecifier() {
    return findChildByClass(FPPDirectGraphSpecifier.class);
  }

  @Override
  @Nullable
  public FPPPatternGraphSpecifier getPatternGraphSpecifier() {
    return findChildByClass(FPPPatternGraphSpecifier.class);
  }

}
