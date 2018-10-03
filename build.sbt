organization := "htc"
description := "daily reporter of vending machine"
name := "lambda-scalajs-reporter"
version := "0.0.1"
scalaVersion := "2.11.8"

val zipJS = taskKey[File]("build zip file containing all generated JS and exporter")
val gitHeadCode = SettingKey[String]("git-head-hash", "The commit hash code of HEAD")
gitHeadCode := git.gitHeadCommit.value.map { sha => s"${sha.take(7)}" }.getOrElse("na")
val zipVersion = SettingKey[String]("zip version", "version string")
zipVersion := s"${if (gitHeadCode.value != "na") s"${version.value}_${gitHeadCode.value}" else version.value}"

zipJS in Compile <<= (fastOptJS in Compile, packageJSDependencies in Compile, target) map {
  (jsFile, depsFile, tf) =>

    val zipFile = tf / s"lambda-scalajs-reporter.zip"
    val inputs: Seq[(File, String)] = Seq((depsFile, s"index.js")) ++ (Seq(jsFile.data) x Path.flat)

    IO.zip(inputs, zipFile)

    zipFile
}

enablePlugins(ScalaJSPlugin)
scalaJSUseRhino in Global := false
scalaJSStage in Global := FastOptStage
skip in packageJSDependencies := false
jsDependencies += ProvidedJS / "lambda-exports.js"
libraryDependencies ++= Seq()

lazy val root = (project in file(".")).
  enablePlugins(BuildInfoPlugin).
  settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "buildInfo"
  )
