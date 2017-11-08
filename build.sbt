name := """math-api"""
organization := "com.lifeway.math"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"
val scalapactVersion = "2.2.1"

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
  "org.http4s"     %% "http4s-blaze-server"      % "0.17.0",
  "org.http4s"     %% "http4s-dsl"               % "0.17.0",
  "org.http4s"     %% "http4s-argonaut"          % "0.17.0",
  //"org.slf4j"      %  "slf4j-simple"             % "1.6.4",
  "org.scalatest"  %% "scalatest"                % "3.0.1"          % "test",
  "com.itv"        %% "scalapact-circe-0-8"      % scalapactVersion % "test",
  "com.itv"        %% "scalapact-http4s-0-17-0"  % scalapactVersion % "test",
  "com.itv"        %% "scalapact-scalatest"      % scalapactVersion % "test"
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.lifeway.math.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.lifeway.math.binders._"
