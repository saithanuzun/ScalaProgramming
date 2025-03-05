
import scala.io.StdIn.readInt

object YearOfBirth {
  def main(args: Array[String]): Unit = {
    println("Input your year of birth: ")
    var year = readInt()
    
    var years = for (x <- (year to 2024).toList) yield x
    
    for (x <- years) {
      println(x)
    }
  }
}