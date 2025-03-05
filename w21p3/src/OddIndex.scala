

object OddIndex {
  def main(args: Array[String]): Unit = {
     var nums = Array(5.5,2.0,3.1,4.4,0.5,0.1,7.22,8.1,9.1,10.3)
   
     var i = 9
     while (i >= 1) {
       println("Index: " + i + " ; Value: " + nums(i))
       i -=2
     }
  }
}