buildscript {
    repositories {
        gradlePluginPortal()

        maven {
            url = uri("https://sandec.jfrog.io/artifactory/repo")
        }
    }

    dependencies {
        classpath("one.jpro:jpro-gradle-plugin:2023.2.2")
    }
}

rootProject.name = "HelloJPro-Gradle-KotlinDSL"
