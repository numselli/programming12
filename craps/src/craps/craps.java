package craps;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class craps {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		startGame(input);
	}
	
	public static void startGame (Scanner input) {
		int rollNum = 1;
		int point = 0;
		int wins = 0;
					
		Boolean gameWon = false;
		while (!gameWon) {
			int rolledDice = rollDice();

			gameWon = gameLogic(rollNum, rolledDice, point, input);
			if (gameWon) {
				wins++;
				
				System.out.printf("You won. 1Want to roll again?\n1) yes\n2) no\n", wins);
				point=rolledDice;
				
				int inputChoice = input.nextInt();
				if (inputChoice == 1) gameWon = false;
				else System.exit(0);
				
			} else {
				System.out.println("you lose");	
				playAgain(input);
			}
			
			rollNum++;
		}
	}
	
	public static Boolean gameLogic(int rollNum, int rolledDice, int point, Scanner input) {
		if (rollNum == 1) {
			if (rolledDice == 7 || rolledDice == 11) {
				System.out.println("you won on the first roll");
				playAgain(input);
				return true;
			}
			
			Integer[] craps = new Integer[] {2, 3, 12};
			if (Arrays.asList(craps).contains(rolledDice)) return false;
			
		} else {
			if (rolledDice == 7) return false;
			if (rolledDice == point) return true;
		}
		
		Integer[] win = new Integer[] {4, 5, 6, 8, 9, 10};
		if (Arrays.asList(win).contains(rolledDice)) {
			System.out.println("you win the point");
			return true;				
		}
				
		return false;
	}
	
	public static void playAgain(Scanner input) {
		System.out.println("Would like to play again.\n1) Yes\n2) No");
		int inputChoice = input.nextInt();
		if (inputChoice == 1) startGame(input);
		else System.exit(0);
	}
	
	public static int rollDice() { 
		Random randObj = new Random();

		int diceOne = randObj.nextInt(6-1+1)+1;
		int diceTwo = randObj.nextInt(6-1+1)+1;
		int diceSum = diceOne + diceTwo;

		wait(500);
        System.out.printf("dice one: %d\n", diceOne);
		
        wait(500);
        System.out.printf("dice two: %d\n", diceTwo);

		wait(500);
        System.out.printf("sum: %d\n", diceSum);
        
        return diceSum;
	}
	
	public static void wait(int ms){
	    try{
	        Thread.sleep(ms);
	    } catch(InterruptedException ex){
	        Thread.currentThread().interrupt();
	    }
	}
}