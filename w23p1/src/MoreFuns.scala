

object MoreFuns {
  
  val incr : Int => Int = x => x + 1
  
  val decr : Int => Int = x => x - 1
    
  val sqr :  Int => Int = x => x * x
  
  val dbl :  Int => Int = x => x * 2
  
  val even : Int => Boolean = x => x%2==0
  
  val odd : Int => Boolean = x => x%2!=0
  
  val inv : Boolean => Boolean = x => !x
  
  val negative : Int => Boolean = x => x < 0
  
  val pal : String => Boolean = x => x == x.reverse
  
  val strlen : String => Int = x => x.length()
  
  val bracket : String => String = x => '[' + x + ']'
  
  def main(args: Array[String]): Unit = {
     
    println("........  The increment function ..........")
    println((1 to 10) map incr) 
    
    println("........  The decrement function ..........")
    println("decr =  " + ((1 to 10) map decr))
    println("decr ---> decr = " + (1 to 10).map(decr).map(decr))
    
    println("........  The sqr function ..........")
    println("Sqr = " +  ((1 to 10) map sqr))
    println((1 to 10) map sqr map sqr)
    println((1 to 10) map sqr map incr)
    
    println((1 to 10) map dbl)
    println((1 to 10) map incr map dbl)
    println((1 to 10) map dbl map incr)
    println((1 to 10) map sqr map incr map dbl)
       
    
    println("........ even function ..........")
    println((1 to 10) map(x=>x))
    println((1 to 10) map even)
    println((1 to 10) filter even)
    println((1 to 10) filter even map sqr)
    
    println("........ odd function ..........")
    println((1 to 10) map(x=>x))
    println((1 to 10) map odd)
    println((1 to 10) filter odd)
    println((1 to 10) filter odd map sqr)
    
    println("........  inverse  function ..........")
    println(List(false,true,false) map inv)
    
     println("........  negative  function ..........")
     println(List(-2,3,-10,4,5) map negative)
          
     println("........  palindrome  function ..........")
     println( List("pop", "foo", "bar", "pip") filter pal)
     
     println("........  String length function ..........")
     println("The length of word Today is " + strlen("Today"))
     println( List("Scala", "Java", "C Language") map strlen)
     
     println("........  The bracket function ..........")
     println(bracket("Scala"))
     println( List("Scala", "Java", "C Language") map bracket)
     
    
  }

}