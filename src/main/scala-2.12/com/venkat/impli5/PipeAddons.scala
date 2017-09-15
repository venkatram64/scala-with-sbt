package com.venkat.impli5

object PipeAddons {

  implicit class Pipe[T](v: T) {
    def |>[U](f: T => U): U = f(v)
    //def $$[U](f: T => U): U = {f(v); v}
  }

}
