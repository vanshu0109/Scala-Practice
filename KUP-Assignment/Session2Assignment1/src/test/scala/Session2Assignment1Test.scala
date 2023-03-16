import org.scalatest.funsuite.AnyFunSuite
class Session2Assignment1Test extends AnyFunSuite {
  test("Square of List Elements with map") {
    val listInput: List[Int] = List(3, 4, 7, 12, 9)
    val expectedResult = List(9, 16, 49, 144, 81)
    assert(SquareListElements.squareListWithMap(listInput) === expectedResult)
  }
  test("Square of empty list elements with map") {
    assertThrows[ArithmeticException] {
      SquareListElements.squareListWithMap(List())
    }
  }
  test("Square of List Elements with match") {
    val listInput: List[Int] = List(3, 4, 7, 12, 9)
    val expectedResult = List(9, 16, 49, 144, 81)
    assert(SquareListElements.squareListWithMatch(listInput) === expectedResult)
  }
}
