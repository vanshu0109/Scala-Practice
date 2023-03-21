//Example of Recursive function
def RecursiveFunction(name: String,repeat: Int): String = {
  if ( repeat == 1) name
  else name + " " + RecursiveFunction(name, repeat-1)
}
println(RecursiveFunction("Vanshika",5))

// Greeting Function
def GreetingFunction(name: String,age: Int): String = {
  s"Hello my name is $name and I am $age years old"
}
GreetingFunction("Shivangi",25)

//Factorial function
def FactorialNumber(number: Int): Int = {
  if (number == 1) number
  else number * FactorialNumber(number - 1)

println("Factorial of 6 is: " + FactorialNumber(6))

//Fibonacci Function
def FibonacciNumber(number: Int):Int =
  if( number <= 1) number
  else FibonacciNumber(number-1) + FibonacciNumber(number-2)

println(FibonacciNumber(8))

//Prime Number
/*def IsPrimeNumber(number: Int) =
  if( number )*/
println(System.out)