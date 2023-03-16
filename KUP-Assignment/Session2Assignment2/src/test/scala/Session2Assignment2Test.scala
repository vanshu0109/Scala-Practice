import org.scalatest.funsuite.AnyFunSuite
class Session2Assignment2Test extends AnyFunSuite {
  val addFunction: (Int, Int) => Int = (number1: Int, number2: Int) => number1 + number2
  val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  val higherOrderFunction: (Int => Int, Int) => Int = (storeFunction: (Int => Int), number: Int) => storeFunction(number)

  test("Addition of integers with") {
        assert(addFunction(2,4) === 6)
  }
  test("Finding sum of elements of list") {
    assert(sumOfList(List(1,2,3,4,5)) === 15)
  }
  test("Higher order function for multiplication") {
    assert(higherOrderFunction((number:Int) => number * 10,9) === 90)
  }
}
