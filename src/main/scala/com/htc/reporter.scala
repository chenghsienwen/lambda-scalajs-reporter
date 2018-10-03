package com.htc

import com.htc.models.amazon.{Context, Event}

import scala.scalajs.js.annotation.JSExport

@JSExport
object AlexaSuccess {
  @JSExport("apply")
  def apply(event: Event, context: Context): String = {
    println(context.invokedFunctionArn)
    println(event.request)
    "Completed successful invocation."
  }
}

@JSExport
object AlexaFail {
  @JSExport("apply")
  def apply(event: Event, context: Context): String = {
    println("Invocation failed.")
    throw new IllegalArgumentException("failed from Scala")
  }
}
