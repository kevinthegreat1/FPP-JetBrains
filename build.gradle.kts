plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.9.25"
    id("org.jetbrains.intellij.platform") version "2.3.0"
    id("org.jetbrains.grammarkit") version "2022.3.2.2"
}

group = "com.kevinthegreat"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
dependencies {
    intellijPlatform {
        create("IC", "2024.2.5")
        testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)

        // Add necessary plugin dependencies for compilation here, example:
        // bundledPlugin("com.intellij.java")
    }
}

sourceSets {
    main {
        java {
            srcDirs("src/main/gen")
        }
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "242"
        }

        changeNotes = """
      Initial version
    """.trimIndent()
    }
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "21"
        targetCompatibility = "21"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "21"
    }

    generateParser {
        sourceFile.set(file("src/main/kotlin/com/kevinthegreat/fpp/FPP.bnf"))
        pathToParser.set("/com/kevinthegreat/fpp/parser/FPPParser.java")
        pathToPsiRoot.set("/com/kevinthegreat/fpp/psi")
        targetRootOutputDir.set(file("src/main/gen"))
        purgeOldFiles.set(true)
    }
    generateLexer {
        sourceFile.set(file("src/main/kotlin/com/kevinthegreat/fpp/FPPLexer.flex"))
        targetOutputDir.set(file("src/main/gen/com/kevinthegreat/fpp"))
        targetFile("FPPLexer")
        purgeOldFiles.set(false)

        dependsOn(generateParser)
    }
    compileKotlin {
        dependsOn(generateLexer)
    }
}
