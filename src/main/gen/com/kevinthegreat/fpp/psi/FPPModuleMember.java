// This is a generated file. Not intended for manual editing.
package com.kevinthegreat.fpp.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FPPModuleMember extends PsiElement {

  @Nullable
  FPPAbstractTypeDefinition getAbstractTypeDefinition();

  @Nullable
  FPPAliasTypeDefinition getAliasTypeDefinition();

  @Nullable
  FPPArrayDefinition getArrayDefinition();

  @Nullable
  FPPComponentDefinition getComponentDefinition();

  @Nullable
  FPPComponentInstanceDefinition getComponentInstanceDefinition();

  @Nullable
  FPPConstantDefinition getConstantDefinition();

  @Nullable
  FPPEnumDefinition getEnumDefinition();

  @Nullable
  FPPIncludeSpecifier getIncludeSpecifier();

  @Nullable
  FPPLocationSpecifier getLocationSpecifier();

  @Nullable
  FPPModuleDefinition getModuleDefinition();

  @Nullable
  FPPPortDefinition getPortDefinition();

  @Nullable
  FPPPortInterfaceDefinition getPortInterfaceDefinition();

  @Nullable
  FPPStructDefinition getStructDefinition();

  @Nullable
  FPPTopologyDefinition getTopologyDefinition();

}
