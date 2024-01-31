package simulation_components

import game_components.Player

object PlayerOrder extends scala.collection.mutable.Queue[Player]{

  this += new Player("Blue")
  this += new Player("Purple")
  this += new Player("Red")
  this += new Player("Green")

  def advance: Unit = {
    this += this.dequeue
  }

  def show: String = {
    val sb = new StringBuilder("")
    for p <- this.toArray yield sb ++= p.name + ", "
    sb.toString.substring(0, sb.toString.length - 2)
  }

  def current: Player = {
    return this.head
  }
}
