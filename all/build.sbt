import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies += scalaTest % Test
  )

name. :=("Test")

name += "Green"



description := s"${name.value},kindly provide by ${organizationName.value}"


organizationName := "The Test"
