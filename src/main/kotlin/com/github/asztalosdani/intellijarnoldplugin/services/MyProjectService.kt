package com.github.asztalosdani.intellijarnoldplugin.services

import com.intellij.openapi.project.Project
import com.github.asztalosdani.intellijarnoldplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
