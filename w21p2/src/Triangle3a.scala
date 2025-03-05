
import scala.io.StdIn.readInt

object Triangle3a {
   def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()
    
    println()
    
    var row: Int = 1
    
    while (row <= baseHeight) {
      
      var col: Int = 1
      var output = ""
      
      while (col <= row) {
        output += "* "  
        col += 1
      }
      
      print(String.format(s"%${baseHeight*2}s", output))
        
      print("\n")
      row += 1
    }
    
  }
}