

object UsingArrays3 {
  def main(args: Array[String]): Unit = {
    var numbers = new Array[Int](5)
    numbers(0) = 11
    numbers(1) = 21
    numbers(2) = 3
    numbers(3) = 4
    numbers(4) = 16

    println("The Numbers in your array are:")
    var index: Int = 0
    while (index != numbers.length) {
      println(numbers(index))
      index += 1;
    }

  }
}