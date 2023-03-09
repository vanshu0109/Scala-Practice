object anonymousFunction extends App{
       private val addition: (Int, Int, String) => String = (firstValue: Int, secondValue: Int, thirdValue: String) => (firstValue + secondValue + thirdValue)
       println(addition(1,2,"hello"))

       private val checker: (String, Int) => String = (name: String, age: Int) => {
              if ( age < 20){
                    name + " is less than 20"
              }else {
                     name + " is more than 20"
              }
       }
       println(checker("Vanshika",23))

       private val concat: (Int, Int) => String = (firstNumber, secondNumber) => (firstNumber * secondNumber) + "abc"
       println(concat(2,4))
}
