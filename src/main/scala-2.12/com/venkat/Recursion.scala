package com.venkat

import scala.io.Source

/**
  * Created by Venkatram on 9/10/2017.
  */

class Recursion {

  def rFactorial(n: Int): Int = {
    if(n <= 0) 1
    else n * rFactorial(n-1)
  }

  def tFactorial(n: Int, f: Int): Int = {
    if(n <= 0) 1
    else tFactorial(n - 1, n * f)
  }

  def factorial(n: Int): Int = {
    println("You called factorial for " + n)
    def tFactorial2(n: Int, f: Int): Int = {
      if(n <= 0) f
      else tFactorial2(n - 1, n * f)
    }
    tFactorial2(n,1)
  }

  def twice(f: => Int) = {
    f + f
  }
  //caching
  def twice2(f: => Int) = {
    val i = f
    println("We have not used i yet.")
    i + i
  }

  //caching with lazy evaluation
  def twice3(f: => Int) = {
    lazy val i = f
    println("We have not used i yet.")
    i + i
  }

  def filterLog: Unit = {
    val s = Source.fromFile("xx.log").getLines()
              .toList.filterNot(_.contains("[error]"))
                .take(2)
    s foreach println
  }

  def filterLogWithStream: Unit = {
    val s = Source.fromFile("xx.log").getLines()
      .toStream.filterNot(_.contains("[error]"))
      .take(2)
    s foreach println
  }

  //list is constructed with ::  similarly stream is constructed with #::
  def fibFrom(a: Int, b: Int): Stream[Int] = a #:: fibFrom(b, a + b)
  //scala pattern match
  def myTest(x: Any) = {
    x match {
      case i: Int => "It's integer = " + i
      case s: String => "It's string = " + s
      case d: Double => "It's double = " + d
      case _ => "Oops it is something else"
    }
  }

}

object Recursion extends App{
  val r = new Recursion
  //println(r.rFactorial(5))

  //println(r.rFactorial(5))

  //println(r.factorial(5))

  //println(r.twice(r.factorial(15)/r.factorial(11)))

  //println(r.twice2(r.factorial(15)/r.factorial(11)))
  //lazy evaluation
  /*lazy val rVal = r.factorial(15)/r.factorial(11)

  println(rVal)
  //it does not call again
  println(rVal)*/
  // observe the difference of below two calls
  println(r.twice2(r.factorial(15)/r.factorial(11)))
  println("----------------")
  println(r.twice3(r.factorial(15)/r.factorial(11)))

  r.filterLogWithStream

  val fib = r.fibFrom(0,1)

  fib.takeWhile( _ < 10) foreach println

  println(r.myTest("Venkatram"))
}
