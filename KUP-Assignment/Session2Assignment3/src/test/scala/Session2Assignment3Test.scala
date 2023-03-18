package com.knoldus
import org.scalatest.funsuite.AnyFunSuite
class Session2Assignment3Test extends AnyFunSuite {
  test("Car Class") {
    val carObject = new Car()
    assert(carObject.move === "a Car can be driven")
  }
  test("Boat Class") {
    val boatObject = new Boat()
    assert(boatObject.move === "a Boat can be sailed")
  }
  test("Aeroplane Class") {
    val aeroplaneObject = new Aeroplane()
    assert(aeroplaneObject.move === "an Aeroplane can be flown")
  }
  test("FlyingCars Class") {
    val flyingCarObject = new FlyingCars()
    assert(flyingCarObject.move === "Flying cars can be driven and flown")
  }
  test("FlyingCars Class cannot be sailed") {
    val flyingCarObject = new FlyingCars()
    assert(flyingCarObject.move != "Flying cars can be driven and sailed")
  }
  test("Hovercraft Class") {
    val hovercraftObject = new Hovercraft()
    assert(hovercraftObject.move === "Hovercraft can be sailed and driven")
  }
}
