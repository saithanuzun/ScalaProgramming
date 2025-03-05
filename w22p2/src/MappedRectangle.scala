
import scala.io.StdIn.readInt

object MappedRectangle {
  def main(args: Array[String]): Unit = {
    print("Select how many units for height? ")
    val height = readInt()
    
    print("Select how many units for width? ")
    val width = readInt()
    
    println()
    
    (1 to height).map(x => "* " * width).foreach(println)
  }
}