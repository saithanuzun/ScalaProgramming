import scala.io.StdIn._

object ListMenu {
  def main(args: Array[String]): Unit = {
    println("Enter start value of list ")
    var start = readInt()

    print("Enter end value of list (exclusive) ")
    var end = readInt()

    var xs = List.range(start, end)

    var cmd = ""

    while {
      println("\nMenu\n====")
      println("Take: take from list")
      println("TakeR: take from right of list")
      println("Drop: drop from list")
      println("DropR: drop from right of list")
      println("End: exit program")

      cmd = readLine()

      var amount: Int = 0

      if (cmd == "Take") {
        println("Please provide an amount")
        amount = readInt()

        println("Take " + amount + " provides " + xs.take(amount))

      } else if (cmd == "TakeR") {
        println("Please provide an amount")
        amount = readInt()

        println("Take Right " + amount + " provides " + xs.takeRight(amount))

      } else if (cmd == "Drop") {
        println("Please provide an amount")
        amount = readInt()

        println("Drop " + amount + " provides " + xs.drop(amount))
      } else if (cmd == "DropR") {
        println("Please provide an amount")
        amount = readInt()

        println("Drop Right " + amount + " provides " + xs.dropRight(amount))
      }

      (cmd != "End")
    } do ()

    println("Exiting program...")
  }
}