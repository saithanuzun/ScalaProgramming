import scala.io.StdIn
object TicTacToe {
  
    import Array._
    
    class Player
    case object O extends Player
    case object X extends Player

    //those three attributes define the state of the game
    private var grid: Array[Array[Option[Player]]] = ofDim[Option[Player]](3,3)
    var player: Player = _
    var turn: Int = 1
    
    def optPlayerToChar(p: Option[Player]): Char = p match {
      case None    => ' '
      case Some(O) => 'O'
      case Some(X) => 'X'
    }
 
    /**
     * Reset the grid to an initial state.  All the cells are blank.
     * Player X always starts the game
     */
    def reset(): Unit = {
      player = X
      turn = 1
      for (i <- 0 to 2; j <- 0 to 2)
        grid(i)(j) = None
    }
    
    def showGrid(): Unit = {
      println()
      for(j <- 0 to 2) {
          print("  "  + optPlayerToChar(grid(0)(j)))
          print(" | " + optPlayerToChar(grid(1)(j)))
          print(" | " + optPlayerToChar(grid(2)(j)))
          println()
          if (j<2) println(" --- --- --- ")
      }
      println()
    }
    
    def winner(p: Player): Boolean = {
      for(x <- 0 to 2){
        var result=0
        var result2=0
        for(y <- 0 to 2){
          //Notice two different ways here
          if(grid(x)(y)!=None && grid(x)(y).get==p)
            result+=1
          if(grid(y)(x)==Some(p))
            result2+=1
        }
        if(result==3 || result2==3)
          return true
      }
      if(grid(0)(0)==Some(p) && grid(1)(1)==Some(p) && grid(2)(2)==Some(p)){
        return true
      }
      if(grid(0)(2)==Some(p) && grid(1)(1)==Some(p) && grid(2)(0)==Some(p)){
        return true
      }
      return false
    }
    
    def inputMove(): Unit = {
      var x: Int=0
      var y: Int=0
      while {
        println("Enter x")
        x = StdIn.readInt() - 1
        println("Enter y")
        y = StdIn.readInt() - 1
        (x < 0 || x > 2 || y < 0 || y > 2 || grid(x)(y) != None) //we also want to avoid overwriting a cell
      } do()
      grid(x)(y)=Some(player)
      if(player==X)
        player=O
      else
        player=X
    }
    
    //Notice main method is within TicTacToe object - could be separate
    def main(args: Array[String]): Unit = {
      TicTacToe.reset()
      while(TicTacToe.turn < 9 && !TicTacToe.winner(X) && !TicTacToe.winner(O)) {
        println(s"It is ${TicTacToe.optPlayerToChar(Some(player))}'s turn")
        TicTacToe.showGrid()
        TicTacToe.inputMove()
      }
      TicTacToe.showGrid()
      if (TicTacToe.winner(X))
        println(s"${TicTacToe.optPlayerToChar(Some(X))} won")
      else if (TicTacToe.winner(O))
        println(s"${TicTacToe.optPlayerToChar(Some(O))} won")
      else
        println("It's a draw")
    }
  
  }