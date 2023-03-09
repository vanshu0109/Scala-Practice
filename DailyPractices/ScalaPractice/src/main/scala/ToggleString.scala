import scala.io.StdIn

object ToggleString extends App {
  println("Enter Any String: ")
  val userInput = StdIn.readLine()
  var resultantString = ""

  def ToggleStrings(userInput: String): String = {
    // throwing exception for empty user input
    if (userInput.isEmpty) {
      throw new IllegalArgumentException("Entered string cannot be empty")
    }
    for (index <- 0 until userInput.length) {
      // throwing exception if the input string is a digit
      if (userInput.charAt(index).isDigit) {
        throw new IllegalArgumentException("Digits can't be converted to Uppercase or Lowercase")
      }
      if (122 >= userInput.charAt(index) && userInput.charAt(index) >= 97) {
        //converting the user input to Uppercase
        resultantString += (userInput.charAt(index).toInt - 32).toChar
      }
      else {
        //converting the user input to Lowercase
        resultantString += (userInput.charAt(index).toInt + 32).toChar
      }
    }
    resultantString
  }

  try {
    println(ToggleStrings(userInput))
  }
  catch {
    case exception: IllegalArgumentException =>
      println("Error: " + exception.getMessage)
  }
}

