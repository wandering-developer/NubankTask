import sbt.Keys.version
import sbt._
import Keys._
import sbt.project
import sbt.Keys._


lazy val root = (project in file(".")).
  settings(
    name := "Nubank",
    version := "0.1",
    scalaVersion := "2.11.8",
    mainClass in Compile := Some("com.example.nubank.MyApplication")
  )

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.0"

// https://mvnrepository.com/artifact/commons-cli/commons-cli
libraryDependencies += "commons-cli" % "commons-cli" % "1.4"

libraryDependencies += "com.typesafe" % "config" % "1.3.2"

// https://mvnrepository.com/artifact/org.json/json
libraryDependencies += "org.json" % "json" % "20090211"

//libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

libraryDependencies += "org.mockito" % "mockito-core" % "2.12.0" % "test"


resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
resolvers += Resolver.mavenLocal

mainClass in assembly := Some("com.example.nubank.MyApplication")

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case x => MergeStrategy.first
}


