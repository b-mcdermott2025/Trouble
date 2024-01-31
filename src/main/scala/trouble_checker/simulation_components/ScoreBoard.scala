package simulation_components

object ScoreBoard {
  
    def show = {
        val sb = new StringBuilder("Scores (Number of pegs in finish):\n")
        for p <- PlayerOrder.toArray
            do sb ++= p.name + " = " + p.score + ", "
        
            sb.delete(sb.toString.length - 2, sb.toString.length)
            sb ++= "\n"

            if PlayerOrder.current.score == 4
                then sb ++= PlayerOrder.current.name + " Wins!\n"
            
            sb.toString
    }
}
