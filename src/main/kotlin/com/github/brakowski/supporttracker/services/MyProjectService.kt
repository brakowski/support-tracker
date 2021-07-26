package com.github.brakowski.supporttracker.services

import com.github.brakowski.supporttracker.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
