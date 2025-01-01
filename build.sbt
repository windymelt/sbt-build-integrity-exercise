
ThisBuild / scalaVersion := "3.6.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "core",
    scalaVersion := "3.6.2",
    libraryDependencies ++= Seq(
      "com.lihaoyi" %% "os-lib" % "0.11.3"
    )
  )
