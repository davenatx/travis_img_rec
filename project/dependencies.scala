import sbt._

object Version {
  val scalaLogging = "3.5.0"
  val logback = "1.2.3"
  val config = "1.3.1"
 }

object Library { 
  val scalaLogging  =  "com.typesafe.scala-logging" %% "scala-logging"  % Version.scalaLogging
  val logback       = "ch.qos.logback"              % "logback-classic" % Version.logback
  val config        = "com.typesafe"                % "config"          % Version.config
 }

object Dependencies {
  import Library._

  val travis_index = List(
    scalaLogging,
    logback,
    config
  )
}