

import scala.io.StdIn.readInt

object XToOne {
  def main(args: Array[String]): Unit = {
    println("Type in a maximum between 2 - 1000: ")
    var max = readInt()

    var count: Int = max //start value - of the counter

    while (count >= 1) { //condition - iterate whilst true
      println(f"$count%4d")
      count = count - 1 //update - by decrementing count
    }
  }
}