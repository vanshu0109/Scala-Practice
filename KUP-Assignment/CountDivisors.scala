import scala.io.StdIn
object Main extends App {
  println("Enter Numbers: ")
  val firstNumber = StdIn.readInt()
  val secondNumber = StdIn.readInt()
  val thirdNumber = StdIn.readInt()
  var count=0
  def countDivisors(firstNumber: Int, secondNumber: Int, thirdNumber: Int): Int = {
    //Throwing Arithmetic Exception
    if (thirdNumber == 0) {
      throw new ArithmeticException("Divisor cannot be zero")
    }
    for (index <- firstNumber until secondNumber+1) {
      if (index % thirdNumber == 0) {
        count += 1
      }
    }
    //Returning Count of Divisors
    count
  }
  try{
    println(countDivisors(firstNumber, secondNumber, thirdNumber))
  }
  catch {
    case exception: ArithmeticException =>
      println("Error: " + exception.getMessage)
  }
}
