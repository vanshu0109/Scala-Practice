object SquareListElements extends App {
  def squareListWithMatch(list: List[Int]): List[Int] = list match {
    case Nil => Nil // for empty list
    case headElement :: tailElement => (headElement * headElement) :: squareListWithMatch(tailElement)
  }
  def squareListWithMap(list: List[Int]): List[Int] = {
    //throws exception for empty list
    if (list.isEmpty) {
      throw new ArithmeticException("Square cannot be done on empty lists")
    }
    val squareOfElement = (number: Int) => (number * number: Int)
    list.map(squareOfElement)
  }
}
