package com.github.muwl.relxmvp.services

import com.github.muwl.relxmvp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
