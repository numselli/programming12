import java.io.Console;
import java.util.Arrays; 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // create input
        Scanner input = new Scanner(System.in);

        // init gameboard with
        String[][] gameBoard = new String[3][3];  
        for (String[] row : gameBoard) {
            Arrays.fill(row, " "); 
        }

        boolean currentPlayer = true;

        displayGameBoard(gameBoard);

        String gameWinnder = " ";

        while(gameWinnder.equalsIgnoreCase(" ")){
            // tell the user whos turn and how to play
            System.out.printf("%s's turn\n", currentPlayer?"player 1" : "player 2");

            // wait for valid user input
            int choice = waitForValidInput(input, gameBoard);

            gameBoard[choice/3][choice%3] = currentPlayer ? "X" : "O";

            displayGameBoard(gameBoard);
            
            gameWinnder = getGameWinnder(gameBoard);
            System.out.printf("%s won the game as %s\n", currentPlayer?"player 1" : "player 2", gameWinnder);

            currentPlayer = !currentPlayer;
        }
    }

    public static int waitForValidInput (Scanner input, String[][] gameBoard){
        while (true){
            System.out.println("pick a place\nenter a number from 1-9\n1 top left, 9 bottom right");
            int choice = input.nextInt();
            
            if (choice>(3*3) || 0>=choice || !gameBoard[(choice-1)/3][(choice-1)%3].equalsIgnoreCase(" ")){
                System.out.println("not a valid move");
            }else {
                return choice-1;
            }
        }
    }

    public static String getGameWinnder(String[][] gameBoard){
        // int columnWinerStreak = 0;
        
        for (int rowNum = 0;  rowNum<gameBoard.length; rowNum++){
            String rowWiner = gameBoard[rowNum][0];
            int rowWinerStreak = 0;
            
            for (int cellNum = 0; cellNum<gameBoard[rowNum].length; cellNum++){
                String columnsWiner = gameBoard[0][cellNum];
                
                System.out.println(columnsWiner);
                if (rowWiner.equalsIgnoreCase(gameBoard[rowNum][cellNum])){
                    rowWinerStreak++;
                }
                
                // if (columnsWiner.equalsIgnoreCase(gameBoard[cellNum][rowNum])){
                //     columnWinerStreak++;
                //     // System.out.println("ppp");
                // }

                // columnsWiner = gameBoard[0][cellNum];
            }
    
            if (rowWinerStreak == 3
            // || columnWinerStreak == 3
            ) return rowWiner; 
        }

        return " ";
    }

    public static void displayGameBoard(String[][] gameBoard){
        for (int rowNum = 0;  rowNum<gameBoard.length; rowNum++){
            for (int cellNum = 0; cellNum<gameBoard[rowNum].length; cellNum++){
                System.out.printf(" %s %s", gameBoard[rowNum][cellNum], cellNum==2 ? "" : "|");
            }

            if (rowNum!=2) System.out.printf("\n--- --- ---\n");
        }

        System.out.println();
    }
}

// Steps  
// Check columns for winner 
// Check diagonals for winner 