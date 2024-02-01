package simulation_components

import game_components.Board
import simulation_components.PlayerOrder
import simulation_components.ScoreBoard
import scala.collection.mutable

object Menu {
  
    def showPlayerOrder: String = {
        return PlayerOrder.show
    }

    def advancePlayerOrder: Unit = {
        PlayerOrder.advance
    }

    //differences from gridmaster: Shows current player instead of TileTracker
    def showGameArea: String = {
        val sb = mutable.StringBuilder()
        sb ++= Board.show + "\n"
        sb ++= ScoreBoard.show + "\n"
        sb ++= PlayerOrder.current

        sb.toString
    }
}
