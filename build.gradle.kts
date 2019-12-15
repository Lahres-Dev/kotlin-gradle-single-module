plugins {
    kotlin("jvm") version "1.3.61"
    `maven-publish`
}

group = "com.github.lahresdev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
  implementation(kotlin("stdlib"))
  testImplementation("junit:junit:4.12")
  testImplementation("org.assertj:assertj-core:3.12.0")
}
