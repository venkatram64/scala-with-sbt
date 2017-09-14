package com.venkat.impli2

import com.venkat.vtypes.{CanChat, Dog, Person}
//https://www.theguardian.com/info/developer-blog/2016/dec/22/parental-advisory-implicit-content
object ChattyAddons {

  implicit object PersonCanChat extends CanChat[Person]{
    def chat(x: Person) = s"Hi, I'm ${x.firstName} ${x.lastName}"
  }

  implicit object DogCanChat extends CanChat[Dog]{
    def chat(x: Dog) = s"Hi, I'm ${x.name}"
  }

  implicit class ChatUtil[A](x: A){
    def chat(implicit makesChatty: CanChat[A]) = {
      makesChatty.chat(x)
    }
  }

}
