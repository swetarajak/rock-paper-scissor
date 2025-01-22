# Rock-Paper-Scissors Game

This project is a console-based implementation of the classic "Rock-Paper-Scissors" game. Players take turns choosing their moves, and the game determines the winner based on the standard rules of Rock-Paper Scissors.

## Features
- Allows two players to play against each other.
- Randomized arrangement of the choices (Rock, Paper, Scissors).
- Tracks the scores for each player over multiple rounds.
- Declares a winner based on the final scores or announces a tie.

## Prerequisites
1. **Java Development Kit (JDK):**  
   Ensure you have JDK 8 or higher installed. Verify it using:
   ```bash
   java -version
   javac -version
2. **Text Editor or IDE:** <br>
   Use any text editor (e.g., Notepad++, VS Code) or IDE (e.g., IntelliJ IDEA, Eclipse) to edit    and compile the code.
3. **Command-Line Interface:** <br>
   Use the terminal (Linux/Mac) or Command Prompt/PowerShell (Windows) to compile and run the    program.

## How to Run
1. **Set Up the Project** <br>
   Copy the code into a file named Stone.java
   Ensure the package declaration matches the directory structure. For example
   Assgn_game/Stone.java
2. **Compile the Code** <br>
   Navigate to the directory containing the Stone.java file and run:
   javac -d . Stone.java
   This will create a directory Assgn_game with the compiled Stone.class file inside it.
3. **Run the Program** <br>
   Run the program using the fully qualified class name:
   java Assgn_game.Stone
## How to Play
1. The game prompts each player to enter their name. <br>
2. It displays the available choices: Rock, Paper, and Scissors. <br>
3. Players take turns choosing a number corresponding to their move: <br>
  - 0 for Rock <br>
  - 1 for Paper <br>
  - 2 for Scissors
4. The program compares the choices and awards points based on the rules: <br>
  - The rock smashes scissors <br>
  - Paper wraps rock <br>
  - Scissors cut paper <br>
5. The game runs for 10 rounds; scores are displayed after each round. <br>
6. At the end of 10 rounds, the program announces the winner or a tie. <br>
