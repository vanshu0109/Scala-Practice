ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Session3Assignment1",
    idePackagePrefix := Some("com.knoldus")
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % Test