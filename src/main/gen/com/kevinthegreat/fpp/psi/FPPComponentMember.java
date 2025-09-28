// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPComponentMember extends PsiElement {

  @Nullable
  FPPAbstractTypeDefinition getAbstractTypeDefinition();

  @Nullable
  FPPAliasTypeDefinition getAliasTypeDefinition();

  @Nullable
  FPPArrayDefinition getArrayDefinition();

  @Nullable
  FPPCommandSpecifier getCommandSpecifier();

  @Nullable
  FPPConstantDefinition getConstantDefinition();

  @Nullable
  FPPEnumDefinition getEnumDefinition();

  @Nullable
  FPPEventSpecifier getEventSpecifier();

  @Nullable
  FPPPortInstanceSpecifier getPortInstanceSpecifier();

  @Nullable
  FPPStructDefinition getStructDefinition();

  @Nullable
  FPPTelemetryChannelSpecifier getTelemetryChannelSpecifier();

}
