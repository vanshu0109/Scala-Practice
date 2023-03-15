import org.scalatest.funsuite.AnyFunSuite
class FactorialNumberTest extends AnyFunSuite {
  test("FactorialAssignment.FactorialNumber to calculate the factorial") {
    val expectedResult = 720
    assert(FactorialAssignment.FactorialNumber(1,6) === expectedResult)
  }
  test("FactorialAssignment.FactorialNumber to calculate the factorial of 0") {
    val expectedResult = 1
    assert(FactorialAssignment.FactorialNumber(1, 0) === expectedResult)
  }
  test("FactorialAssignment.FactorialNumber to calculate the factorial of 1") {
    val expectedResult = 1
    assert(FactorialAssignment.FactorialNumber(1, 1) === expectedResult)
  }
  test("FactorialAssignment.FactorialNumber should throw an IllegalArgumentException if number is less than zero") {
    assertThrows[IllegalArgumentException] {
      FactorialAssignment.FactorialNumber(1,-2)
    }
  }
}
