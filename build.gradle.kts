plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.kotlinx.serialization) apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0"               // this version matches your Kotlin version
    id("androidx.room") version "2.6.1" apply false
    id("com.google.devtools.ksp") version "2.0.0-1.0.23" apply false        //aqui se busca la ultima version https://github.com/google/ksp/releases
    id("com.google.dagger.hilt.android") version "2.51" apply false
    alias(libs.plugins.google.gms.google.services) apply false
}