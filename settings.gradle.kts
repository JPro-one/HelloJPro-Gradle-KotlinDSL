buildscript {
    repositories {
        gradlePluginPortal()

        maven {
            url = uri("https://sandec.jfrog.io/artifactory/repo")
        }
    }

    val jproVersion: String by settings

    dependencies {
        classpath("one.jpro:jpro-gradle-plugin:$jproVersion")
    }
}
