trait T
class B extends T
class C extends T

object A {
  given b : B
  given c : C
}

object Test extends App {
  import A._
  import given A.{for B}

  val x: B = b // OK
  println(c) // error: not found

  summon[C] // error

}