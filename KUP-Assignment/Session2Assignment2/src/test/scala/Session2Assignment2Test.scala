import org.scalatest.funsuite.AnyFunSuite
class Session2Assignment2Test extends AnyFunSuite {
  test("Addition of integers with") {
    val add: Int = ExpandFunctions.expandedAdd(2,4)
    val expectedResult = 6
    assert(add === expectedResult)
  }
  test("Finding sum of elements of list") {
    val sumOfList: Int = ExpandFunctions.expandedSumOfList(List(2,4,6))
    val expectedResult = 12
    assert(sumOfList === expectedResult)
  }
  test("Higher order function for multiplication") {
    def calculationOfExpandedFunction(number: Int): Int = {
      number * 10
    }
    val higherOrderFunction: Int = ExpandFunctions.expandedHigherOrderFunction(calculationOfExpandedFunction,9)
    assert(calculationOfExpandedFunction(higherOrderFunction) === 90)
  }
}
