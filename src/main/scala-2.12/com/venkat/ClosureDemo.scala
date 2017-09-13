package com.venkat

/**
  * Created by Venkatram on 9/12/2017.
  */
object ClosureDemo extends App{

  //A function that uses one or more free variables is known as a closure.

  var p = 100
  println("Salary hike " + getHike(100000))

  def getHike(sal: Double) = sal * p/100

  def getComputation = (empId: Int) =>{
    val e: Map[Int, Double] = Map(101 -> 34000.0,
                                  102 -> 32000.0,
                                  103 -> 45000.0,
                                  104 -> 14000.0,
                                  104 -> 56000.0
                                  )

    val p: Map[Int, Double] = Map(101 -> 10.0,
                                102 -> 12.0,
                                103 -> 11.0,
                                104 -> 8.0,
                                104 -> 99.0
                              )
    (empId, e(empId) * p(empId)/100.0)
  }

  val getHike1 = getComputation

  println(getHike1(101))
  println(getHike1(104))
}
