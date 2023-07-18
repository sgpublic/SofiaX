// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    val androidVer = "8.0.2"
    id("com.android.application") version "8.0.2" apply false
    id("com.android.library") version androidVer apply false

    val kotlinVer = "1.8.21"
    kotlin("android") version kotlinVer apply false
    kotlin("plugin.parcelize") version kotlinVer apply false
    kotlin("kapt") version kotlinVer apply false

    id("io.github.sgpublic.android-publish") version "1.0.0-alpha01" apply false
    id("io.github.sgpublic.android-assemble") version "2.0.0-beta02" apply false
}