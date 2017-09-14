package com.venkat.vtypes

case class Person (firstName: String, lastName: String)

object PersonCanChat extends CanChat[Person]{
  def chat(x: Person) = s"Hi, I'm ${x.firstName} ${x.lastName}"
}


