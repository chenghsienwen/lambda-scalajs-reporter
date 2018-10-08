package com.htc.utils

import awscala._
import awscala.s3._
import com.htc.utils.PipeOperator._
class AWSProvider {
  def getS3(): S3 =
    (for {
      awsAccessKeyId <- sys.env.get("AWS_ACCESS_KEY_ID")
      awsSecretKey   <- sys.env.get("AWS_SECRET_ACCESS_KEY")
      awsRegion      <- sys.env.get("AWS_REGION")
    } yield {
      implicit val region = getRegion(awsRegion)

      println(s"s3 information: ${awsAccessKeyId}, region:${awsRegion}")
      S3(awsAccessKeyId, awsSecretKey)

    }).getOrElse {
      val awsRegion = sys.env.get("AWS_REGION").getOrElse("us-west-2")

      LOGGER.info(s"s3 information load default, region:${awsRegion}")
      S3.at(getRegion(awsRegion))
    }

  def getBucket(): String = sys.env.get("AWS_S3_BUCKET").getOrElse("")

  def getRegion(region: String) =
    region match {
      case "us-west-2"      => Region.Oregon
      case "ap-northeast-1" => Region.Tokyo
      case "Beijing"        => Region.Beijing
      case "ap-southeast-2" => Region.Sydney
      case "ap-southeast-1" => Region.Singapore
      case "eu-west-1"      => Region.Ireland
      case "us-east-1"      => Region.NorthernVirginia
      case "us-west-1"      => Region.NorthernCalifornia
      case _                => Region.Oregon
    }
}
