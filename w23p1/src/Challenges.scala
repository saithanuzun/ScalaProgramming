

object Challenges {
  
  def prime(x: Long) : Boolean = 
    (x==2) || (x>1) &&
            (x%2==1) &&
            ((3 to Math.round(Math.sqrt(x)).toInt by 2) forall (x % _ != 0))
            
  //Alternative version using a loop. Does not properly handle values below 3 and even numbers
  def isPrime2(x: Long): Boolean={
    for(i<-3 to Math.sqrt(x).intValue() by 2){
      if(x % i ==0){
        return false
      }
    }
    return true
   }
 
  def perfect (x : Int) : Boolean = ((1 until x) filter(x%_ == 0)).sum == x
  
  //using a loop
  def isPerfect(x: Long): Boolean = {
     var sum:Long=0
     for(i <- 1 until x.intValue()){
       if(x%i==0)
         sum += i
     }
     return x==sum
   }
  
  def digitToWord(x: Int) : String = {
    x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case 5 => "five"
      case 6 => "six"
      case 7 => "seven"
      case 8 => "eight"
      case _ => "bad digit"
    }
  }
  
  def wordToDigit (x : String) : Int = {
    x match {
      case "Zero" => 0
      case "One" => 1
      case "Two" => 2
      case "Three" => 3
      case "Four" => 4
      case "Five" => 5 
      case "Six" => 6
      case "Seven" => 7
      case "Eight" => 8
      case "Nine" => 9 
      case _ => -1
    }
  }

  def leapYear(x : Int) : Boolean = {
     //notice the order matters
     if(x%400 == 0) 
       true
     else if(x%100 == 0) 
       false
     else if(x%4 == 0) 
       true
      else 
        false          
  }
  
  //This is an alternative version
  def leapYear2(x: Int):  Boolean = x%4==0 && (x%100!=0 || x%400==0)
  
  def main(args: Array[String]): Unit = {
    println(prime(8))
  }
}
