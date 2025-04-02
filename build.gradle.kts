plugins {
    id("org.openjfx.javafxplugin") version "0.1.0"
    `jpro-gradle-plugin`
}

val projectVersion: String by project
val javafxVersion: String by project
val jproVersion: String by project

version = projectVersion
group = "one.jpro"

java {
    sourceCompatibility = JavaVersion.VERSION_22
    targetCompatibility = JavaVersion.VERSION_22
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("one.jpro:jpro-webapi:$jproVersion")
}

javafx {
    version = javafxVersion
    modules = listOf("javafx.graphics", "javafx.controls", "javafx.fxml", "javafx.media", "javafx.web")
}

application {
    // Define the main class for the application.
    mainClass.set("one.jpro.hellojpro.HelloJProFXML")
}

jpro {
    port = 8080
}
