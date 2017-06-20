import Dependencies._

name := "travis_img_rec"

organization := "com.austindata"

version := "0.1"

scalaVersion := "2.11.10"

scalacOptions ++= Seq("-optimize", "-deprecation", "-feature")

libraryDependencies ++= Dependencies.travis_index

git.baseVersion := "0.1"

//versionWithGit

showCurrentGitBranch

scalariformSettings

mainClass in assembly := Some("com.austindata.ParseAndCopy")

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case PathList(xs @ _*) => MergeStrategy.first
}

assemblyJarName in assembly := name.value + "-" + version.value + ".jar"