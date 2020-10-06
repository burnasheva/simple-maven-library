package com.test

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType

open class OurBuildType(init: BuildType.() -> Unit) : BuildType ({

    init()
    params {
        param("env.someParam", "555")
    }
})

