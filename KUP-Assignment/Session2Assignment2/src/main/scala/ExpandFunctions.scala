object ExpandFunctions extends App {
  //1 -> val addFunction: (Int, Int) => Int = (number1: Int, number2: Int) => number1 + number2 (SIMPLE FUNCTION)

  //Expanded function of above function
  val expandedAdd: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    override def apply(number1: Int, number2: Int): Int = number1 + number2
  }

  //2 -> val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum (SIMPLE FUNCTION)

  // Expanded form of above sum function
  val expandedSumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int] {
    override def apply(list: List[Int]): Int = list.sum
  }
  //3 -> val higherOrderFunction: (Int => Int, Int) => Int = (storeFunction: (Int => Int), num: Int) => calculationFunction(num) (SIMPLE FUNCTION)

  //Expanded form for above function
  val expandedHigherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    override def apply(storeFunction: Int => Int, number: Int): Int = storeFunction(number)
  }
  val calculationOfExpandedFunction: Function1[Int, Int] = new Function1[Int, Int] {
    def apply(number: Int): Int = number * 10
  }
}
