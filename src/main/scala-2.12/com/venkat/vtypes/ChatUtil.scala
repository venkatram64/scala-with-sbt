package com.venkat.vtypes

object ChatUtil {
  def chat[A](x: A, chattyThing: CanChat[A]) = {
    println(chattyThing.chat(x))
  }
}
