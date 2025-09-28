// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPTopologyMember extends PsiElement {

  @Nullable
  FPPComponentInstanceSpecifier getComponentInstanceSpecifier();

  @Nullable
  FPPConnectionGraphSpecifier getConnectionGraphSpecifier();

  @Nullable
  FPPIncludeSpecifier getIncludeSpecifier();

  @Nullable
  FPPTelemetryPacketSetSpecifier getTelemetryPacketSetSpecifier();

  @Nullable
  FPPTopologyImportSpecifier getTopologyImportSpecifier();

}
