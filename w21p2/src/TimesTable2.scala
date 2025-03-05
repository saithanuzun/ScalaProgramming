
import scala.io.StdIn.readInt

object TimesTable2 {
  def main(args: Array[String]): Unit = {
    print("Type in a times table size: ")
    var tableSize = readInt()
    
    println()
    
    var row: Int = 1
    
    while (row <= tableSize) {
      
      var col: Int = 1
      
      while (col <= tableSize) {
        print(f"${row * col}%4d" + " ")
        col += 1
      }
      
      print("\n")
      row += 1
    }
    
  }
}