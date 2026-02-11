// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPTelemetryChannelSpecifier extends FPPNamedElement {

  @Nullable
  FPPExpression getExpression();

  @NotNull
  FPPIdentifierDefinition getIdentifierDefinition();

  @NotNull
  List<FPPTelemetryLimitSequence> getTelemetryLimitSequenceList();

  @Nullable
  FPPTelemetryUpdate getTelemetryUpdate();

  @NotNull
  FPPTypeName getTypeName();

  @Nullable
  PsiElement getStringLiteral();

}
