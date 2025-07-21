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
    implementation("org.dhatim:fastexcel-reader:0.18.4")
    implementation("org.dhatim:fastexcel:0.18.4")
}

tasks.test {
    useJUnitPlatform()
}