
import scala.io.StdIn.readDouble

object Checkout {
  def main(args: Array[String]): Unit = {
   
    var total: Double = 0
    var count: Int = 0
    
    print("Price?   ")
    var num = readDouble()
    
    while (num != 0) {
      total += num
      count += 1
      
      print("Price?   ")
      num = readDouble()
    }
    
    println("        ------")
    println("Total:   " + total + "    (" + count + " items)")
 
  }
}