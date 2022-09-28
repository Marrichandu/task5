package com.scalaexample
class Shapes
{

  // Method defined with parameters
  def Area(l:Double, b:Double, r:Double)=
  {

    0.0 // Utilized for returning double
  }
}

// Creating a subclass
class Rectangle extends Shapes
{

  // Overriding method to find
  // area of the rectangle
  override def Area(l:Double, b:Double, r:Double)=
  {

    (l * b)
  }
}

// Creating a subclass
class Circle extends Shapes
{

  // Overriding method to find
  // area of the circle
  override def Area(l:Double, b:Double, r:Double)=
  {

    ((3.14)* r * r)
  }
}

// Creating object
object MethodOverriding {
  // Main method
  def main(args:Array[String])
  {

    // Creating instances of all
    // the sub-classes
    var rectangle = new Rectangle()
    var circle = new Circle()

    // Displays area of the rectangle
    println(rectangle.Area(3, 11, 4))

    // Displays area of the circle
    println(circle.Area(1, 7, 10))

  }
}
