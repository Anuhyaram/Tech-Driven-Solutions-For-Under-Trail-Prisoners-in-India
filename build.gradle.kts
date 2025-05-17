plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("com.google.gms.google-services")
}

android {
    buildFeatures {
        compose = true
    }

    namespace = "com.example.legai"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.legai"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }
    packaging {
        resources {
            excludes += setOf(
                "META-INF/INDEX.LIST",
                "META-INF/LICENSE",
                "META-INF/DEPENDENCIES",
                "META-INF/NOTICE"
            )
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.auth.ktx)
    implementation(libs.androidx.navigation.runtime.android)
    implementation(libs.firebase.firestore.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation(libs.ui)
    implementation(libs.material3)
    implementation(libs.androidx.activity.compose.v161)
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.analytics)
    implementation(libs.okhttp)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.generativeai)
    implementation(libs.google.firebase.firestore.ktx)
    implementation(libs.grpc.grpc.okhttp)
    implementation(libs.grpc.stub)
    implementation(libs.conscrypt.android)
    implementation(libs.firebase.firestore.ktx.vlatestversion)
    implementation(libs.kotlinx.coroutines.play.services)
    implementation(libs.play.services.maps)
    implementation(libs.play.services.location)
    implementation(libs.core)
    implementation(libs.okhttp.v493)
    implementation(libs.logging.interceptor)
    implementation(libs.kotlinx.coroutines.android)
    // WalletConnect Sign

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4") // Or the latest version

    // OkHttp (if needed for Web3j or other network requests)
    implementation("com.squareup.okhttp3:okhttp:4.9.3") // Or the latest version
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.3") // Or the latest version
    implementation("androidx.compose.ui:ui:1.6.0")
    implementation("androidx.compose.ui:ui-graphics:1.6.0")
    // Gson (if you need JSON parsing)
    implementation("com.google.code.gson:gson:2.10.1") // Or the latest version
    implementation("org.web3j:core:4.8.7") // Or the latest version
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4") // or the latest version that fits your project.
    implementation("com.squareup.okhttp3:okhttp:4.9.3") // web3j dependency
    implementation("com.squareup.okio:okio:2.9.0") // web3j dependency
    implementation("androidx.compose.material3:material3:1.1.2") // Or the latest stable version
    implementation("com.google.firebase:firebase-auth-ktx:22.3.0") // Firebase Authentication
    implementation("com.google.firebase:firebase-firestore-ktx:24.11.1") // Cloud Firestore
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.7.0") // For LaunchedEffect and coroutines
    implementation("androidx.compose.material3:material3:1.2.0") //Material3
    implementation("androidx.compose.ui:ui:1.6.1") //Compose UI
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.1")
    implementation("androidx.navigation:navigation-compose:2.7.6") // Navigation Compose
    implementation("androidx.compose.material:material:1.6.1")// For ModalDrawerSheet
    implementation("androidx.compose.material:material-icons-extended:1.6.1") //For Icons
    implementation("androidx.compose.ui:ui-test-manifest:1.6.1")
    debugImplementation("androidx.compose.ui:ui-tooling:1.6.1")
    debugImplementation("androidx.compose.ui:ui-test-junit4:1.6.1")
    implementation ("androidx.compose.ui:ui-text:1.4.3" )// Use latest version
    implementation ("androidx.compose.ui:ui:1.4.3")
    implementation ("com.microsoft.onnxruntime:onnxruntime-android:latest.release")// Use the latest version




}
