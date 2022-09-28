package com.scalaexample

object collectionExample {
def main(args:Array[String]): Unit ={


  //List
  var numbers: List[String] = List( "one" , "two" , "three" )
  for(i<-numbers){println(i)}
  //set
  var numbers1: Set[Int] = Set( 1 , 2 , 3 )
  print(numbers1)
  //Map
  var countries = Map("India"-> "New Delhi" , "Japan"-> "Tokyo" ,"Germany"-> "Berlin")
  print(countries)
  //tuple
  var mytuple=(1,"CR1",100,25.5,'a')
  print(mytuple)
  //option
  val countData : Option[Int] = Some(10)
  print(countData.getOrElse("none"))

  val v = Iterator(5, 1, 2, 3, 6, 4)
  //checking for availability of next element
  while(v.hasNext){println(v.next())}

}



}
