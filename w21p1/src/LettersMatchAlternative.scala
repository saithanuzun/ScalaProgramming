
import scala.io.StdIn.readChar

object LettersMatchAlternative {
  def main(args: Array[String]): Unit = {

    var vowel: List[Char] = List('a', 'e', 'i', 'o', 'u')

    print("Enter a Character ")
    var myChar = readChar()

    var message: String = ""

    if (myChar.isLetter)
      message = vowel.contains(myChar.toLower) match {
        case true => "Character '" + myChar + "' is VOWEL"
        case _    => "Character '" + myChar + "' is CONSONANT"
      }
    else
      message = "Character '" + myChar + "' is non-alphabetic"

    println(message)
  }
}