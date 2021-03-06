// Default build.sbt settings for pure java projects with JUnit tests

organization := "com.alekotra"

name := "java-sbt-project"

version := "0.1"

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

// Main Java class for "sbt run"
mainClass in (Compile, run) := Some("com.alekotra.Main")

libraryDependencies ++= Seq(
    "com.novocode" % "junit-interface" % "0.11" % "test"	// see https://github.com/sbt/junit-interface
    )