package com.scalaexample


abstract class myauthor
{

  // abstract method
  def details()
}

// GFG class extends abstract class
class GFG extends myauthor
{
  def details()
  {
    println("Author name: Teja")
    println("Topic name: Abstract class in Scala")
  }
}

object AbstractExample
{
  // Main method
  def main(args: Array[String])
  {
    // objects of GFG class
    var obj = new GFG()
    obj.details()
  }
}
