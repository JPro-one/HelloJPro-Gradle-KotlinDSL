plugins {
    id("org.openjfx.javafxplugin") version "0.0.13"
    `jpro-gradle-plugin`
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

javafx {
    version = "17.0.6"
    modules = listOf("javafx.graphics", "javafx.controls", "javafx.fxml", "javafx.media", "javafx.web")
}

application {
    // Define the main class for the application.
    mainClass.set("one.jpro.hellojpro.HelloJProFXML")
    mainModule.set(moduleName)
}

jpro {
    port = 8080
}
