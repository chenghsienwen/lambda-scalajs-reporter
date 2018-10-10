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
import facade.amazonaws.services.s3.{Bucket, GetBucketLocationRequest, GetObjectOutput, GetObjectRequest, ListObjectsOutput, ListObjectsRequest, ListObjectsV2Output, ListObjectsV2Request, PutObjectOutput, PutObjectRequest, S3}

import scala.concurrent.Future
import scala.scalajs.js.Dynamic.{ global => g, newInstance => jsnew }
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

    var moment = g.require("moment")
    var AWS = g.require("aws-sdk")
    var now = moment().format()
    println(s"now $now")
    AWS.config.update(region)
    var s3 = jsnew(AWS.S3)("2006-03-01").asInstanceOf[S3]
    var readParams = ListObjectsRequest(Bucket = bucket)

    // call S3 to create the bucket
    s3.listObjects(readParams, (err:Error, data:ListObjectsOutput)=> {
      if (err.message.nonEmpty) {
        println("Error", err)
      } else {
        println("Success", data)
      }
    })

      AWS.config.region = region
      val s3 = AWS.S3()
      println(s"s3 target: ${AWS.config.region} ${bucket} ${s3LatestKey}")
      s3.putObject(PutObjectRequest(Bucket = bucket, Key = s"${s3LatestKey}/testId5"), (err, data: PutObjectOutput) => {
        println(s"got callback from get object $data")
        err != null match {
          case true => println(s"error ${err}")
          case _ => println(s"data ${data}")
        }
      })

      val params = GetObjectRequest(Bucket = bucket, Key = s"${s3LatestKey}/testId5")

      s3.getObject(params, (err, data: GetObjectOutput) => {
        println(s"got callback from get object $data")
        err != null match {
          case true => println(s"error ${err}")
          case _ => println(s"data ${data}")
        }
      })

    s3.getBucketLocation(GetBucketLocationRequest(Bucket = bucket), (err, data) => {
      if (err != null) console.log(err)
      else console.log(data)
    })

      val request = ListObjectsV2Request(Bucket = bucket, Prefix = s3LatestKey)
      println(s"request list ${request.Bucket} ${request.Prefix}")
      s3.listObjectsV2(request, (err, data:ListObjectsV2Output) => {
        err != null match {
          case true => println(s"error ${err}")
          case _ => println(s"data ${data}")
        }
      })


//
//    val request = new ListObjectsV2Request().withBucketName(bucket).withPrefix(s3LatestKey)
//    val objectList = s3Client.listObjectsV2(request).getObjectSummaries
//    LOGGER.info(s"data size : ${objectList.size}")

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
