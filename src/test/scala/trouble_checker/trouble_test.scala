package trouble_checker

/*import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._
class Password_Test extends AnyFunSpec with Matchers {
    describe("A password checker") {
        describe("determines proper length") {
            it("rejects passwords that are less than 6 characters") {
                val tooShort = "abcde"
                val longEnough = "abcdef"
                val evenLonger = "abcdefghi"
                Password.isValid(tooShort) shouldBe false
                Password.isValid(longEnough) shouldBe true
                Password.isValid(evenLonger) shouldBe true
            }
        }
    }
}

package menu_commands*/

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class trouble_test extends AnyFunSpec with Matchers {
    describe("The Trouble Simulation") {
        describe("has a menu") {

            //******* SHOW PLAYER ORDER *******
            it("can show the player order") {     
                val expectedResult = "Blue, Purple, Red, Green"
                Password.showPlayerOrder should be(expectedResult)  
            }

            //******* ADVANCE ORDER *******
            it("can advance the player order") {     
                val expectedResult = "Purple, Red, Green, Blue"
                Password.advancePlayerOrder should be(expectedResult)  
            }
            //******* SHOW GAME AREA *******
            it("can show the game area, including the 20 x 20 board, player scores, and tiles in each player's hand") {

                val expectedResult = 
                    "Board:\n" +
                    "            [ ][ ][ ]            \n" +
                    "   [ ][ ][ ][ ][ ][ ][ ][ ][ ]   \n" +
                    "   [ ]         [ ]         [ ]   \n" +
                    "   [ ]         [ ]         [ ]   \n" +
                    "[ ][ ]         [ ]         [ ][ ]\n" +
                    "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
                    "[ ][ ]         [ ]         [ ][ ]\n" +
                    "   [ ]         [ ]         [ ]   \n" +
                    "   [ ]         [ ]         [ ]   \n" +
                    "   [ ][ ][ ][ ][ ][ ][ ][ ][ ]   \n" +
                    "            [ ][ ][ ]            \n" +
                    "\n" +
                    "Scores (Number of pegs in finish):\n" +
                    "Blue = 0, Purple = 0, Red = 0, Green = 0\n" +
                    "\n" +
                    "Current player: Blue\n"

                Password.showGameArea should be(expectedResult)
            }
        }
    }
}
        
