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

public class FPPComponentMemberImpl extends ASTWrapperPsiElement implements FPPComponentMember {

  public FPPComponentMemberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitComponentMember(this);
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
  public FPPCommandSpecifier getCommandSpecifier() {
    return findChildByClass(FPPCommandSpecifier.class);
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
  public FPPEventSpecifier getEventSpecifier() {
    return findChildByClass(FPPEventSpecifier.class);
  }

  @Override
  @Nullable
  public FPPPortInstanceSpecifier getPortInstanceSpecifier() {
    return findChildByClass(FPPPortInstanceSpecifier.class);
  }

  @Override
  @Nullable
  public FPPStructDefinition getStructDefinition() {
    return findChildByClass(FPPStructDefinition.class);
  }

  @Override
  @Nullable
  public FPPTelemetryChannelSpecifier getTelemetryChannelSpecifier() {
    return findChildByClass(FPPTelemetryChannelSpecifier.class);
  }

}
