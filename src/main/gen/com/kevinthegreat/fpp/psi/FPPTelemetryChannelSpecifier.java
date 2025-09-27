// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPTelemetryChannelSpecifier extends PsiElement {

  @Nullable
  FPPExpression getExpression();

  @NotNull
  List<FPPTelemetryLimitSequence> getTelemetryLimitSequenceList();

  @Nullable
  FPPTelemetryUpdate getTelemetryUpdate();

  @NotNull
  FPPTypeName getTypeName();

  @NotNull
  PsiElement getIdentifier();

  @Nullable
  PsiElement getStringLiteral();

}
