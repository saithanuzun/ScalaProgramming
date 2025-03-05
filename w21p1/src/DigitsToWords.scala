
import scala.io.StdIn.readChar

object DigitsToWords {
  def main(args: Array[String]): Unit = {

    print("Enter a character in the range '0' to '9'")
    var c: Char = readChar()

    if (c == '0')
      print("Zero")
    else if (c == '1')
      print("One")
    else if (c == '2')
      print("Two")
    else if (c == '3')
      print("Three")
    else if (c == '4')
      print("Four")
    else if (c == '5')
      print("Five")
    else if (c == '6')
      print("Six")
    else if (c == '7')
      print("Seven")
    else if (c == '8')
      print("Eight")
    else if (c == '9')
      print("Nine")
    else
      print("NOT A DIGIT")
  }
}