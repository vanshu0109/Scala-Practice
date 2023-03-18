package com.knoldus
trait Vehicle {
  def move: String
}
trait Driving extends Vehicle {
  val drive: String = "driven"
}
trait Sailing extends Vehicle {
  val sail: String = "sailed"
}
trait Flying extends Vehicle {
  val fly: String = "flown"
}
//Car class extending driving trait
class Car extends Driving {
  override def move: String = s"a Car can be $drive"
}
//Boat class sailing trait
class Boat extends Sailing {
  override def move: String = s"a Boat can be $sail"
}
//Aeroplane class extending flying trait
class Aeroplane extends Flying {
  override def move: String = s"an Aeroplane can be $fly"
}
//FlyingCar class extending flying and driving trait
class FlyingCars extends Driving with Flying {
  override def move: String = s"Flying cars can be $drive and $fly"
}
//Hovercraft class extending sailing and driving trait
class Hovercraft extends Sailing with Driving {
  override def move: String = s"Hovercraft can be $sail and $drive"
}
