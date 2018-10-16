package com.htc

import com.htc.utils.EnvUtils._
import com.htc.utils.Implicits._
import com.htc.utils.PipeOperator._
import com.definitelyscala.awslambda.Context

import scala.scalajs.js.annotation.JSExport
import facade.amazonaws
import facade.amazonaws.AWS.aws
import facade.amazonaws._

import io.scalajs.nodejs.global
import io.scalajs.nodejs.{console, process}
import facade.amazonaws.services.s3.{Bucket, Error, GetBucketLocationRequest, GetObjectOutput, GetObjectRequest, ListObjectsOutput, ListObjectsRequest, ListObjectsV2Output, ListObjectsV2Request, PutObjectOutput, PutObjectRequest, S3}

import scala.concurrent.Future
import scala.scalajs.js.Dynamic.{global => g, newInstance => jsnew}
import scala.scalajs.js.{special, typeOf}
import scala.concurrent.ExecutionContext.Implicits.global

@JSExport("InvokeSuccess")
object InvokeSuccess {
  @JSExport("apply")
  def apply(event: Object, context: Context): String = {
    val region = env[String](AWS_S3_REGION_ENV).getOrElse("")
    val bucket = env[String](AWS_S3_BUCKET_ENV).getOrElse("")
    val baseKey = env[String](AWS_S3_BASE_KEY_ENV).getOrElse("")
    val s3LatestKey = baseKey + "/latest"
    println(context.invokedFunctionArn)

    AWS.config.region = region
    val s3 = AWS.S3()
    println(s"s3 target: ${AWS.config.region} ${bucket} ${s3LatestKey}")

    val request = ListObjectsV2Request(Bucket = bucket, Prefix = s3LatestKey)

    println(s"request list ${request.Bucket} ${request.Prefix}")

    println(s"data : ${s3}")

    val today = jsnew(g.Date)()
    println(s"today $today")



    "Completed successful invocation."
  }
}

@JSExport("InvokeFail")
object InvokeFail {
  @JSExport("apply")
  def apply(event: Object, context: Context): String = {
    println("Invocation failed.")
    throw new IllegalArgumentException("failed from Scala")
  }
}
