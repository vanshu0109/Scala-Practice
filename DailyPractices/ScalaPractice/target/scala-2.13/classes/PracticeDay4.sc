//Collection type
val vector = Vector(1,2,3)
Vector("1","2")
Vector("1",2)
Seq(1,2,3,4)
Set(4,5,'9')
val sequence=Seq[Int](1,2,3)

// case classes
case class Station(name:String)
case class Train(kind:String,number:Int,schedule:Seq[Station]){
  require(schedule.take(2).size == 2,"Schedule should contain atleast 2 elements")
}
//new Train("hello",45,new Station("hello","jkl"))


//Palindrome string
val str="aba"
var temp=""
for(i <- 0 until str.size){
  temp=str.charAt(i)+temp
}
if(temp == str){
  println("Yes")
}else {
  println("No")
}

val a=12
println(a.isNaN)
