import org.gradle.internal.impldep.com.fasterxml.jackson.core.JsonPointer.compile

plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
        //testImplementation("org.junit.jupiter:junit-jupiter-api:5.12.0-RC1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}