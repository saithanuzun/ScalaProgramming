import scala.io.StdIn.readChar

object LettersMatchAlternative2 {
  def main(args: Array[String]): Unit = {

    var vowel: List[Char] = List('a', 'e', 'i', 'o', 'u')

    print("Enter a Character ")
    var myChar = readChar()

    var message = myChar.isLetter match {
      case true => vowel.contains(myChar.toLower) match {
        case true => "Character '" + myChar + "' is VOWEL"
        case _    => "Character '" + myChar + "' is CONSONANT"
      }
      case _ => "Character '" + myChar + "' is non-alphabetic"
    }

    println(message)
  }
}