pluginManagement {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        maven("https://jitpack.io")
        mavenLocal()
        mavenCentral()
        jcenter()
    }
}

rootProject.name = "SofiaX"

include(":app")
include(":sofiax")
