open class A() {}
class B(): A() {}

fun castSimple(o: Any) : A = o as A

fun castTest(): Boolean {
  val b = B()
  castSimple(b)
  return true
}

fun main(args: Array<String>) {
  if (!castTest()) throw Error()
}