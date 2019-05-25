val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("$scalaJSVersion$")

// use Scala.js 1.0
// addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.0.0-M6")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.0")
