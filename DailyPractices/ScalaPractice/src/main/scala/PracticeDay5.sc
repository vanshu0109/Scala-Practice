import scala.jdk.Accumulator

//Example of Recursive function
def RecursiveFunctionOfRepeatingString(name: String,repeat: Int): String =
  if ( repeat == 1) name
  else name + " " + RecursiveFunctionOfRepeatingString(name, repeat-1)
println(RecursiveFunctionOfRepeatingString("Vanshika",5))

//Converting the above Program into tail recursion program
def TailRecursionOfRepeatingString(string: String,repeatTimes: Int,accumulator: String): String =
  if (repeatTimes < 1) accumulator
  else  TailRecursionOfRepeatingString(string, repeatTimes-1,string+accumulator)
println( TailRecursionOfRepeatingString("Hello",4,""))

// Greeting Function
def GreetingFunction(name: String,age: Int): String =
  s"Hello my name is $name and I am $age years old"
GreetingFunction("Shivangi",25)

//Factorial function
def FactorialNumber(number: Int): Int =
  if (number == 1) number
  else number * FactorialNumber(number - 1)
println("Factorial of 6 is: " + FactorialNumber(6))

//Fibonacci Function
def FibonacciNumber(number: Int):Int =
  if( number <= 1) number
  else FibonacciNumber(number-1) + FibonacciNumber(number-2)
println(FibonacciNumber(8))

//converting the normal recursion fibonacci function to tail recursion function
def TailRecursiveFibonacci(times: Int,last: Int,first: Int,count: Int): Int =
  if(count == times) last
  else TailRecursiveFibonacci(times,first+last,last,count+1)
println(TailRecursiveFibonacci(8,1,0,1))
//Prime Number
def IsPrimeNumber(number: Int): Boolean = {
  def isPrimeUntil(halfNumber: Int): Boolean =
    if( halfNumber <= 1) true
    else (number % halfNumber != 0 && isPrimeUntil(halfNumber - 1))

  isPrimeUntil(number)
}
println(IsPrimeNumber(13))