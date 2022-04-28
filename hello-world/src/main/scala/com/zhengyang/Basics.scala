package com.zhengyang

object Basics extends App{
  //extend App let application run standalone
  val meaningOfLife: Int = 42 // == const int meaningOfLife = 42,
  //Int, Boolean,Char, Double, Float is the standard types of Scala, string is special
  val aBoolean = false // type is optional
  //string and string operations
  val aString ="I love scala"
  val aComposedString ="I" + " " + "Iove" + " " + "Scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  //expressions = structure that can be reduced to a value
  val anExpression = 2 + 3

  //if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999 //other language :meaningOfLife > 43 ?56:999
  //scala does not think instructions, scala think values and composing
  val chainedIfExpression = {
    if(meaningOfLife>43) 56
    else if (meaningOfLife<0) -2
    else if (meaningOfLife>999) 78
    else 0

  }

  //code blacks
  val aCodeBlock={
    //definitions
    val aLocalValue = 67
    //value of block is the value of the last expression
    aLocalValue + 3

    //define a function
    def myFunction(x:Int,y:String):String = {
      y +" " + x
    }

    //recursive function

    def factorial(n: Int): Int= {
      if (n <= 1) 1
      else n * factorial(n - 1)
      /*
      factorial(5)
       */

      //in Scala we don't use loops or iteration, we use RECURSION

      //the unit type = no meaningful type ==="void" in other languages
      //type of SIDE EFFECTS

    }
    println("I love scala")
    def myUnitReturningFunction(): Unit={
      println("I don't love returning Unit")
    }
    val theUnit=()

    //unit return is ()





  }


}
