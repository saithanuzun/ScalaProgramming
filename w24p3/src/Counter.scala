

object Counter {
  private var value: Int = 0
  
  def incr(): Unit={
    value+=1
  }

  def getValue(): Int = {
    return value
  }

  def incr(n: Int): Unit = {
    //two alternatives here
    //for (i <- 1 to n) incr()
    value+=n
  }
  
  def setValue(newValue: Int): Unit = {
    value=newValue
  }
      
  def reset(): Unit = {
    value=0
  }
}