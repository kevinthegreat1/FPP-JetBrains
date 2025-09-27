// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPComponentMember extends PsiElement {

  @Nullable
  FPPCommandSpecifier getCommandSpecifier();

  @Nullable
  FPPEventSpecifier getEventSpecifier();

  @Nullable
  FPPPortInstanceSpecifier getPortInstanceSpecifier();

  @Nullable
  FPPTelemetryChannelSpecifier getTelemetryChannelSpecifier();

}
