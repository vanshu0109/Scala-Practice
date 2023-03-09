//Integer check Program
import scala.io.StdIn
object Main{

   def integerCheck(userInput:String): Boolean = {
     var count = 0
     for (index <- 0 until userInput.length) {
       if (57 >= userInput.charAt(index).toInt && userInput.charAt(index).toInt >= 48) {
         count=count+1
       }
     }
     if(count != 0){
        false
     }else{
        true
     }
   }
  def main(args: Array[String]): Unit = {
    println("Enter any String: ")
    var userInput = StdIn.readLine()
    println(integerCheck(userInput))
  }
}
