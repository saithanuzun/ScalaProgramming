

object UseCounter {
  def main(args: Array[String]): Unit = {
    println(Counter.getValue())
    Counter.incr()
    Counter.incr()
    println(Counter.getValue())
    Counter.incr(5)
    println(Counter.getValue())
    Counter.setValue(10)
    println(Counter.getValue())
    Counter.reset()
    println(Counter.getValue())

  }
}