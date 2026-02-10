package com.kevinthegreat.fpp

import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType
import com.kevinthegreat.fpp.psi.*

enum class FPPNameGroup(vararg val types: IElementType) {
    COMPONENT_INSTANCE(FPPTypes.COMPONENT_INSTANCE_DEFINITION),
    COMPONENT(FPPTypes.COMPONENT_DEFINITION),
    INTERFACE(FPPTypes.PORT_INTERFACE_DEFINITION),
    PORT(FPPTypes.PORT_DEFINITION),
    STATE_MACHINE(FPPTypes.COMPONENT_DEFINITION, FPPTypes.STATE_MACHINE_DEFINITION),
    TOPOLOGY(FPPTypes.TOPOLOGY_DEFINITION),
    TYPE(
        FPPTypes.ABSTRACT_TYPE_DEFINITION,
        FPPTypes.ARRAY_DEFINITION,
        FPPTypes.COMPONENT_DEFINITION,
        FPPTypes.ENUM_DEFINITION,
        FPPTypes.STATE_MACHINE_DEFINITION,
        FPPTypes.STRUCT_DEFINITION
    ),
    VALUE(
        FPPTypes.COMPONENT_DEFINITION,
        FPPTypes.CONSTANT_DEFINITION,
        FPPTypes.ENUM_DEFINITION,
        FPPTypes.ENUM_CONSTANT,
        FPPTypes.STATE_MACHINE_DEFINITION
    );

    companion object {
        val DEF_TYPES = entries.flatMap { it.types.asList() }.toSet()

        fun getDefTypes(qualId: PsiElement): List<IElementType>? {
            return when (qualId) {
                is FPPQualifiedIdentifierTypeName -> listOf(
                    FPPTypes.ABSTRACT_TYPE_DEFINITION,
                    FPPTypes.ALIAS_TYPE_DEFINITION,
                    FPPTypes.ARRAY_DEFINITION,
                    FPPTypes.ENUM_DEFINITION,
                    FPPTypes.STRUCT_DEFINITION
                )
                is FPPQualifiedIdentifierComponentDefinition -> listOf(FPPTypes.COMPONENT_DEFINITION)
                is FPPQualifiedIdentifierStateOrChoiceDefinition -> listOf(
                    FPPTypes.STATE_DEFINITION,
                    FPPTypes.CHOICE_DEFINITION
                )
                is FPPQualifiedIdentifierComponentInstanceDefinition -> listOf(FPPTypes.COMPONENT_INSTANCE_DEFINITION)
                is FPPQualifiedIdentifierPortInterfaceDefinition -> listOf(FPPTypes.PORT_INTERFACE_DEFINITION)
                is FPPQualifiedIdentifierConstantDefinition -> listOf(FPPTypes.CONSTANT_DEFINITION)
                is FPPQualifiedIdentifierPortDefinition -> listOf(FPPTypes.PORT_DEFINITION)
                is FPPQualifiedIdentifierStateMachineDefinition -> listOf(FPPTypes.STATE_MACHINE_DEFINITION)
                is FPPQualifiedIdentifierTopologyDefinition -> listOf(FPPTypes.TOPOLOGY_DEFINITION)
                is FPPQualifiedIdentifierTypeLocationSpecifier -> listOf(
                    FPPTypes.ARRAY_DEFINITION,
                    FPPTypes.ENUM_DEFINITION,
                    FPPTypes.STRUCT_DEFINITION,
                    FPPTypes.ABSTRACT_TYPE_DEFINITION
                )
                else -> null
            }
        }
    }
}
