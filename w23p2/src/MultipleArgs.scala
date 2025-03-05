

object MultipleArgs {

  def largerOf(a: Int, b: Int): Int = if (a>b) a else b

  def smallerOf(a:Int, b:Int) : Int = if(a<b) a else b
  
  def smallerOf3(a : Int, b : Int, c : Int) : Int = smallerOf(smallerOf(a,b), c)
  
  def medianOf3(a : Int, b : Int, c : Int) : Int = List(a,b,c).sorted.tail.head

  def gcd(a: Int, b: Int): Int = {
    var x : Int  = a
    var y : Int  = b    
    while(x!=y){
      if(x<y)
        y=y-x
      else
        x=x-y
    }
    return x
  }
   
  def main(args: Array[String]): Unit = {

   for(a <- 1 to 3; b <- 1 to 3)
     println(s"Larger of $a and $b is ${largerOf(a,b)}")
     
   println("--------------------------------------------")
   
   for(a <- 1 to 3; b <- 1 to 3)
     println(s"Smaller of $a and $b is ${smallerOf(a,b)}")
     
   println("--------------------------------------------")  
   
   for(a <- 1 to 3; b <- 1 to 3; c <- 1 to 3)
     println(s"SmallerOf3 of $a and $b and $c is ${smallerOf3(a,b,c)}")
     
   println("--------------------------------------------")  
   println(s"SmallerOf3 of 1000, 500  and 100 is ${smallerOf3(1000,500,100)}")
     
   println("--------------------------------------------")  
   println(s"medianOf3 of 10, 1  and 9 is ${medianOf3(10,1,9)}")

   println("--------------------------------------------")  
   println(s"gcd of 32 and 12 is ${gcd(32,12)}")
   println(s"gcd of 36 and 12 is ${gcd(36,12)}")
   println("--------------------------------------------")
    
 }
}