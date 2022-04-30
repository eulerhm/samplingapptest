import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    `java-library`
    kotlin("jvm")
    kotlin("kapt")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform { }
    testLogging {
        exceptionFormat = TestExceptionFormat.FULL
        events("started", "skipped", "passed", "failed")
        showStandardStreams = true
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libs.Kotlin.stdLib)
    implementation(Libs.Kotlin.coroutines)
    implementation(Libs.Kotlin.coroutinesAndroid)

    api(project(":logger"))

    implementation(Libs.Dagger.dagger)
    kapt(Libs.Dagger.compiler)
    implementation(Libs.Dagger.AssistedInject.annotations)
    kapt(Libs.Dagger.AssistedInject.compiler)
    testImplementation(Libs.Test.kotlinTest)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
