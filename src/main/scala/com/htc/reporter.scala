package com.htc

import facade.amazonaws.AWS
import facade.amazonaws.services.s3.ListObjectsV2Request
import com.htc.models.amazon.{Context, Event}
import com.htc.utils.EnvUtils._

import scala.scalajs.js.annotation.JSExport
//import awscala._
//import com.amazonaws.regions.RegionUtils
//import com.amazonaws.services.s3.model.ListObjectsV2Request
//import s3._
//import com.amazonaws.services.s3.AmazonS3Client
import com.htc.utils.Implicits._
import scala.util.Try
import com.htc.utils.PipeOperator._
import facade.amazonaws.AWS.S3
import scala.scalajs.js

@JSExport
object InvokeSuccess {
  @JSExport("apply")
  def apply(event: Event, context: Context): String = {
    val bucket = env[String](AWS_S3_BUCKET_ENV).getOrElse("")
    val baseKey = env[String](AWS_S3_BASE_KEY_ENV).getOrElse("")
    val s3LatestKey = baseKey + "/latest"
    println(context.invokedFunctionArn)
    println(event.request.toString)
    val region = env[String](AWS_S3_REGION_ENV).getOrElse("")
    println(s"region ${region}")
    val request = ListObjectsV2Request(Bucket = bucket, Prefix = s3LatestKey)
    println(s"request ${request}")
    val result = S3().listObjectsV2(request).send().data
    println(result)
//    val request = new ListObjectsV2Request().withBucketName(bucket).withPrefix(s3LatestKey)
//    val objectList = s3Client.listObjectsV2(request).getObjectSummaries
//    LOGGER.info(s"data size : ${objectList.size}")

    "Completed successful invocation."
  }
}

@JSExport
object InvokeFail {
  @JSExport("apply")
  def apply(event: Event, context: Context): String = {
    println("Invocation failed.")
    throw new IllegalArgumentException("failed from Scala")
  }
}
