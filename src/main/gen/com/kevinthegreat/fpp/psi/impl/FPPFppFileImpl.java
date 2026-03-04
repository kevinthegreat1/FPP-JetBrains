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

public class FPPFppFileImpl extends ASTWrapperPsiElement implements FPPFppFile {

  public FPPFppFileImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FPPVisitor visitor) {
    visitor.visitFppFile(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FPPVisitor) accept((FPPVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FPPComponentMemberSequenceNonEmpty getComponentMemberSequenceNonEmpty() {
    return findChildByClass(FPPComponentMemberSequenceNonEmpty.class);
  }

  @Override
  @Nullable
  public FPPTelemetryPacketGroupMemberSequenceNonEmpty getTelemetryPacketGroupMemberSequenceNonEmpty() {
    return findChildByClass(FPPTelemetryPacketGroupMemberSequenceNonEmpty.class);
  }

  @Override
  @Nullable
  public FPPTelemetryPacketMemberSequenceNonEmpty getTelemetryPacketMemberSequenceNonEmpty() {
    return findChildByClass(FPPTelemetryPacketMemberSequenceNonEmpty.class);
  }

  @Override
  @Nullable
  public FPPTopologyMemberSequenceNonEmpty getTopologyMemberSequenceNonEmpty() {
    return findChildByClass(FPPTopologyMemberSequenceNonEmpty.class);
  }

  @Override
  @Nullable
  public FPPTranslationUnit getTranslationUnit() {
    return findChildByClass(FPPTranslationUnit.class);
  }

}
