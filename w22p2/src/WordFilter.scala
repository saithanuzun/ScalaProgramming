
import scala.io.StdIn._

object WordFilter {
  def main(args: Array[String]): Unit = {
    var words = new Array[String](5)
    
    for (x <- 0 until words.length) {
      words(x) = readLine("Word? ")
    }
    
    var letters = new Array[Char](5)
    
    for (x <- 0 until letters.length) {
      println("Letter? ")
      letters(x) = readChar()
    }
    
    
    words.filter(x => letters.contains(x.charAt(0))).foreach(println)
  }
}