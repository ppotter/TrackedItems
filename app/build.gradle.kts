plugins {
    id("com.android.application")
}

android {
    namespace = "com.potter.tracker"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.potter.tracker"
        minSdk = 31
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment:2.7.1")
    implementation("androidx.navigation:navigation-ui:2.7.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.8.0") {
        because("kotlin-stdlib-jdk7 is now a part of kotlin-stdlib")
    }
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.0") {
        because("kotlin-stdlib-jdk8 is now a part of kotlin-stdlib")
    }

    var dagger_version = "2.+"
    implementation("com.google.android.material:material:1.9.0")
    implementation("com.google.dagger:dagger:$dagger_version")
    annotationProcessor("com.google.dagger:dagger-compiler:$dagger_version")
    implementation("com.google.dagger:dagger-android:$dagger_version")
    implementation("com.google.dagger:dagger-android-support:$dagger_version")
    implementation("com.google.dagger:dagger-android-processor:$dagger_version")

//    var glideVersion = "4.9.+"
//    implementation("com.github.bumptech.glide:glide:$glideVersion")
//    annotationProcessor("com.github.bumptech.glide:compiler:$glideVersion")

    var lifecycle_version = "2.1.+"
    implementation("androidx.lifecycle:lifecycle-extensions:$lifecycle_version")

    var retrofitVersion = "2.5.+"
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")

    var rxjava_version = "2.1.+"
    implementation("io.reactivex.rxjava2:rxjava:$rxjava_version")

    var rxcalladapter_version = "2.5.0"
    implementation("com.squareup.retrofit2:adapter-rxjava2:$rxcalladapter_version")

    var reactivestreams_version = "1.1.1"
    implementation("android.arch.lifecycle:reactivestreams:$reactivestreams_version")

    var room_version = "2.5.+"
    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-rxjava2:$room_version")
    implementation("androidx.room:room-guava:$room_version")
    implementation("androidx.room:room-testing:$room_version")
    implementation("androidx.room:room-paging:$room_version")

    implementation("androidx.recyclerview:recyclerview:1.3.1")

}