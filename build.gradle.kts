plugins {
    id("org.openjfx.javafxplugin") version "0.1.0"
    `jpro-gradle-plugin`
}

val projectVersion: String by project
val javafxVersion: String by project
val jproVersion: String by project
val cssfxVersion: String by project
val jproPlatformVersion: String by project
val jproCssGridVersion: String by project

version = projectVersion
group = "one.jpro"

java {
    sourceCompatibility = JavaVersion.VERSION_22
    targetCompatibility = JavaVersion.VERSION_22
}

repositories {
    mavenCentral()
    // JPro Platform: SimpleFX (needed by the routing library) and snapshot builds
    maven {
        url = uri("https://sandec.jfrog.io/artifactory/repo")
    }
}

dependencies {
    implementation("one.jpro:jpro-webapi:$jproVersion")
    implementation("fr.brouillard.oss:cssfx:$cssfxVersion")
    implementation("one.jpro.platform:jpro-routing-core:$jproPlatformVersion")
    implementation("one.jpro.platform:jpro-flexbox:$jproPlatformVersion")
    implementation("one.jpro.platform:jpro-css-grid:$jproCssGridVersion")
}

javafx {
    version = javafxVersion
    modules = listOf("javafx.controls", "javafx.fxml")
}

application {
    // Define the main class for the application.
    mainClass.set("one.jpro.hellojpro.HelloJPro")
}

jpro {
    port = 8080
}
