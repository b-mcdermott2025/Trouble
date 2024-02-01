package game_components

import scala.collection.mutable

object Board {
  
    // create 11x11 collection of cells
    val rows = 11
    val cols = 11
    val cells = Array.ofDim[Cell](rows, cols)
    val template = Array(Array(" ", " ", " ", " ", "[ ]", "[ ]", "[ ]", " ", " ", " ", " "), Array(" ", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", " "), Array(" ", "[ ]", " ", " ", " ", "[ ]", " ", " ", " ", "[ ]", " "), Array(" ", "[ ]", " ", " ", " ", "[ ]", " ", " ", " ", "[ ]", " "), Array("[ ]", "[ ]", " ", " ", " ", "[ ]", " ", " ", " ", "[ ]", "[ ]"), Array("[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"), Array("[ ]", "[ ]", " ", " ", " ", "[ ]", " ", " ", " ", "[ ]", "[ ]"), Array(" ", "[ ]", " ", " ", " ", "[ ]", " ", " ", " ", "[ ]", " "), Array(" ", "[ ]", " ", " ", " ", "[ ]", " ", " ", " ", "[ ]", " "), Array(" ", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", " "), Array(" ", " ", " ", " ", "[ ]", "[ ]", "[ ]", " ", " ", " ", " "))
    for 
        i <- 0 until rows
        j <- 0 until cols 
    do
        if template(i)(j) == " " then
            cells(i)(j) = new Cell
        else if template(i)(j) == "[ ]" then
            cells(i)(j) = new Cell
            cells(i)(j).placeToken(" ")
            cells(i)(j).setType("empty")
            
    def show: String = {
        val sb = new mutable.StringBuilder("Board:\n")
        for i <- 0 until rows do {
            for j <- 0 until cols do sb ++= cells(i)(j).show
            sb ++= "\n"
        }
        sb.toString
    }
}
