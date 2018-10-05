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

zipJS in Compile <<= (fastOptJS in Compile, packageJSDependencies in Compile, target, zipVersion) map {
  (jsFile, depsFile, tf, version) =>

    val zipFile = tf / s"lambda-scalajs-reporter_${version}.zip"
    val inputs: Seq[(File, String)] = Seq((depsFile, s"index_${version}.js")) ++ (Seq(jsFile.data) x Path.flat)

    IO.zip(inputs, zipFile)

    zipFile
}

enablePlugins(ScalaJSPlugin)
scalaJSUseRhino in Global := false
scalaJSStage in Global := FastOptStage
skip in packageJSDependencies := false
jsDependencies += ProvidedJS / "lambda-exports.js"
lazy val versions = new {
  val awscala        = "0.8.+"
  val awsjava = "1.11.421"
}
libraryDependencies ++= Seq("com.github.seratch"  %% "awscala" % versions.awscala,
"com.amazonaws" % "aws-java-sdk-cloudwatch" % versions.awsjava,
"com.amazonaws" % "aws-java-sdk-s3" % versions.awsjava,
"com.amazonaws" % "aws-java-sdk-ses" % versions.awsjava)

lazy val root = (project in file(".")).
  enablePlugins(BuildInfoPlugin).
  settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "buildInfo"
  )
