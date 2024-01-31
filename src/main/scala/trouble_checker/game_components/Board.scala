package game_components

import scala.collection.mutable

object Board {
  
    // create 11x11 collection of cells
    val rows = 11
    val cols = 11
    val cells = Array.ofDim[Cell](rows, cols)
    for 
        i <- 0 until rows
        j <- 0 until cols 
    do cells(i)(j) = new Cell

    def show: String = {
        val sb 
    }
}
