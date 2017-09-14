package com.venkat.impli3.process

import com.venkat.impli3.Donut
import com.venkat.impli3.DonutImplicits._

object DonutTest extends App{

  val d = Donut("Vanilla", 1.50)
  println(s"Vanilla donut name = ${d.name}")
  println(s"Vanilla donut price = ${d.price}")
  println(s"Vanilla donut price = ${d.productCode}")

  println(s"Vanilla donut price = ${d.uuid}")

}
