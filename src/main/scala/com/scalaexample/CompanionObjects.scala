package com.scalaexample

class Person {
var name=" "
var age:Int=_

}

object Person{


  def apply(name:String,age:Int):Person={
    var p=new Person
    p.name=name
    p.age=age
    p
  }

  def unapply(p: Person): Tuple2[String, Int] = (p.name, p.age)

}

object CompanionObjects{
  def main(args: Array[String]) {
    val p1 = Person.apply("chandu", 18)
    val p2 = Person.unapply(p1)
    println(p2)
  }
}