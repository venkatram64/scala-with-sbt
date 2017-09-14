package com.venkat.vtypes

object ChatUtilTest extends App{
  ChatUtil.chat(Dog("Puppy"), DogCanChat)
  ChatUtil.chat(Person("Venkatram", "Veerareddy"), PersonCanChat)
}
