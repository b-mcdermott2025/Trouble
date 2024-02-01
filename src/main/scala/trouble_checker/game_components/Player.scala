package game_components

class Player(val name: String) {
  var score = 0
  def getName: String = {
    name
  }
  def getScore: Int = {
    score
  }
  def setScore(newScore: Int) = {
    score = newScore
  }

}
