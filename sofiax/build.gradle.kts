import io.github.sgpublic.androidassemble.util.VersionGen
import io.github.sgpublic.androidassemble.util.libVersionCode
import io.github.sgpublic.androidassemble.util.libVersionName
import io.github.sgpublic.publishingplugin.util.assertStringProperty

plugins {
    id("com.android.library")

    kotlin("android")

    `maven-publish`
    signing
    id("io.github.sgpublic.android-publish")
}

android {
    compileSdk = 33

    namespace = "io.github.sgpublic.sofiax"

    defaultConfig {
        minSdk = 14

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    buildFeatures {
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("org.jetbrains:annotations:23.0.0")
    implementation("androidx.annotation:annotation:1.6.0")
}