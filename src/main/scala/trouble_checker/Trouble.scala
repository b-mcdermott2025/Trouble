package trouble_checker

import simulation_components.PlayerOrder
import simulation_components.Menu
object Password {
    def isValid(password : String) = false
    def showPlayerOrder = PlayerOrder.show
    def advancePlayerOrder = 
        PlayerOrder.advance
        PlayerOrder.show
    def showGameArea = 
        Menu.showGameArea
}