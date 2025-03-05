

object UsingArrays2 {

  def main(args: Array[String]): Unit = {
    var numbers = new Array[Int](5)
    numbers(0) = 1
    numbers(1) = 2
    numbers(2) = 3
    numbers(3) = 5
    numbers(4) = 4

    println("The Numbers in your array are:")

    println(numbers(4))
    println(numbers(3))
    println(numbers(2))
    println(numbers(1))
    println(numbers(0))

  }
}