
import scala.io.StdIn.readInt

object SumOfTwo {

  def main(args: Array[String]): Unit = {

    print("enter 1 integer : ")
    var num1: Int = readInt()

    print("enter 2 integer : ")
    var num2: Int = readInt()

    print("enter 3 integer : ")
    var num3: Int = readInt()

    if (num1 + num2 == num3) println("Yes")
    else if (num1 + num3 == num2) println("Yes")
    else if (num2 + num3 == num1) println("Yes")
    else println("No")

  }
}