import org.scalatest.funsuite.AnyFunSuite

class ElectricityBillGeneratorTest extends AnyFunSuite {

  test("ElectricityBillCalculator.calculateBill to generate the bill") {
    val userAccount = ElectricityBillGenerator(1001, "user1", "Delhi", 5062, 5904)
    val expectedCharges = 7073.51
    assert(ElectricityBillCalculator.calculateBill(userAccount) === expectedCharges)
  }
  test("ElectricityBillCalculator should throw an IllegalArgumentException if account number is less than or equal to zero") {
    assertThrows[IllegalArgumentException] {
      ElectricityBillGenerator(0, "user1", "Delhi", 5062, 5904)
    }
  }
  test("ElectricityBillCalculator should throw an IllegalArgumentException if current unit is less than previous unit") {
    assertThrows[IllegalArgumentException] {
      ElectricityBillGenerator(1001, "user1", "Delhi", 5904, 5062)
    }
  }
  test("ElectricityBillCalculator should throw an IllegalArgumentException if previous unit is equal to zero") {
    assertThrows[IllegalArgumentException] {
      ElectricityBillGenerator(1001, "user1", "Delhi", 0, 5062)
    }
  }
}
