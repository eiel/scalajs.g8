lazy val scala212 = "$scalaVersion$"
lazy val scala213 = "2.13.1"

ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := scala212
ThisBuild / crossScalaVersions := Seq(scala212, scala213)

ThisBuild / scalacOptions ++= ScalacOptions.basic
ThisBuild / scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
  case Some((2, 12)) => ScalacOptions.forScala212
  case _ => Seq()
})
// ThisBuild / scalacOptions ++= ScalacOptions.forScalaJS06

lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    name := "$name$",
  )
