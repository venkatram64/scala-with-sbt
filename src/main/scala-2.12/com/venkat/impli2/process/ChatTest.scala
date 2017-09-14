package com.venkat.impli2.process

import com.venkat.impli2.ChattyAddons._
import com.venkat.vtypes.{Dog, Person}

object ChatTest extends App{

  /*
  ChatUtil defines a type which can chat. Person and Dog define types
  which we would like to be able to chat. We can automatically convert
  instances of Person and Dog into instances of ChatUtil by trying to
  call the .chat method on instances of Person and Dog.  This class will
  use a type parameter and so be able to convert from a range of types.
  which ones? Those which correspond to the type class instances that
  are in scope.
   */

  val msg = Person("Venkatram","Veerareddy").chat
  println(msg)

  val msg2 = Dog("Puppy").chat
  println(msg2)

}
