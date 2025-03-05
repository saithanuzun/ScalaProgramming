

object FlatMap {
  def main(args: Array[String]): Unit = {
    var xs = List("apple","pear","banana", "kiwi")
    
    //similar to flatten
    var chars = for (x <- xs; y <- x) yield y
    println(chars)
    
    //similar to flatMap
    chars = for (x <- xs; y <- x.take(3)) yield y
    println(chars)
    
   
    //similar to flatMap followed by map
    chars = for (x <- xs; y <- x.take(3)) yield y.toUpper
    println(chars)
    
    
    //EXTENSION
    var ys: List[List[Int]] = List(List(1,2,3),List(4,5,6))
    
    //flatten
    var nums: List[Int] = for (x <- ys; y <- x) yield y
    println(nums)
    
    //flatMap
    nums = for (x <- ys; y <- x.drop(1)) yield y
    println(nums)
    

  }
}