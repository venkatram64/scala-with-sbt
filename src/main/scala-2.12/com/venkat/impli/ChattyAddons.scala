package com.venkat.impli

import com.venkat.vtypes.{CanChat, Dog, Person}

object ChattyAddons {

  implicit object PersonCanChat extends CanChat[Person]{
    def chat(x: Person) = s"Hi, I'm ${x.firstName} ${x.lastName}"
  }

  implicit object DogCanChat extends CanChat[Dog]{
    def chat(x: Dog) = s"Hi, I'm ${x.name}"
  }

}
