package com.htc.utils

import java.util.logging._

object PipeOperator {
  val LOGGER = Logger.getLogger("reporterLogger")
  implicit class Pipe[T](val v: T) extends AnyVal {
    def |>[U](f: T => U): U = f(v)

    // Additional suggestions:
    def $$[U](f: T => U): T = {
      f(v); v
    }

    def #!(str: String = ""): T = {
      LOGGER.info(s"$str:$v"); v
    }
  }
}
