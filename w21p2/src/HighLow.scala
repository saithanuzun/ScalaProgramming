
import scala.io.StdIn.readInt
import scala.util.Random

object HighLow {
  def main(args: Array[String]): Unit = {
    var count = 1
    var secret = new Random().nextInt(21)
    
    print("Guess\n\t? ")
    var guess = readInt()
    
    while (guess != secret) {
      
      if (guess < secret) {
        print("Higher\n\t? ")
      } else if (guess > secret) {
        print("Lower\n\t? ")
      }
      
      guess = readInt()
      count += 1
    }
    
    println("\nCorrect - this took you " + count + " guesses.")
      
    
  }
}