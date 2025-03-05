
import scala.io.StdIn.readInt

object ProcessingArrays {
  def main(args: Array[String]): Unit = {
    print("Enter a size ")
    var size: Int = readInt()
    var nums = new Array[Int](size)
    
    for (i <- 0 until nums.length) {
      print("Enter a value ")
      nums(i) = readInt()
    }
    
    for (x <- nums) {
      print(x + " ")
    }
  }
}