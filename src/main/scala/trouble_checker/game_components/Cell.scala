package game_components

//*******Cell*******
class Cell {
    private var color = ""
    private var tyype = "none"
    def getColor: String = {
      this.color
    }
    def getTyype: String = {
      this.tyype
    }
    def placeToken(token: String) = {
      this.color = token
    }
  
    def removeToken = {
      this.color = " "
    }

    def setType(newTyype: String)= {
      this.tyype = newTyype
    }

    def show = {
      if tyype == "none" then
        "   "
      else "[" + color + "]"
    }
}
