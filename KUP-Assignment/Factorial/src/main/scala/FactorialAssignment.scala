object FactorialAssignment extends App {
    def FactorialNumber(product: Int, number: Int): Int = {
      //throws exception for negative numbers
      if(number < 0){
        throw new IllegalArgumentException("Number cannot be less than zero")
      }
      if (number == 0) product
        //Calculating factorial using tail recursion
      else FactorialNumber(product * number, number - 1)
    }
}
