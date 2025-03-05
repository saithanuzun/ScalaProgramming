
import scala.io.StdIn.readInt

object YearRange {
  def main(args: Array[String]): Unit = {
    println("Input your year of birth: ")
    var year = readInt
    
    (year to 2024).filter(x => !(x % 4 == 0)).foreach(println)
    
  }
}