ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := "$scalaVersion$"

ThisBuild / scalacOptions ++= ScalacOptions.basic
ThisBuild / scalacOptions ++= ScalacOptions.forScalaJS

lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    name := "$name$",
  )
