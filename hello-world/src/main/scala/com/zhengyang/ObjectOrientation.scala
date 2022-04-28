package com.zhengyang

object ObjectOrientation extends App {
  //java equivalent:public static void main(String[] args)

  //class and instance
  class Animal {
    //define fields
    val age: Int = 0

    //define methods
    def eat() = println("I am eating")

  }

  val anAnimal = new Animal

  //inheritance
  class Dog(val name: String) extends Animal { //constructor definition

  }

  val aDog = new Dog("Lassie")

  //constructor arguments are not fields, need to put a val before constructor argument
  aDog.name

  //subtype polymorphism
  val aDeclaredAnimals: Animal = new Dog("Hachi")
  aDeclaredAnimals.eat() // the most derived method will be called at runtime

  //abstract class
  abstract class WalkingAnimal {
    val hasLegs = true //by default public, can restrict by private or protected

    def walk(): Unit

  }

  //"interface" = ultimate abstract type
  trait Carnivore {
    def eat(animal: Animal): Unit

  }

  trait Philosopher {
    def ?!(thought: String): Unit //valid method name

  } //single class inheritance, multi-trait

  class Crocodile extends Animal with Carnivore with Philosopher {
    override def eat(animal: Animal): Unit = println("I am eating you, animal")

    override def ?!(thought: String): Unit = println(s"I was thinking: $thought")


  }

  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog //infix notation = object method argument, only available for method with one argument
  aCroc ?! "what if we could fly?"

  //operators in Scala are actually methods
  val basicMath = 1 + 2
  val anotherBasicMath = 1.+(2) //equivalent

  //anonymous classes

  val dinosaur = new Carnivore {
    override def eat(animal: Animal): Unit = println("I am a disnosaur so i can eat pretty much anything")
  }

  /*
  what you tell the compiler:
  class Carnivore_Anonymous_35728 extends Carnivore{
   override def eat(animal:Animal):Unit = println("I am a dinosaur so i can eat pretty much anything")
  }
  val dinosaur = new Carnivore_Anonymous_35728

   */
  //singleton object
  object MySingleton { // the only instance of the MySingleton type
    val mySpecialValue = 53278

    def mySpecialMethod(): Int = 5327

    def apply(x: Int): Int = x + 1

  }

  MySingleton.mySpecialMethod()
  MySingleton.apply(65)
  MySingleton(65) //equivalent to MySingleton.apply(65)

  object Animal { //companion with Animal Class = companion object
    //companions can access each other's private fields/methods
    //singleton Animal and instances of Animal are different things
    val canLiveIndefinitely = false

  }

  val animalsCanLiveForever = Animal.canLiveIndefinitely // static field/methods

  /*
  case classes = lightweight data structure with some boilerplate
  -sensible equals and hash code
  -serialization
  -companion with apply
  -pattern matching

   */
  case class Person(name: String, age: Int)

  //may be constructed without new
  val bob = Person("Bob", 54) //Person.apply("Bob",54)

  //exceptions
  try {
    //code that can throw
    val x: String = null
    x.length
  } catch {
    case e: Exception=> "some faulty error message"

  }finally{
    //execute some code no matter what
  }

  //generics
  abstract class MyList[T]{
    def head:T
    def tail:MyList[T]
  }

  //use a generic with a concrete type
  val aList:List[Int]=List(1,2,3)//list.apply(1,2,3)
  val first = aList.head
  val rest=aList.tail
  val aStringList=List("hello","scala")
  val firstString = aStringList.head

  //point #1: in scala we usually operate iwth IMMUTABLE values/ojects
  //Any modification to an object must return ANOTHER object
  /*
  Benefits:
  1.work miracles in multithreaded/distributed environment
  2.helps making sense of the code("reasoning about")

  scala is closet to the oo ideal

   */
  val reversedList= aList.reverse //return a new list
















}
