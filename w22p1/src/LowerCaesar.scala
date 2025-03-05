
import scala.io.StdIn._

object LowerCaesar {
  def main(args: Array[String]): Unit = {
    println("Enter a string: ")
    var sentence = readLine()

    println("Enter a rotation: ")
    var rotate = readInt()

    var encrypted = for (x <- sentence if x.isLower) yield (x + rotate).toChar

    println(encrypted)
  }
}