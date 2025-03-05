
import scala.io.StdIn.readInt

object MappedTriangle {
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()
    
    println()
    
    (1 to baseHeight).map(x => "* " * x).foreach(println)
  }
}