ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := "$scalaVersion$"
ThisBuild / scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-encoding",
  "UTF-8",
  "-Xfatal-warnings",
  "-language:_",
  // Warn if an argument list is modified to match the receiver
  "-Ywarn-adapted-args",
  // Warn when dead code is identified.
  "-Ywarn-dead-code",
  // Warn about inaccessible types in method signatures.
  "-Ywarn-inaccessible",
  // Warn when a type argument is inferred to be `Any`.
  "-Ywarn-infer-any",
  // Warn when non-nullary `def f()' overrides nullary `def f'
  "-Ywarn-nullary-override",
  // Warn when nullary methods return Unit.
  "-Ywarn-nullary-unit",
  // Warn when numerics are widened.
  "-Ywarn-numeric-widen",
  // Warn when imports are unused.
  "-Ywarn-unused-import"
)

ThisBuild / scalacOptions += "-P:scalajs:sjsDefinedByDefault"

lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    name := "$name$",
  )
