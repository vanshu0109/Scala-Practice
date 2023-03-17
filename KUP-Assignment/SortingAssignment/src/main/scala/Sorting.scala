
object Sorting extends App {
  //Insertion Sort
  def insertionSort(insertionSortList: List[Int]): List[Int] = {
    if (insertionSortList.isEmpty) Nil
    else sortOfInsertion(insertionSortList.head, insertionSort(insertionSortList.tail))
  }

  def sortOfInsertion(numberToBeSorted: Int, insertionSortList: List[Int]): List[Int] =
    if (insertionSortList.isEmpty || numberToBeSorted <= insertionSortList.head) numberToBeSorted :: insertionSortList
    else insertionSortList.head :: sortOfInsertion(numberToBeSorted, insertionSortList.tail)

  // Selection Sort
  def selectionSort(selectionSortList: List[Int], mylist: List[Int] = List()): List[Int] = {
    if (selectionSortList.isEmpty){
      throw new IllegalArgumentException("Sorting cannot be done on empty list")
    }
    val minimumElement = selectionSortList.min
    val resultantList = mylist ++ selectionSortList.filter(_ == minimumElement)
    if (selectionSortList.filter(_ > minimumElement).lengthIs == 0) resultantList
    else selectionSort(selectionSortList.filter(_ > minimumElement), resultantList)
  }

  //Bubble Sort
  def bubbleSort(bubbleSortlist: List[Int]): List[Int] = {
    def bubbleFunction(bubbleSortlist: List[Int], myList: List[Int]): List[Int] = bubbleSortlist match {
      case element1 :: element2 :: restElement if element1 > element2 => bubbleFunction(element1 :: restElement, myList :+ element2)
      case element1 :: element2 :: restElement => bubbleFunction(element2 :: restElement, myList :+ element1)
      case element :: Nil => myList :+ element
      case Nil => myList
    }

    val sortedList = bubbleFunction(bubbleSortlist, List[Int]())
    if (bubbleSortlist == sortedList) bubbleSortlist
    else bubbleSort(sortedList)
  }
}
