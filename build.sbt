val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "TroubleMain",
    version := "0.0.1",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
  )
