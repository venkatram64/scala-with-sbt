package com.venkat.impli3

object DonutImplicits {
  //How to define an implicit class to augment or extend the Donut object with a uuid field
  implicit class AugmentedDonut(donut: Donut){
    def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(1234)}}"
  }

}
