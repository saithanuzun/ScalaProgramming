
import scala.io.StdIn.readChar

object LettersMatchWhile {
  def main(args: Array[String]): Unit = {

    var choice = ' '

    while {

      println("Type in a character (! to stop) ")
      choice = readChar()

      if (choice.isLetter) {

        var x = choice.toLower match {
          case 'a' | 'e' | 'i' | 'o' | 'u' => "Vowel"
          case _                           => "Consonant"
        }

        println("Your letter is a " + x)

      } else {
        println("Non-alphabetical character")
      }

      (choice != '!')
    } do ()

    println("Program terminating...")

  }
}