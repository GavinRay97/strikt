plugins {
  `java-gradle-plugin`
  `kotlin-dsl`
  `kotlin-dsl-precompiled-script-plugins`
}

repositories {
  mavenCentral()
  gradlePluginPortal()
}

dependencies {
  implementation("org.jetbrains.dokka:dokka-gradle-plugin:1.6.21")
  implementation("com.netflix.nebula:nebula-publishing-plugin:18.4.0")
}
