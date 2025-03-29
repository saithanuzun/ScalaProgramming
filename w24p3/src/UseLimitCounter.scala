

object UseLimitCounter {
  
  def main(args: Array[String]): Unit = {
    
    LimitCounter.setLowerLimit(5)
    LimitCounter.setUpperLimit(10)
    println(LimitCounter.getLowerLimit)
    println(LimitCounter.getUpperLimit)
    println(LimitCounter.getValue)
    LimitCounter.inc()
    LimitCounter.inc()
    println(LimitCounter.getValue)
    LimitCounter.dec()
    println(LimitCounter.getValue)
    LimitCounter.dec()
    LimitCounter.dec()
    println(LimitCounter.getValue)
    LimitCounter.inc()
    println(LimitCounter.getValue)
    println("")
    
    LimitCounter.reset(4, 12)
    println(LimitCounter.getLowerLimit)
    println(LimitCounter.getUpperLimit)
    println(LimitCounter.getValue)
    println("")
    
    LimitCounter.setLowerLimit(5)
    LimitCounter.setUpperLimit(15)
    println(LimitCounter.getLowerLimit)
    println(LimitCounter.getUpperLimit)
    println(LimitCounter.getValue) 
    println(LimitCounter.isAtUpperLimit)
    println(LimitCounter.isAtLowerLimit)
    println("")
    
    LimitCounter.setToUpperLimit()
    println(LimitCounter.getValue)
    println(LimitCounter.isAtUpperLimit)
    println("")
    
    LimitCounter.setToLowerLimit()
    println(LimitCounter.getValue)
    println(LimitCounter.isAtUpperLimit)
    println("")
    
    LimitCounter.setValue(20)
    LimitCounter.setValue(10)
    println(LimitCounter.getValue)
  }
}