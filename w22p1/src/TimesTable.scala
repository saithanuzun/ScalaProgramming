

import scala.io.StdIn.readInt

object TimesTable {
  def main(args: Array[String]): Unit = {

    val sentence = "Hello WORLD"
    val result = for (x <- sentence if !x.isUpper) yield {
      if (x.isLower) x else '!'
    }
    println(result)

  }
    

}