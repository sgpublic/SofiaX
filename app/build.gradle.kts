plugins {
    id("com.android.application")

    kotlin("android")
    kotlin("plugin.parcelize")
    kotlin("kapt")
}

android {
    namespace = "io.github.sgpublic.compatsystemuisample"
    compileSdk = 33

    defaultConfig {
        applicationId = namespace
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    packaging {
        resources.excludes.addAll(listOf(
            "META-INF/DEPENDENCIES",
            "META-INF/NOTICE",
            "META-INF/LICENSE",
            "META-INF/LICENSE.txt",
            "META-INF/NOTICE.txt",
        ))
    }

    buildFeatures {
        viewBinding = true
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
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation(kotlin("reflect"))

    /* https://m3.material.io/libraries/mdc-android/getting-started */
    implementation("com.google.android.material:material:1.9.0")

    implementation(project(":compat-systemui"))
}

configurations {
    all {
        exclude(module = "httpclient")
        exclude(module = "commons-logging")
    }
}