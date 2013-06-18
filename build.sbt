name := "dispatch-lift-json"

version := "0.8.8"

organization := "net.databinder"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "net.databinder" %% "dispatch-core" % "0.8.9",
  "net.liftweb" %% "lift-json" % "2.5",
  "net.databinder" %% "dispatch-http" % "0.8.9" % "test",
  "org.specs2" %% "specs2" % "1.14" % "test"
)
