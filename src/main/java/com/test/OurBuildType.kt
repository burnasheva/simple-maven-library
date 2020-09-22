package com.test

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType

open class OurBuildType : BuildType ({

    params {
        param("env.someParam", "111")
    }

})