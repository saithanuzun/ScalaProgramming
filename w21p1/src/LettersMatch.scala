import scala.io.StdIn.readChar

object LettersMatch {

  def main(args: Array[String]): Unit = {

    print("Enter a Character ")
    var myChar = readChar().toLower

    var message: String = ""

    if (myChar >= 'a' && myChar <= 'z')
      message = myChar match {
        case 'a' | 'e' | 'i' | 'o' | 'u' => "Character '" + myChar + "' is VOWEL"
        case _                           => "Character '" + myChar + "' is CONSONANT"
      }
    else
      message = "Character '" + myChar + "' is non-alphabetic"

    println(message)
  }
}