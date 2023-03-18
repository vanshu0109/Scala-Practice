trait Show[A] {
  def show(valueType: A): String
}
class IntFunction[A] {
  val intShow: Show[Int] = new Show[Int] {
    override def show(intValue: Int): String = intValue.toString
  }
}
class LongFunction[A] {
  val longShow: Show[Long] = new Show[Long] {
    override def show(longValue: Long): String = longValue.toString
  }
}
class DoubleFunction[A] {
  val doubleShow: Show[Double] = new Show[Double] {
    override def show(doubleValue: Double): String = doubleValue.toString
  }
}
case class Position(xQuardinate: Int, yQuardinate: Int) {
  val positionShow: Show[Position] = new Show[Position] {
    override def show(positionValue: Position): String = s"Position(x: ${positionValue.xQuardinate} , y: ${positionValue.yQuardinate})"
  }
}
