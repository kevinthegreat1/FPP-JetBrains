package com.kevinthegreat.fpp

import com.intellij.psi.tree.IElementType
import com.kevinthegreat.fpp.psi.FPPTypes

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
        val TYPES = entries.flatMap { it.types.asList() }.toSet()
    }
}
