

import scala.io.StdIn.readInt

object TimesTable {
  def main(args: Array[String]): Unit = {
    println("Type in a number for your times table: ")
    var multiplier = readInt()
    
    var count: Int = 1 
    
    while (count <= 12) {
      println(f"$count%4d" + " * " + multiplier + " = " + f"${multiplier * count}%4d")
      count = count + 1
    }
  }
}