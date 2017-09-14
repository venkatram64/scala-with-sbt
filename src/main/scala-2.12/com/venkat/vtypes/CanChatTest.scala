package com.venkat.vtypes

object CanChatTest extends App{
  val p = Person("Venkatram", "Veerareddy")
  println(PersonCanChat.chat(p))

  val d = Dog("Puppy")
  println(DogCanChat.chat(d))
}
