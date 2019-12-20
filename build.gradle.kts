plugins {
    kotlin("jvm") version "1.3.61"
    id("org.sonarqube") version "2.8"
    jacoco
}

group = "com.github.lahresdev"
version = "1.1.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.12")
    testImplementation("org.assertj:assertj-core:3.12.0")
}

repositories {
    mavenCentral()
    mavenLocal()
}

jacoco {
    toolVersion = "0.8.5"
}

tasks.withType<JacocoReport> {
    reports {
        xml.isEnabled = true
    }
}

tasks.withType<Test> {
    finalizedBy("jacocoTestReport")
}

tasks.withType<Jar> {
    manifest {
        attributes(mapOf("Main-Class" to "com.github.lahresdev.kgsm.HelloWorldKt"))
    }
    configurations["compileClasspath"].forEach { file: File -> from(zipTree(file.absoluteFile)) }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
