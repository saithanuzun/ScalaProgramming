
import scala.io.StdIn.readLine

object ProcessingArrays2 {
  def main(args: Array[String]): Unit = {
    var nums = new Array[String](10)

    var i = 0
    while (i < nums.length) {
      nums(i) = readLine("Enter a string ")
      i += 1
    }

    i = 0
    while (i < nums.length) {
      print(nums(i) + " ")
      i += 1
    }
  }
}