ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "SBT_Assignment",
    idePackagePrefix := Some("com.knoldus.sbtpack")
  )
libraryDependencies += "joda-time" % "joda-time" % "2.12.2"
libraryDependencies += "org.joda" % "joda-convert" % "2.2.2"
libraryDependencies +="io.snappydata" % "snappydata-jdbc_2.11" % "1.3.1"
updateOptions := updateOptions.value.withCachedResolution(true)

lazy val core = (project in file("core"))
  .settings(
    name := "core",
    version := "1.0.0",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.9" % Test
    )
  )
  .dependsOn(utils)
  .aggregate(utils)

lazy val utils = (project in file("utils"))
  .settings(
    name := "utils",
    version := "1.0.0",
    scalaVersion := "2.13.8"
  )