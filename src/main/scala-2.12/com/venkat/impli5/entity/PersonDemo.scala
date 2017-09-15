package com.venkat.impli5.entity

import com.venkat.impli5.PipeAddons._

object PersonDemo extends App{
  val persons = List(
    Person("Venkatram","Veerareddy",51, true),
    Person("Jane","Doe",33, true),
    Person("John","Johnson",45, false),
    Person("Will","Smith",38, true),
    Person("Mike","Tyson",47, true),
    Person("Pat","Nathon",21, true),
    Person("Jimmy","Watts",31, false)
  )

  persons.filter(_.valid)
      .map(_.firstName)

}
