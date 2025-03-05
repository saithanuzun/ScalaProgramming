import scala.io.StdIn.readInt

object Signum2 {

  def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number = readInt()

    var message = if (number > 0) {
      " is positive"
    } else if (number < 0) {
      " is negative"
    } else {
      " is zero"
    }

    println(number + message)
  }
}