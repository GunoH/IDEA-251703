plugins {
    java
}

repositories {
    mavenCentral()
}

group = "com.foo"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks.register<Test>("unitTest") {
    group = "Verification"
    description = "Runs the unit tests."
    useJUnitPlatform() 
}
