import scala.io.StdIn
import scala.io.StdIn.readLine
object PalindromicString {

  //Function to check a palindrome string
  def isPalindromeString(userInput: String): Boolean = {
    reverseString(userInput) == userInput
  }

  //Function to reverse a string
  def reverseString(userInput: String): String = {
    if (userInput.isEmpty) {
      throw new IllegalArgumentException("String must not be empty")
    }
    var temporaryString = ""
    for (index <- 0 until userInput.length) {
      temporaryString = userInput.charAt(index) + temporaryString
    }
    temporaryString
  }
  
  def main(arguments: Array[String]): Unit = {
    try {
      println("Enter a String to check if it's a Palindrome or not: ")
      val userInput = StdIn.readLine()
      val result = if (isPalindromeString(userInput)) "YES" else "NO"
      println(result)
    } catch {
      case exception: IllegalArgumentException =>
        println("Error: " + exception.getMessage)
    }
  }
}


