import scala.io.StdIn.readInt

object ModuleMark {
  def main(args: Array[String]): Unit = {

    print("Enter Course Work Mark : ")
    var courseworkMark = readInt()

    print("Enter Examination Mark : ")
    var examinationMark = readInt()

    var overallMark: Double = Math.round((courseworkMark + examinationMark) / 2.0)
    var finalResult = ""

    if (overallMark >= 40)
      finalResult = "Pass"
    else {
      finalResult = "Fail \n"
      if (courseworkMark < 40)
        finalResult += "Resit Coursework \n"
      if (examinationMark < 40)
        finalResult += "Resit Examination \n"
    }

    println("Final Result is  " + finalResult)

  }
}