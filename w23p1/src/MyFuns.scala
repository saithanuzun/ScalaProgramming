

object MyFuns {
  
   def incr(x : Int) : Int = x + 1
  
  def decr(x : Int) : Int =  x - 1
  
  def sqr(x : Int) : Int = x * x
  
  def dbl(x : Int) : Int = x * 2
  
  def even(x: Int): Boolean = x%2==0
  
  def odd(x: Int): Boolean = x%2!=0
  
  def inv(x : Boolean) : Boolean = !x
  
  def negative(x : Int) : Boolean = x < 0
  
  def pal(x : String) : Boolean = x == x.reverse
  
  def strlen(x:String) : Int = x.length()
  
  def bracket(x: String) : String = '[' + x + ']'
  
  def main(args: Array[String]): Unit = {
    
    println("decr =  " + ((1 to 10) map decr))
    println("decr ---> decr = " + (1 to 10).map(decr).map(decr))
    
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