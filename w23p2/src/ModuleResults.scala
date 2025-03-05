import scala.io.StdIn.readInt

object ModuleResults {
  
  
  def getResult( examMark : Int, courseWorkMark : Int) : String = {
    
    if(examMark < 0 || examMark > 100 || courseWorkMark < 0 || courseWorkMark > 100)   "invalid inputs"
    else if((examMark + courseWorkMark)/2  >= 40) "passed"
    else if(examMark < 40 && courseWorkMark  < 40) "resit module"
    else if(examMark < 40) "resit exam"
    else "resit course work"
  }
  
  def main(args: Array[String]): Unit = {
    
    print("Please Enter exam Mark (%) : ")
    var examMark : Int = readInt()
    
    print("Please Enter Course Work  Mark (%) : ")
    var courseWorkMark : Int = readInt()
    
    println(getResult(examMark,courseWorkMark))
    
  }

}