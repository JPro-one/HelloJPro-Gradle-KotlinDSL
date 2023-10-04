plugins {
    id("org.openjfx.javafxplugin") version "0.1.0"
    `jpro-gradle-plugin`
}

val projectVersion: String by project
val javafxVersion: String by project

version = projectVersion
group = "one.jpro"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
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
