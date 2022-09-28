package  com.scalaexample

object task5 {

  //6
  // decimal-form literal
  val a = 46

  // Hexa-decimal form literal
  val b = 0xfF

  // Displays results in integer form
  println(a)
  println(b)

  // decimal-form literal
  val a1 = 3.156

  // It is also a decimal form of the literal
  val b1 = 0123.34

  // Displays results
  println(a1)
  println(b1)

  // Creating a character literal in single quote
  val x = 'b'

  // uni-code representation of character literal
  val y = '\u0051'

  // Escape sequence in character literals
  val z = '\n'

  // Displays results
  println(x)
  println(y)
  println(z)

  // Creating a multiple line string literal
  val x1 =
    """My
      |Name
      |is
      |Teja
      |""".stripMargin

  // Displays multiple lines
  println(x1)



  // variables
  var a2 = 50;
  var b2 = 30;

  // Addition
  println("Addition of a + b = " + (a2 + b2));

  // Subtraction
  println("Subtraction of a - b = " + (a2 - b2));

  // Multiplication
  println("Multiplication of a * b = " + (a2 * b2));

  // Division
  println("Division of a / b = " + (a2 / b2));

  // Modulus
  println("Modulus of a % b = " + (a2 % b2))



  //7
  //ASSIGNMENT OPERATORS

  var a3 = 50;
  var b3 = 40;
  var c3 = 0;

  // simple addition
  c3 = a3 + b3;
  println("simple addition: c= a + b = " + c3);

  // Add AND assignment
  c3 += a3;
  println("Add and assignment of c += a = " + c3);

  // Subtract AND assignment
  c3 -= a3;
  println("Subtract and assignment of c -= a = " + c3);

  // Multiply AND assignment
  c3 *= a3;
  println("Multiplication and assignment of c *= a = " + c3);

  // Divide AND assignment
  c3 /= a3;
  println("Division and assignment of c /= a = " + c3);

  // Modulus AND assignment
  c3 %= a3;
  println("Modulus and assignment of c %= a = " + c3);

  // Left shift AND assignment
  c3 <<= 3;
  println("Left shift and assignment of c <<= 3 = " + c3);

  // Right shift AND assignment
  c3 >>= 3;
  println("Right shift and assignment of c >>= 3 = " + c3);

  // Bitwise AND assignment
  c3 &= a3;
  println("Bitwise And assignment of c &= 3 = " + c3);

  // Bitwise exclusive OR and assignment
  c3 ^= a3;
  println("Bitwise Xor and assignment of c ^= a = " + c3);

  // Bitwise inclusive OR and assignment
  c3 |= a3;
  println("Bitwise Or and assignment of c |= a = " + c3);


  //8
   //TYPE INFERENCE
   // prints a double value
   def factorial(n: Int)= {

     var f = 1
     for(i <- 1 to n)
     {
       f = f * i;
     }

     f
   }

  // Driver Code
  def main(args: Array[String])
  {
    println(factorial(5))
  }









}
