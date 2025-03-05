

import scala.io.StdIn.readInt

object TimesTable3 {
  def main(args: Array[String]): Unit = {
    print("Type in a number for your times table: ")
    var tableSize = readInt()
    
    println()
    
    var header: Int = 1
    
    print("        ")
    
    while (header <= tableSize) {
      print(f"${header}%4d" + " ")
      header +=1 
    }
    
    header = 1
    print("\n       ")
    
    /*while (header <= tableSize) {
      print("-----")
      header +=1 
    }*/
    print("-----" * tableSize)
    
    print("\n")
    
    
    var row: Int = 1
    
    while (row <= tableSize) {
      
      var col: Int = 1
      
      print(f"$row%3d" + "   | ")
      
      while (col <= tableSize) {
        print(f"${row * col}%4d" + " ")
        col += 1
      }
      
      print("\n")
      row += 1
    }
    
  }
}