import org.scalatest.funsuite.AnyFunSuite
class Session2Assignment4Test extends AnyFunSuite {
  test("Test case for Int") {
    val intShowValue = new IntFunction
    assert(intShowValue.intShow.show(30) === "30")
  }
  test("Test case for long") {
    val longShowValue = new LongFunction
    assert(longShowValue.longShow.show(6580080088L) === "6580080088")
  }
  test("Test case for double") {
    val doubleShowValue = new DoubleFunction
    assert(doubleShowValue.doubleShow.show(5123233.92) === "5123233.92")
  }
  test("Test case for case class") {
    val position = Position(0,1)
    val positionShowValue = position.positionShow.show(position)
    assert(positionShowValue === "Position(x: 0 , y: 1)")
  }
}

