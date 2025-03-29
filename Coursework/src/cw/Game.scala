package cw

/**
 * This class holds an instance of a simple game where
 * a player moves through a room and collects gems.
 * See the explanation sheet and comments in this file for details. The constructor builds an
 * instance of a game using the accepted parameters.
 *
 * @param barrier A list of coordinates (as tuples) where barriers exist. Example: The parameter List((0,0),(0,1)) puts two barrier elements in the upper left corner and the position below.
 * @param gem A list of gems, each is a position and a value (i.e. a 3 value tuple). Example: List((0,0,5)) puts a gem in the upper left corner which adds 5 to the score.
 * @param initX The initial x position of the player.
 * @param initY The initial y position of the player. If initX and initY are 0, the player starts in the upper left corner.
 */
class Game(barrier: List[(Int, Int)], gem: List[(Int, Int, Int)], initX: Int, initY: Int) {

  //the current room, a 10x10 grid, where -1=empty, 0=barrier, any positive number=gem
  private var room: Array[Array[Int]] = Array.ofDim[Int](10, 10)

  /* Please note - to align with the overall case study (see explanation sheet), the above two-dimensional array
   * should be accessed in the format room(col)(row) so room(2)(0) would retrieve the 3rd column and the 1st row (as indexing starts at zero),
   * equivalent to an (x,y) coordinate of (2,0). You may therefore visualise each inner array as representing a column of data.
   */

  //the current score, initially 0
  private var score: Int = 0
  //the current player position. As the player moves these positions update.
  private var posX: Int = initX
  private var posY: Int = initY
  //the current X and Y save position, initially -1
  private var saveX: Int = -1
  private var saveY: Int = -1

  /* This code is executed as part of the constructor. It firstly initialises all cells to -1 (i.e. empty).
   * It uses the list of barriers provided to initialise the barriers in the room array by setting given coordinates to 0.
   * It then uses the list of gems to initialise the gems in the room array by setting given coordinates to the provided number.
   */
  for (i <- 0 until 10; k <- 0 until 10) room(i)(k) = -1
  barrier.foreach(w => room(w._1)(w._2) = 0)
  gem.foreach(w => room(w._1)(w._2) = w._3)

  /**
   * Repeatedly run a sequence of commands. For example:
   *    for(i <- 1 to 5) println("Hello")
   * can be replaced by
   *    rpt(5)(println("Hello"))
   */
  def rpt(n: Int)(commands: => Unit): Unit = {
    for (i <- 1 to n) { commands }
  }

  /**
   * Utilised for GameApp.scala
   */
  def printRoom(): Unit ={
    for(k<-0 until 10){
      for(i<-0 until 10){
        if(posX==i && posY==k){
          print("p")
        }else if(saveX==i && saveY==k){
          print("s")
        }else if(room(i)(k)== 0){
          print("b")
        }else if(room(i)(k)== -1){
          print(".")
        }else{
          print(room(i)(k))
        }
      }
      println()
    }
  }

  /********************************************************************************
   * COURSEWORK STARTS HERE - COMPLETE THE DEFINITIONS OF EACH OF THE OPERATIONS
   * WE SUGGEST YOU RUN THE GameTest SUITE AFTER EVERY CHANGE YOU MAKE TO THESE
   * SO YOU CAN SEE PROGRESS AND CHECK THAT YOU'VE NOT BROKEN ANYTHING THAT USED
   * TO WORK.
   *******************************************************************************/

  /**
   * Returns the current position of the player as a tuple, in (x,y) order.
   */
  def getPlayerPos: (Int, Int) = {
    return (posX, posY);
  }

  /**
   * Returns the current score.
   */
  def getScore: Int = score;

  /**
   * Move the player one place to the left.
   * If there is a barrier or the room ends, nothing happens.
   * If there is a gem, it is collected (i.e. a call to checkGem() is made).
   * A more advanced requirement would be to call checkGems() if completed.
   */
  def moveLeft(): Unit = {

    if(posX ==0 ) return ; //check if the room ends

    if(room(posX-1)(posY) ==0) return; //check if there is a barrier

    posX = posX-1; //move happens

    checkGems()


  }

  /**
   * Move the player one place to the right.
   * If there is a barrier or the room ends, nothing happens.
   * If there is a gem, it is collected (i.e. a call to checkGem() is made).
   * A more advanced requirement would be to call checkGems() if completed.
   */
  def moveRight(): Unit = {

    if(posX ==9 ) return ; // room ends

    if(room(posX+1)(posY) ==0) return; // barrier

    posX = posX+1; //move

    checkGems()

  }

  /**
   * Move the player one place up.
   * If there is a barrier or the room ends, nothing happens.
   * If there is a gem, it is collected (i.e. a call to checkGem() is made).
   * A more advanced requirement would be to call checkGems() if completed.
   */
  def moveUp(): Unit = {

    if(posY == 0 ) return ;

    if(room(posX)(posY-1) ==0) return;

    posY=posY-1;

    checkGems()

  }

  /**
   * Move the player one place down.
   * If there is a barrier or the room ends, nothing happens.
   * If there is a gem, it is collected (i.e. a call to checkGem() is made).
   * A more advanced requirement would be to call checkGems() if completed.
   */
  def moveDown(): Unit = {

    if(posY == 9 ) return ;

    if(room(posX)(posY+1) == 0) return;

    posY = posY+1;


    checkGems()

  }

  /**
   * Move the player n places to the left. Negative numbers or 0 as a parameter cause no effect.
   * If there is a barrier or the room ends, the player stops before the barrier or end of the room.
   * Any gems are collected (i.e. a call to checkGem() is made after each move).
   * A more advanced requirement would be to call checkGems() if completed.
   */
  def moveLeft(n: Int): Unit = {
    if(n <= 0) return;

    rpt(n)(moveLeft());
  }

  /**
   * Move the player n places to the right. Negative numbers or 0 as a parameter cause no effect.
   * If there is a barrier or the room ends, the player stops before the barrier or end of the room.
   * Any gems are collected (i.e. a call to checkGem() is made after each move).
   * A more advanced requirement would be to call checkGems() if completed.
   */
  def moveRight(n: Int): Unit = {

    if(n <= 0) return;

    rpt(n)(moveRight());

  }

  /**
   * Move the player n places up. Negative numbers or 0 as a parameter cause no effect.
   * If there is a barrier or the room ends, the player stops before the barrier or end of the room.
   * Any gems are collected (i.e. a call to checkGem() is made after each move).
   * A more advanced requirement would be to call checkGems() if completed.
   */
  def moveUp(n: Int): Unit = {
    if(n <= 0) return;

    rpt(n)(moveUp());

  }

  /**
   * Move the player n places down. Negative numbers or 0 as a parameter cause no effect.
   * If there is a barrier or the room ends, the player stops before the barrier or end of the room.
   * Any gems are collected (i.e. a call to checkGem() is made after each move).
   * A more advanced requirement would be to call checkGems() if completed.
   */
  def moveDown(n: Int): Unit = {
    if(n <= 0) return;

    rpt(n)(moveDown());

  }

  /**
   * Checks if the current position is a gem. A gem exists if the cell
   * has a value larger than 0. If a gem does exist, increase the score,
   * and then erase the gem, i.e. set it to -1.
   */
  def checkGem(): Unit = {

    if(room(posX)(posY) > 0) {
      score += room(posX)(posY);
      room(posX)(posY) = -1;
      return;
    }
    else
      return;

  }

  //The methods beyond this point (aside to those in GameBuilder which is a separate task) are more complex than those above.

  /**
   * This moves the player according to a string. The string can contain the
   * letters w, a, s, d representing up, left, down, right moves. If
   * there is a barrier or the room ends, the individual move is not
   * executed. Any further moves are done. Any gems are collected and the
   * save position is evaluated.
   */
  def move(s: String): Unit = {
    s.foreach(c => {
      if (c == 'w') moveUp()
      else if (c == 'a') moveLeft()
      else if (c == 's') moveDown()
      else if (c == 'd') moveRight()
      else return;
    })
  }

  /**
   * Identifies the maximum overall score available in the game. This is the sum
   * of the current score and the possible score from collecting all of the remaining gems.
   * No gems are collected here, only the max score is returned.
   */
  def maxScore(): Int = {
    var totalScore = score

    for (x <- 0 until 10) {
      for (y <- 0 until 10) {
        if (room(x)(y) > 0) {
          totalScore += room(x)(y)
        }
      }
    }
    totalScore
  }

  /**
   * Checks if the rectangle defined by the current position and saved position
   * covers nine or more positions. If yes, it collects gems in it, increases the
   * score, and erases the gems. Also resets the saved position to -1,-1.
   */
  def checkGems(): Unit = {
    checkGem();

    if (saveX == -1 && saveY == -1) {
      if ((posX+1) * (posY+1) <= 9) {
        for (x <- 0 until posX+1; y <- 0 until posY+1) {
          if (room(x)(y) > 0) {
            score += room(x)(y)
            room(x)(y) = -1
          }
        }
        setSavePos(-1,-1);
      }
    } else if ((math.abs(posX - saveX) + 1) * (math.abs(posY - saveY) + 1) >= 9) {
      for (x <- math.min(posX,saveX) until math.max(posX,saveX)+1; y <- math.min(posY,saveY) until math.max(posY,saveY)+1) {
        if (room(x)(y) > 0) {
          score += room(x)(y)
          room(x)(y) = -1
        }
      }
      setSavePos(-1,-1);
    }

  }



  /**
   * This gives a string in the format for move, which collects all the available gems. No specific
   * requirements for the efficiency of the solution exist, but the solution must consist of a finite number
   * of steps. The move is combined of a number of moves given by suggestMove.
   * If these are not possible, an empty string is returned. No gems are collected
   * and the player must be at the original position after the execution of the method.
   */
  def suggestSolution(): String = {
    var _x = posX;
    var _y = posY;

    var result ="";

    for (x <- 0 until 10) {
      for (y <- 0 until 10) {
        if (room(x)(y) > 0) {
          result += suggestMove(x,y);
          posX=x;
          posY=y;
        }
      }
    }

    posX = _x;
    posY = _y;

    result
  }

  /**
   * This gives a string in the format for move, which moves from the current position to
   * position x,y. No specific requirements for the efficiency of the solution exist. The move
   * cannot jump barriers. The method is restricted to finding a path which is combined of a number of
   * left and then a number of up movement, or left/down, or right/up, or right/down movements only.
   * If this is not possible due to barriers, it returns an empty string. No actual move is done. If
   * x or y are outside the room, an empty string is returned as well.
   */


  def suggestMove(x: Int, y: Int): String = {
    if (x < 0 || x > 9 || y < 0 || y > 9 || room(x)(y) == 0) return ""

    var result = ""
    var _posX = posX
    var _posY = posY
    var stuck = false

    while (_posX != x && !stuck) {
      if (_posX < x && room(_posX + 1)(_posY) != 0) {
        _posX += 1
        result += 'd'
      } else if (_posX > x && room(_posX - 1)(_posY) != 0) {
        _posX -= 1
        result += 'a'
      } else {
        stuck = true
      }
    }

    while (_posY != y && !stuck) {
      if (_posY < y && room(_posX)(_posY + 1) != 0) {
        _posY += 1
        result += 's'
      } else if (_posY > y && room(_posX)(_posY - 1) != 0) {
        _posY -= 1
        result += 'w'
      } else {
        stuck = true
      }
    }

    if (stuck) {
      _posX = posX
      _posY = posY
      result = ""
      stuck = false

      while (_posY != y && !stuck) {
        if (_posY < y && room(_posX)(_posY + 1) != 0) {
          _posY += 1
          result += 's'
        } else if (_posY > y && room(_posX)(_posY - 1) != 0) {
          _posY -= 1
          result += 'w'
        } else {
          stuck = true
        }
      }

      while (_posX != x && !stuck) {
        if (_posX < x && room(_posX + 1)(_posY) != 0) {
          _posX += 1
          result += 'd'
        } else if (_posX > x && room(_posX - 1)(_posY) != 0) {
          _posX -= 1
          result += 'a'
        } else {
          stuck = true
        }
      }
    }

    if (stuck) return ""

    result
  }


  /* --- The three save methods below are used by the unit tests to simulate certain conditions --- */

  /**
   * Updates saveX and saveY to the current player position.
   */
  def save(): Unit = {
    /* This method is already implemented. You should not change it */
    saveX = posX
    saveY = posY
  }

  /**
   * Returns the current save position as a tuple, in (x,y) order.
   */
  def getSavePos: (Int, Int) = {
    /* This method is already implemented. You should not change it */
    return (saveX, saveY);
  }

  /**
   * Sets the savePos to the values of the parameters.
   */
  def setSavePos(saveX: Int, saveY: Int): Unit = {
    /* This method is already implemented. You should not change it */
    this.saveX = saveX
    this.saveY = saveY
  }

}

/**
 * This object builds and returns a standard instance of Game.
 * It is used by the unit tests to initialise the game in different states.
 * Currently, there are three ways in which a game can be initialised,
 * the first has been completed but the other two initialisation methods need writing.
 */
object GameBuilder {

  /**
   * @return A game with
   * - barriers in positions 3,0 3,1 and 3,2
   * - a gem at 4,1 which increases the score by 1
   * - a gem at 3,3 which increases the score by 2
   * - the player starting in position 0,0
   */
  def initialiseGame1(): Game = {
    /* This method is already implemented. You should not change it */
    return new Game(List((3, 0), (3, 1), (3, 2)), List((4, 1, 1), (3, 3, 2)), 0, 0)
  }

  /**
   * @return A game with
   * - barriers in positions 3,3 3,4 3,5 5,3 5,4 and 5,5
   * - a gem at 4,4 which increases the score by 3
   * - a gem at 6,3 which increases the score by 3
   * - the player starting in position 3,2
   */
  def initialiseGame2(): Game = {
    return new Game(List((3, 3), (3, 4), (3, 5),(5,3),(5,4),(5,5)), List((4, 4, 3), (6, 3, 3)), 3, 2)
  }

  /**
   * @return A game with
   * - barriers in positions 3,0 3,1 and 3,2
   * - a gem at 4,1 which increases the score by 4
   * - a gem at 3,3 which increases the score by 5
   * - the player starting in position 4,1
   */
  def initialiseGame3(): Game = {
    return new Game(List((3, 0), (3, 1), (3, 2)), List((4, 1, 4), (3, 3, 5)), 4, 1)
  }
}
