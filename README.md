# Trouble - cs403_24-2_G2
Project for Section G2, Term 24-2

This is a simulated variant of the board game "Trouble."
Trouble has 4 players. 

## Board Layout
For context, here is a "real life" example:

![Example Trouble Board from Wikapedia](https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Trouble_board.svg/330px-Trouble_board.svg.png)

*Example Trouble Board from Wikipedia*

The board in this modified simulation implementation is a 11x11 grid. See example visual from the below photo:
![Modified Trouble Board](https://i.ibb.co/TMVPdYy/IMG-3142.jpg)
* The board is an 11x11 text-based grid with multiple spaces for a player peg to go to (Note that boxes will not be color-coordinated in the text - image just provides better visualization). 
* There is a continuous **playing square** of spots for pegs to move that goes through these sections.
* Each player has 3 **"home" slots** for pegs that are in the **outermost** part on the board. Right next to the "home" slots is a **"start" slot.**
* Each player has 3 **"finish" slots** for pegs that are in the middle section of the board.
* In the very middle of the board, there section that displays a random dice roll number.

## Gameplay/rules:
* The game is played with 4 players, each with a different color peg (blue - 1, purple - 2, red - 3, green - 4).
* The **win condition** of the game is for a player to get all their pegs from the "start" section of the board to the "finish" section of the board after going around the board once (all movement is clockwise).
* Each player starts with 3 pegs in the "home" section of the board.
* The player order is blue, purple, red, green every game. 
* To get a peg out of the "home" section, a player must roll a 6 on the dice. If they do this, they can move a peg from the "home" section to the "start" section, then they can roll again and move their player the number of spaces corresponding to the number that they rolled. If they do not roll a 6, they must wait until their next turn to try again.
* The players will continue to roll the dice and move their pegs around the board until they get all their pegs to the "finish" section of the board. To enter the "finish" section of the board, a player must roll the exact number of spaces to get to a slot in the "finish" section. Once in this section, other players cannot take this peg. Further, this peg can only be moved further back in the "finish" section (if you roll a number that would allow you to move further back). Once a player gets all their pegs to the "finish" section, the game ends and that player wins.
* If a player lands on a slot that is already occupied by another player's peg, the peg that was already there is sent back to the "home" section of the board.
* If a player is inside another player's "start" section, they can be sent back to their own "home" section if the player whose "start" section they are in rolls a 6.
* If a player rolls a 6, they get to roll again or move a peg from their "home" section to their "start" section (if the start section is not already occupied by their own peg). There is no cap on the number of times a player can get a 6 in a row and thus continue to roll.
* A player cannot move to a section that is already occupied by their own peg.

## 4 possible strategies:
There are 3 strategy variables that have different weights. The different weights of these variables will result in different overall strategies. The game will treat these weights like an ordered task list, where the most weighted task will be completed first. Here are the variables:
1. prioritizing spreading out pieces as much as possible. 
    - The player will always try to keep the pegs spaced out by a quarter of the board distance. For example, with 1 peg, the player will try to move the peg 1/4 of the board distance. With 2 pegs, the player will try to move the pegs 1/4 of the board distance from each other, etc.
2. prioritizing getting pieces to the finish section as fast as possible.
    - The player will always try to get the pegs to the finish section as fast as possible. This means that the player will always try to move the peg closest to the finish section as far as possible until it reaches the finish. 
3. prioritizing sending other players' pieces back to the start section as much as possible.
    - The player will always try to send other players' pieces back to the start section as much as possible. This means that the player will always try to move a peg that is closest to another player's peg on top of that other player's peg to send it back to the start section.
4. prioritizing getting pieces out of the home section as fast as possible.
    - The player will always try to get the pegs out of the home section as fast as possible. This means that the player will always try to move the peg closest in the start slot out of the start slot and then try to bring another peg out of the home section.

1. **Strategy 1** (S1) order of priority:
1,2,3,4
2. **Strategy 2** (S2) order of priority:
2,3,4,1
3. **Strategy 3** (S3) order of priority:
3,4,1,2
4. **Strategy 4** (S4) order of priority:
4,1,2,3

## Simulation Mechanics
* A text will be displayed stating which player's turn it is.
* Tiles on the grid board will be the color of the player's peg that is occupying that tile (if there is a peg on that tile) and will be blank if there is no peg on that tile.



