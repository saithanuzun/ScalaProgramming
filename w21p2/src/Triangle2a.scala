
import scala.io.StdIn.readInt

object Triangle2a {
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()
    
    println()
    
    var row: Int = baseHeight
    
    while (row >= 1) {
      
      var col: Int = 1
      
      while (col <= row) {
        print("* ")
        col += 1
      }
      
      print("\n")
      row -= 1
    }
    
  }
}