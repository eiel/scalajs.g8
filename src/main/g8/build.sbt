ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := "$scalaVersion$"

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    name := "$name$",
  )
