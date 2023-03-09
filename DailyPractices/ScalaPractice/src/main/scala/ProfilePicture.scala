import scala.io.StdIn

object ProfilePicture extends App {
  try {
    println("Enter Minimum Dimension of the picture ")
    var minimumDimension = StdIn.readInt()
    println("Enter Dimension of the photo ( Width and Height )")
    var width = StdIn.readInt()
    var height = StdIn.readInt()

    //throwing exception for values less than or equal to 0
    if (minimumDimension <= 0 || width <= 0 || height <= 0) {
      throw new ArithmeticException("The value of Minimum Dimension, Width and Height Should be more than 0")
    }

    def ChangeProfilePicture(minimumDimension: Int, width: Int, height: Int): Unit = {
      if (width == height && width == minimumDimension) {
        println("Accepted")
      }
      else if (width < minimumDimension || height < minimumDimension) {
        println("Upload another one")
      }
      else {
        println("Crop it")
      }
    }

    ChangeProfilePicture(minimumDimension, width, height)
  }
  catch {
    case exception: ArithmeticException =>
      println("Error: " + exception.getMessage)
  }
}
