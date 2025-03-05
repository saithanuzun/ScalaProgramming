

import scala.io.StdIn.readInt

object NumericSequence {
  def main(args: Array[String]): Unit = {
    println("Start number? ")
    var start: Int = readInt()
    
    println("End number? ")
    var end: Int = readInt()
    
    if (start < end) {
      for (x <- start to end) {
        println(x)
      }
    } else {
      for (x <- start to end by -1) {
        println(x)
      }
    }
  }
}