

object ForExpVsMapFilter {
  def main(args: Array[String]): Unit = {
    var xs = List("apple", "banana", "pear", "grape", "kiwi")
    
    //similar to flatten
    var strs = for (x <- xs; y <- x) yield y
    println(strs)
    //i.e.
    println(xs.flatten) //or
    println(xs.flatMap(x => x))
    
    //similar to flatMap
    strs = for (x <- xs; y <- x.take(3)) yield y
    println(strs)
    //i.e.
    println(xs.flatMap(x => x.take(3)))
    
   
    //similar to flatMap followed by map
    strs = for (x <- xs; y <- x.take(3)) yield y.toUpper
    println(strs)
    //i.e.
    println(xs.flatMap(x => x.take(3).map(y => y.toUpper)))
    
    
    var ys = List(List(1,2,3),List(4,5,6))
    
    var nums = for (x <- ys; y <- x) yield y
    println(nums)
    //i.e.
    println(ys.flatMap(x => x))
    
    var zs = List(1,2,3,4,5,6)
    
    nums = for (x <- zs; y <- List(x, x+1)) yield y
    println(nums)
    //i.e.
    println(zs.flatMap(x => List(x, x+1)))
  }
}