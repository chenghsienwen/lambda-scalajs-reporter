
organization := "htc"
description := "daily reporter of vending machine"
name := "lambda-scalajs-reporter"
version := "0.0.1"
scalaVersion := "2.12.4"

resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.jcenterRepo

enablePlugins(ScalaJSPlugin)
scalaJSUseRhino in Global := false
scalaJSStage in Global := FastOptStage
skip in packageJSDependencies := false
jsDependencies ++= Seq(ProvidedJS / "lambda-exports.js",
  "org.webjars.bower" % "aws-sdk-js" % "2.1.23" / "aws-sdk.js" minified "aws-sdk.min.js" commonJSName "AWS")

lazy val versions = new {
  val awslambda        = "1.1.0"
  val logging = "0.1.0"
  val nodejs = "0.4.2"
}
libraryDependencies ++= Seq(
  "com.definitelyscala" %%% "scala-js-awslambda" % versions.awslambda,
  "io.scalajs" %%% "nodejs" % versions.nodejs
)
scalaJSModuleKind := ModuleKind.CommonJSModule

lazy val root = (project in file(".")).
  enablePlugins(BuildInfoPlugin).
  settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "buildInfo"
  )
