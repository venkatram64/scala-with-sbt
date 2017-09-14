package com.venkat.vtypes

case class Dog(name: String)

object DogCanChat extends CanChat[Dog]{
  def chat(x: Dog) = s"Hi, I'm ${x.name}"
}
