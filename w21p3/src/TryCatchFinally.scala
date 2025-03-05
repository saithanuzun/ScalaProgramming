import scala.io.StdIn.readInt

object TryCatchFinally {
  def main(args: Array[String]): Unit = {
    
    try {
      
      println("Enter a size ")
      var size = readInt()

      var nums = new Array[Int](size)
      println(nums(size))
      
    } catch {
      
      case e: ArrayIndexOutOfBoundsException => println("Out of bounds")
      case e: NumberFormatException => println("Invalid number")
      case _: Throwable => println("Oops - another exception occurred")
      
    } finally {
      
      println("Program exiting...")
    }
    
    
  }
}