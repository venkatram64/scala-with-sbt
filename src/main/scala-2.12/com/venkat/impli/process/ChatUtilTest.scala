package com.venkat.impli.process

import com.venkat.impli.ChatUtil
import com.venkat.impli.ChattyAddons._
import com.venkat.vtypes.{Dog, Person}

object ChatUtilTest extends App{
  println(ChatUtil.chat(Person("Venkatram", "Veerareddy")))
  println(ChatUtil.chat(Dog("Puppy")))
}
