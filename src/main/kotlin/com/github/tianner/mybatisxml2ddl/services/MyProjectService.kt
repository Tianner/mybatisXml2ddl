package com.github.tianner.mybatisxml2ddl.services

import com.intellij.openapi.project.Project
import com.github.tianner.mybatisxml2ddl.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
