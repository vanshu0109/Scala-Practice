object ExpandFunctions extends App {
  // 1 -> Function for adding two number which takes two parameter of integer type and return integer type(SIMPLE FUNCTION)
  val addFunction: (Int, Int) => Int = (number1: Int, number2: Int) => number1 + number2
  println(addFunction(4, 1))

  //Expanded function of adding two number
  val expandedAdd: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    def apply(number1: Int, number2: Int): Int = number1 + number2
  }
    println(expandedAdd.apply(3, 4))
  // 2 -> Function for finding sum of elements of list of type list and  return integer type(SIMPLE FUNCTION)
  val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  println(sumOfList(List(4,8,9)))

  // Expanded form of above sum function
  val expandedSumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int]  {
    def apply(list: List[Int]): Int = list.sum
  }
  println(expandedSumOfList.apply(List(3, 4)))

  // 3 ->Higher order Function for multiplying  which takes function and integer as a type and  return integer type(SIMPLE FUNCTION)
  val higherOrderFunction: (Int => Int, Int) => Int = (storeFunction: (Int => Int), num: Int) => calculationFunction(num)
  val calculationFunction: Int => Int = _ * 10
  println(higherOrderFunction(calculationFunction, 17))

  //Expanded form for above function
  val expandedHigherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    def apply(storeFunction: Int => Int, number: Int): Int = storeFunction(number)
  }
  val calculationOfExpandedFunction: Function1[Int, Int] = new Function1[Int, Int] {
    def apply(number: Int): Int = number * 10
  }
  println(higherOrderFunction.apply(calculationOfExpandedFunction, 8))

}
