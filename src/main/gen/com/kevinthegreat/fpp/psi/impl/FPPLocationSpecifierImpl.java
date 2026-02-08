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

public class FPPLocationSpecifierImpl extends ASTWrapperPsiElement implements FPPLocationSpecifier {

  public FPPLocationSpecifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitLocationSpecifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FPPComponentInstanceLocationSpecifier getComponentInstanceLocationSpecifier() {
    return findChildByClass(FPPComponentInstanceLocationSpecifier.class);
  }

  @Override
  @Nullable
  public FPPComponentLocationSpecifier getComponentLocationSpecifier() {
    return findChildByClass(FPPComponentLocationSpecifier.class);
  }

  @Override
  @Nullable
  public FPPConstantLocationSpecifier getConstantLocationSpecifier() {
    return findChildByClass(FPPConstantLocationSpecifier.class);
  }

  @Override
  @Nullable
  public FPPPortInterfaceLocationSpecifier getPortInterfaceLocationSpecifier() {
    return findChildByClass(FPPPortInterfaceLocationSpecifier.class);
  }

  @Override
  @Nullable
  public FPPPortLocationSpecifier getPortLocationSpecifier() {
    return findChildByClass(FPPPortLocationSpecifier.class);
  }

  @Override
  @Nullable
  public FPPStateMachineLocationSpecifier getStateMachineLocationSpecifier() {
    return findChildByClass(FPPStateMachineLocationSpecifier.class);
  }

  @Override
  @Nullable
  public FPPTopologyLocationSpecifier getTopologyLocationSpecifier() {
    return findChildByClass(FPPTopologyLocationSpecifier.class);
  }

  @Override
  @Nullable
  public FPPTypeLocationSpecifier getTypeLocationSpecifier() {
    return findChildByClass(FPPTypeLocationSpecifier.class);
  }

}
