package com.venkat.impli

import com.venkat.vtypes.CanChat

object ChatUtil {
  def chat[A] (x: A)(implicit chattyThing: CanChat[A]) = {
    chattyThing.chat(x)
  }
}
