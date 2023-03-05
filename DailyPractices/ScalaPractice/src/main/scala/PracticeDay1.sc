class Customer(firstName:String,lastName:String){
}
val customer = new Customer("Vanshika", "Srivastava")
customer
customer.toString

//Additional Constructor
class Hello(message:String){
  def this()=this("How are you ?")
  println(message)
}
