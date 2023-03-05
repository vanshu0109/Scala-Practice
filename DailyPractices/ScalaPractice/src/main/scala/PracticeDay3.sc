"Hello World".split(" ")
"Vanshika Srivastava" .split(" ").size
"Vanshika".size

12==12
"Vanshika"=="Vanshika"
999 != 999
123 == "vanshika"
"vanshika" ne null

class Time(val hours:Int=0,val minutes:Int=0){
  require(hours >= 0 && hours < 24,"Hours should be between 0 and 24")
  require(minutes >= 0 && minutes < 60, "Minutes should be between 0 and 60")
}
//new Time(1,69)

object Time {
  def fromMinutes(minutesParameter: Int): Time = {
    val hours = minutesParameter / 60
    val minutes= minutesParameter % 60
    new Time(hours,minutes)
  }
}

val time=Time.fromMinutes(125)
time.hours
time.minutes