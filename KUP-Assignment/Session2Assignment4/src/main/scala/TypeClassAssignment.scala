trait Show[A] {
  def show(valueType: A): String
}
object TypeClassAssignment extends App {

  implicit val doubleShow: Show[Double] = new Show[Double] {
    def show(value: Double): String = value.toString
  }

  implicit val longShow: Show[Long] = new Show[Long] {
    def show(value: Long): String = value.toString
  }

  case class Position(xQuadrinate: Int, yQuadrinate: Int)
  implicit val positionShow: Show[Position] = new Show[Position] {
    def show(positionValue: Position) = s"Pos(x: ${positionValue.xQuadrinate}, y: ${positionValue.yQuadrinate})"
  }

}