import org.scalatest.funsuite.AnyFunSuite
class SortingAssignmentTest extends AnyFunSuite {
  test("Insertion Sort") {
    val listInput: List[Int] = List(30, 14, 5, 23, 12, 1)
    val expectedResult = List(1,5,12,14,23,30)
    assert(Sorting.insertionSort(listInput) === expectedResult)
  }
  test("Insertion Sort for 1 elements") {
    val listInput: List[Int] = List(2)
    val expectedResult = List(2)
    assert(Sorting.insertionSort(listInput) === expectedResult)
  }
  test("Selection Sort") {
    val listInput: List[Int] = List(30, 14, 5, 23, 12, 1)
    val expectedResult = List(1, 5, 12, 14, 23, 30)
    assert(Sorting.selectionSort(listInput) === expectedResult)
  }
  test("Selection Sort for empty list") {
    assertThrows[IllegalArgumentException] {
      Sorting.selectionSort(List())
    }
  }
  test("Bubble Sort") {
    val listInput: List[Int] = List(30, 14, 5, 23, 12, 1)
    val expectedResult = List(1, 5, 12, 14, 23, 30)
    assert(Sorting.bubbleSort(listInput) === expectedResult)
  }
  test("Bubble Sort for empty list") {
    val listInput: List[Int] = List()
    val expectedResult = List()
    assert(Sorting.bubbleSort(listInput) === expectedResult)
  }
}
