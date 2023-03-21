class Train(kind: String,number: Int)
val trainObject=new Train("steam",1501)
//cannot access value of kind as it is not a member of train
// trainObject.kind

//creating time class and performing tasks
class Time(val hours:Int=0,val minutes:Int=0){
  //TODO:Verify that hours is within 0 and 23
  //TODO:Verify that minutes is within 0 and 59
  val totalMinutes: Int = (hours * 60)+minutes
  def minus(that:Time):Int = totalMinutes-that.totalMinutes
  def -(that:Time):Int=minus(that)
}

val timeObject=new Time(10,20)
val timeSecondObject=new Time(1,2)
val timeThirdObject=new Time(minutes = 2)
timeObject.hours
timeObject.minutes
timeObject.totalMinutes

timeSecondObject.hours
timeSecondObject.minutes
timeSecondObject.totalMinutes

timeThirdObject.hours
timeThirdObject.minutes

timeObject minus(timeSecondObject)
timeObject - timeSecondObject

//Creating methods
def hello="Hi, It's Vanshika here"
hello
def print(message:String):String=message
print("I am good")
def addition(firstNumber:Int,secondNumber:Int):Int=firstNumber+secondNumber
addition(10,50)