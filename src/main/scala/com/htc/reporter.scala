package com.htc

import com.htc.utils.EnvUtils._

import scala.scalajs.js.annotation.JSExportTopLevel
import scala.scalajs.js.annotation.JSExport
import com.htc.utils.Implicits._

import scala.util.Try
import com.htc.utils.PipeOperator._

import scala.scalajs.js
import com.definitelyscala.awslambda.Context
import facade.amazonaws.AWS
import facade.amazonaws.services.s3.{Bucket, GetObjectRequest, ListObjectsV2Request}
//import io.scalajs.nodejs._
//import io.scalajs.npm.aws._
//import io.scalajs.npm.aws.s3._

@JSExportTopLevel("InvokeSuccess")
object InvokeSuccess {
  implicit val s3 = AWS.S3()
  @JSExport("apply")
  def apply(event: Object, context: Context): String = {
    val region = env[String](AWS_S3_REGION_ENV).getOrElse("")
    val bucket = env[String](AWS_S3_BUCKET_ENV).getOrElse("")
    val baseKey = env[String](AWS_S3_BASE_KEY_ENV).getOrElse("")
    val s3LatestKey = baseKey + "/latest"
    println(context.invokedFunctionArn)
//    val s3 = new S3(ClientConfiguration(
//      accessKeyId = "[YOUR PUBLIC ACCESS KEY]",
//      secretAccessKey = "[YOUR SECRET ACCESS KEY]",
//      region = "us-west-1"
//    ))
//
//    val params = new BucketParams(Bucket = "test-bucket")
//    s3.getBucketLocation(params, (err, data) => {
//      if (err != null) console.log(err, err.stack)
//      else console.log(data)
//    })
    try{
      AWS.config.region = region
      println(s"s3 target: ${region} ${bucket} ${s3LatestKey}")
      val params = GetObjectRequest(Bucket = bucket, Key = s"${s3LatestKey}/testId4")

      val obj = s3.getObject(params).send()
      println(s"get object ${obj.data} ${obj.error} ${obj.request.send().data}")
      val request = ListObjectsV2Request(Bucket = bucket, Prefix = s3LatestKey)
      println(s"request ${request.Bucket} ${request.Prefix}")
      val result = AWS.S3().listObjectsV2(request).send().data
      println("result " + result)
    } catch {
      case th: Throwable =>
        th.printStackTrace()
        throw th
    }

//
//    val request = new ListObjectsV2Request().withBucketName(bucket).withPrefix(s3LatestKey)
//    val objectList = s3Client.listObjectsV2(request).getObjectSummaries
//    LOGGER.info(s"data size : ${objectList.size}")

    "Completed successful invocation."
  }
}

@JSExportTopLevel("InvokeFail")
object InvokeFail {
  @JSExport("apply")
  def apply(event: Object, context: Context): String = {
    println("Invocation failed.")
    throw new IllegalArgumentException("failed from Scala")
  }
}
