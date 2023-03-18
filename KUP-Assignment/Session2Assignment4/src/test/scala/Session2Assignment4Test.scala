import org.scalatest.funsuite.AnyFunSuite
class Session2Assignment4Test extends AnyFunSuite {
  test("Test case 1") {
    val doubleshowValue = doubleShow.show(56.0).toString
    val expected = "56.0"
    assert(doubleshowValue === expected)
  }
  test("Test case 2") {
    val intShowValue = intShow.show(56)
    val expected = "56"
    assert(intShowValue === expected)
  }

  test("Test case 3") {
    val longShowValue = longShow.show(569009090099L)
    val expected = "569009090099"
    assert(longShowValue === expected)
  }
  test("Test case 4") {
    val position = new Position(0, 1)
    val positionString = positionShow.show(position)
    val expected = "Pos(x: 0, y: 1)"
    assert(positionString === expected)
  }
}
