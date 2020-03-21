val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("$scalaJSVersion$")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.2")
