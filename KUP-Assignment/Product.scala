import scala.io.StdIn
object ProductOfArrayElements {
  def main(arguments: Array[String]): Unit = {
    println("Enter Size of Array: ")
    val arraySize = StdIn.readInt()

    val inputArray = new Array[Int](arraySize)
    println(s"Enter the Numbers:")
    for (index <- 0 until arraySize) {
      inputArray(index) = StdIn.readInt()
    }

    val productResult = FindProduct(inputArray)
    println(s"The Product of the Entered Array Numbers is: $productResult")
  }

  //Function to find Product of array elements
  def FindProduct(array: Array[Int]): Int = {
    var product = 1
    for (elements <- array) {
      product *= elements
    }
    product
  }
}
