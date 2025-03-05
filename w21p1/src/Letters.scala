import scala.io.StdIn.readChar

object Letters {

  def main(args: Array[String]): Unit = {

    print("Enter a Character ")
    var myChar = readChar().toLower

    if (myChar >= 'a' && myChar <= 'z') {
      if (myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u') {
        println(" Character '" + myChar + "' is a VOWEL")
      } else {
        println(" Character '" + myChar + "' is a CONSONANT")
      }
    } else {
      println(" Character '" + myChar + "' is non-alphabetic")
    }

  }
}