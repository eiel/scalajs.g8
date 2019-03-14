addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.11.0")
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")
libraryDependencies += {
  "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
}
