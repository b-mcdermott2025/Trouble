package game_components

//*******Cell*******
class Cell {
    var color = ""
    var tyype = "none"
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
