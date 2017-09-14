package com.venkat.vtypes

trait CanChat[A] {
  def chat(x: A): String
}
