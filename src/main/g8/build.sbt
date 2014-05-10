
// Info

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_version$"

// Settings

ScctPlugin.instrumentSettings

ScoverageSbtPlugin.instrumentSettings

// Resolvers



// Libraries

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.1.5" % "test"

libraryDependencies += "org.scalautils" % "scalautils_2.11" % "2.1.5"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2"

