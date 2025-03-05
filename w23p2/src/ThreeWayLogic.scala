// T = 1, F = 0, U = 9

object ThreeWayLogic {

  def and(a: Int, b: Int): Int = {
    var result: Int = 0

    result match {
      case t if ((a == 1) && (b == 1)) => 1
      case u if ((a == 1) && ((b != 0) && (b != 1))) => 9
      case u1 if ((b == 1) && ((a != 0) && (a != 1))) => 9
      case u2 if (((b != 0) && (b != 1)) && ((a != 0) && (a != 1))) => 9
      case _ => 0
    }
  }

  def or(c: Int, d: Int): Int = {
    var result: Int = 0
    result match {
      case f if ((c == 0) && (d == 0)) => 0
      case u if ((c == 0) && ((d != 0) && (d != 1))) => 9
      case u1 if ((d == 0) && ((c != 0) && (c != 1))) => 9
      case u2 if (((c != 0) && (c != 1)) && ((d != 0) && (d != 1))) => 9
      case _ => 1
    }
  }

  def not(e: Int): Int = {
    var result = 0

    result match {
      case t if (e == 1) => 0
      case f if (e == 0) => 1
      case _             => 9
    }
  }

  def main(args: Array[String]): Unit = {
    //AND Truth Table
    println("AND")
    println("===\n TRUE = 1, FALSE = 0, UNKNOWN = U (INPUT) & 9 (OUTPUT)")
    println("-" * 19)
    println("| a | b | a AND b |")
    println("| 1 | 1 | " + and(1, 1) + "       |")
    println("| 1 | 0 | " + and(1, 0) + "       |")
    println("| 0 | 1 | " + and(0, 1) + "       |")
    println("| 0 | 0 | " + and(0, 0) + "       |")
    println("| 1 | U | " + and(1, 9) + "       |")
    println("| 0 | U | " + and(0, 9) + "       |")
    println("| U | 1 | " + and(9, 1) + "       |")
    println("| U | 0 | " + and(9, 0) + "       |")
    println("| U | U | " + and(9, 9) + "       |")
    println("-" * 19)
    println()
    println()
    //OR Truth Table
    println("OR")
    println("===\n TRUE = 1, FALSE = 0, UNKNOWN = U (INPUT) & 9 (OUTPUT)")
    println("-" * 18)
    println("| a | b | a OR b |")
    println("| 1 | 1 | " + or(1, 1) + "      |")
    println("| 1 | 0 | " + or(1, 0) + "      |")
    println("| 0 | 1 | " + or(0, 1) + "      |")
    println("| 0 | 0 | " + or(0, 0) + "      |")
    println("| 1 | U | " + or(1, 9) + "      |")
    println("| 0 | U | " + or(0, 9) + "      |")
    println("| U | 1 | " + or(9, 1) + "      |")
    println("| U | 0 | " + or(9, 0) + "      |")
    println("| U | U | " + or(9, 9) + "      |")
    println("-" * 18)
    println()
    println()

    //NOT Truth Table
    println("NOT")
    println("===\n TRUE = 1, FALSE = 0, UNKNOWN = U (INPUT) & 9 (OUTPUT)")
    println("-" * 10)
    println("| a | ¬a |")
    println("| 1 | " + not(1) + "  |")
    println("| 0 | " + not(0) + "  |")
    println("| U | " + not(9) + "  |")
    println("-" * 10)
  }
}
