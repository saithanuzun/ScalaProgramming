

import scala.io.StdIn.readInt

object TimesTable {
  def main(args: Array[String]): Unit = {
    println("Type in a number for your times table: ")
    var multiplier = readInt()
    
    for (x <- 1 to 12) {
      println(f"$x%4d" + " * " + multiplier + " = " + f"${multiplier * x}%4d")
    }
    
  }
}