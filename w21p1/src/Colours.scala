import scala.io.StdIn.readInt

object Colours {

  def main(args: Array[String]): Unit = {
    println("Type in a number between 1 and 7 ")
    var digit: Int = readInt()

    var rainbow = digit match {

      case 1 => "Red"
      case 2 => "Orange"
      case 3 => "Yellow"
      case 4 => "Green"
      case 5 => "Blue"
      case 6 => "Indigo"
      case 7 => "Violet"

      case _ => "Number is not valid"
    }

    println(rainbow)
  }
}