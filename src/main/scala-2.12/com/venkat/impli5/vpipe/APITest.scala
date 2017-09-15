package com.venkat.impli5.vpipe

import com.venkat.impli5.PipeAddons._

object APITest extends App{
  /*val stdRate = API.getRate * 2 - math.log(API.getRate)
  println(stdRate)*/

  /*
    scala coverts in the following way

    step 1: val stdRate = Pipe(API.getRate()). |> (rate => rate * 2 - math.log(rate))

    since API.getRate() returns the Double
    step 2: val stdRate = Pipe[Double](API.getRate()). |> (rate => rate * 2 - math.log(rate))

    step 3: val stdRate = Pipe[Double](API.getRate()). |>[Double] (rate => rate * 2 - math.log(rate))

   */
  val stdRate = API.getRate. |> (rate => rate *2 -math.log(rate))
  println(stdRate)
}
