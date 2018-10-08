package com.htc.utils

import scala.util.control.Exception._
import io.scalajs.nodejs.global
object EnvUtils {

  implicit val optionLongConverter  = new LongConverter()
  implicit val intConverter         = new IntConverter()
  implicit val stringConverter      = new StringConverter()
  implicit val stringListConverter  = new StringListConverter()
  implicit val stringArrayConverter = new StringArrayConverter()

  val AWS_S3_BUCKET_ENV                 = "AWS_S3_BUCKET"
  val AWS_S3_REGION_ENV                 = "AWS_S3_REGION"
  val AWS_S3_BASE_KEY_ENV                 = "AWS_S3_BASE_KEY"

  def env[T](key: String)(implicit convert: ValueConverter[T]): Option[T] =
    global.process.env.get(key).filter(_.nonEmpty).map(convert.convert)
}

trait ValueConverter[T] {
  def convert(v: String): T
}

class OptionIntConverter extends ValueConverter[Option[Int]] {
  override def convert(v: String): Option[Int] = allCatch.opt(v.toInt)
}

class LongConverter extends ValueConverter[Long] {
  override def convert(v: String): Long = v.toLong
}

class IntConverter extends ValueConverter[Int] {
  override def convert(v: String): Int = v.toInt
}

class StringConverter extends ValueConverter[String] {
  def convert(v: String): String = v
}

class StringListConverter extends ValueConverter[List[String]] {
  override def convert(v: String): List[String] = v.split(",").toList
}

class StringArrayConverter extends ValueConverter[Array[String]] {
  override def convert(v: String): Array[String] = v.split(",")
}
