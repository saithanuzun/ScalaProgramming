
import scala.io.StdIn.readInt

object SortThree {
  def main(args: Array[String]): Unit = {

    print("enter 1 integer : ")
    var a: Int = readInt()

    print("enter 2 integer : ")
    var b: Int = readInt()

    print("enter 3 integer : ")
    var c: Int = readInt()

    if (a < b) {
      if (b < c) {
        println(a + "," + b + "," + c)
      } else if (c < a) {
        println(c + "," + a + "," + b)
      } else {
        println(a + "," + c + "," + b)
      }
    } else {
      if (a < c) {
        println(b + "," + a + "," + c)
      } else if (c < b) {
        println(c + "," + b + "," + a)
      } else {
        println(b + "," + c + "," + a)
      }
    }

  }
}