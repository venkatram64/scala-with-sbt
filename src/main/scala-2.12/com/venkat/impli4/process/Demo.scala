package com.venkat.impli4.process
import com.venkat.impli4.Run._

object Demo extends App{

  4 times println("Hello, Venkatram")
  /*
  val c = new IntTimes(4)
  c.times(println("Hello, Venkatram"))
  Since there is implicit class that takes an int as its only argument, with a method times,
  doing 4.times implicitly instantiates the class with 4 as argument, and then invokes
  times on it.
   */
}
