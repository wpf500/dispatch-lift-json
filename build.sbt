name := "dispatch-lift-json"

version := "0.8.8"

organization := "net.databinder"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "net.databinder" %% "dispatch-core" % "0.8.9",
  "net.liftweb" % "lift-json_2.9.1" % "2.4",
  "net.databinder" %% "dispatch-http" % "0.8.9" % "test",
  "org.specs2" %% "specs2" % "1.12.2" % "test"
)
