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

public class FPPModuleMemberImpl extends ASTWrapperPsiElement implements FPPModuleMember {

  public FPPModuleMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitModuleMember(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FPPAbstractTypeDefinition getAbstractTypeDefinition() {
    return findChildByClass(FPPAbstractTypeDefinition.class);
  }

  @Override
  @Nullable
  public FPPAliasTypeDefinition getAliasTypeDefinition() {
    return findChildByClass(FPPAliasTypeDefinition.class);
  }

  @Override
  @Nullable
  public FPPArrayDefinition getArrayDefinition() {
    return findChildByClass(FPPArrayDefinition.class);
  }

  @Override
  @Nullable
  public FPPComponentDefinition getComponentDefinition() {
    return findChildByClass(FPPComponentDefinition.class);
  }

  @Override
  @Nullable
  public FPPComponentInstanceDefinition getComponentInstanceDefinition() {
    return findChildByClass(FPPComponentInstanceDefinition.class);
  }

  @Override
  @Nullable
  public FPPConstantDefinition getConstantDefinition() {
    return findChildByClass(FPPConstantDefinition.class);
  }

  @Override
  @Nullable
  public FPPEnumDefinition getEnumDefinition() {
    return findChildByClass(FPPEnumDefinition.class);
  }

  @Override
  @Nullable
  public FPPIncludeSpecifier getIncludeSpecifier() {
    return findChildByClass(FPPIncludeSpecifier.class);
  }

  @Override
  @Nullable
  public FPPLocationSpecifier getLocationSpecifier() {
    return findChildByClass(FPPLocationSpecifier.class);
  }

  @Override
  @Nullable
  public FPPModuleDefinition getModuleDefinition() {
    return findChildByClass(FPPModuleDefinition.class);
  }

  @Override
  @Nullable
  public FPPPortDefinition getPortDefinition() {
    return findChildByClass(FPPPortDefinition.class);
  }

  @Override
  @Nullable
  public FPPPortInterfaceDefinition getPortInterfaceDefinition() {
    return findChildByClass(FPPPortInterfaceDefinition.class);
  }

  @Override
  @Nullable
  public FPPStructDefinition getStructDefinition() {
    return findChildByClass(FPPStructDefinition.class);
  }

  @Override
  @Nullable
  public FPPTopologyDefinition getTopologyDefinition() {
    return findChildByClass(FPPTopologyDefinition.class);
  }

}
