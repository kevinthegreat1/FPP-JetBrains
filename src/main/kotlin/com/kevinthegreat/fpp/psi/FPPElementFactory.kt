package com.kevinthegreat.fpp.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.util.PsiTreeUtil
import com.kevinthegreat.fpp.FPPFileType

object FPPElementFactory {
    fun createModuleDef(project: Project, name: String): PsiElement =
        PsiTreeUtil.findChildOfType(createFile(project, "module $name {}"), FPPModuleDefinition::class.java)!!

    fun createFile(project: Project, text: String): FPPFile =
        PsiFileFactory.getInstance(project).createFileFromText("temp.fpp", FPPFileType, text) as FPPFile
}
