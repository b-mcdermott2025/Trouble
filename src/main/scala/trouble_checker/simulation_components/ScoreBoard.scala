package simulation_components

object ScoreBoard {
  
    def show = {
        val sb = new StringBuilder("Scores (Number of pegs in finish):\n")
        for p <- PlayerOrder.toArray
            do sb ++= p.getName + " = " + p.getScore + ", "
        
        sb.delete(sb.toString.length - 2, sb.toString.length)
        sb ++= "\n"
            
        sb.toString
    }
}
