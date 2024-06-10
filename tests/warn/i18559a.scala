//> using options -Wall
// This test checks that -Wall turns on -Wunused:all if -Wunused is not set
object FooImportUnused:
  import collection.mutable.Set // warn

object FooUnusedLocal:
  def test(): Unit =
    val x = 1  // warn

object FooGivenUnused:
  import SomeGivenImports.given // warn

object SomeGivenImports:
  given Int = 0
  given String = "foo"
