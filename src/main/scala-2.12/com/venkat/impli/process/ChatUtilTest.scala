package com.venkat.impli.process

import com.venkat.impli.ChatUtil
import com.venkat.impli.ChattyAddons._
import com.venkat.vtypes.{Dog, Person}

object ChatUtilTest extends App{
  //implicit object PersonCanChat extends CanChat[Person]  created automatically
  println(ChatUtil.chat(Person("Venkatram", "Veerareddy")))
  //implicit object DogCanChat extends CanChat[Dog] created automatically
  println(ChatUtil.chat(Dog("Puppy")))
}
