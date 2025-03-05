
import scala.io.StdIn.readChar

object LettersAlternative {
  def main(args: Array[String]): Unit = {

    var vowels = List('a', 'e', 'i', 'o', 'u')

    print("Enter a Character : ")
    var myChar: Char = readChar()

    if (!myChar.isLetter)
      println("Character is non-alphabetic")
    else if (vowels.contains(myChar.toLower))
      println("VOWEL")
    else
      println("CONSONANT")

  }
}