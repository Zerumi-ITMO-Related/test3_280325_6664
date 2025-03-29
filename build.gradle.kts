plugins {
    kotlin("jvm") version "2.0.10"
}

group = "io.github.zerumi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.seleniumhq.selenium:selenium-java:4.30.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}