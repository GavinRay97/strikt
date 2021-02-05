import org.gradle.util.GradleVersion
import java.net.URL

plugins {
  kotlin("jvm")
  id("published")
  id("info.solidsoft.pitest")
}

description = "Extensions for assertions and traversals on Gradle's test kit."

dependencies {
  api(project(":strikt-core"))

  compileOnly(gradleTestKit())

  testImplementation(gradleTestKit())
  testImplementation("io.mockk:mockk:+")
  testImplementation("dev.minutest:minutest:+")
}

tasks.dokka {
  configuration {
    "https://docs.gradle.org/${GradleVersion.current().version}/javadoc/".also {
      externalDocumentationLink {
        url = URL(it)
        packageListUrl = URL(it + "package-list")
      }
    }
  }
}
