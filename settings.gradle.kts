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

rootProject.name = "compat-systemui"

include(":app")
include(":compat-systemui")
