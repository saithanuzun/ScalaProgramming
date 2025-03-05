
import scala.io.StdIn._

object Words {
  def main(args: Array[String]): Unit = {
    println("How many words would you like to Store? ")
    var size = readInt()
    
    var words = new Array[String](size)
    
    var i = 0
    while (i < words.length) {
      println("Word " + (i+1) + " ? ")
      words(i) = readLine()
      i += 1
    }
    
    println("\nYou typed in: ")
    i = 0
    var sum = 0.0
    while (i < words.length) {
      println(words(i).toUpperCase)
      sum += words(i).length
      i += 1
    }
    
    var avg = sum / words.length
    println("Average word length is: " + avg)
  }
}