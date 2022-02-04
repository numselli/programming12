package guessTheNumber;

import java.util.Scanner;

public class guessTheNumber {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
				
		System.out.println("Welcome to the guessing game!\nEnter the minimum number to guess");
		int min = input.nextInt();
		
		System.out.println("Enter the maximum number to guess");
		int max = input.nextInt();
		
		System.out.printf("Can you guess my number? It's between %d and %d.\n", min, max);
		int randomNumber = (int) (Math.random() * (max - min + 1) + min);
				
		gameLoop(input, randomNumber);
	}
	
	public static void gameLoop(Scanner input, int randomNumber) {
		int guessNum = 1;
		
		Boolean gameWon = gameLogic(input, randomNumber, guessNum);

		while (!gameWon) {
			guessNum++;
			gameWon = gameLogic(input, randomNumber, guessNum);
		}
	}
	
	public static Boolean gameLogic(Scanner input, int randomNumber, int guessNum) {		
		int guessInputNum = takeGuess(input, guessNum);
		
		System.out.println(highLow(guessInputNum, randomNumber));
		
		if (guessInputNum == randomNumber) System.out.printf("It took you %d guesses.\nGood-bye.", guessNum);
		return guessInputNum == randomNumber;
	}
	
	public static int takeGuess(Scanner input, int guessNum) { 
		System.out.printf("Enter guess #%d\n", guessNum);
		return input.nextInt();
	}
	
	public static String highLow(int guessInputNum, int randomNumber) {
		if (guessInputNum > randomNumber) return "You guessed too high.";
		if (guessInputNum < randomNumber) return "You guessed too low.";
		return "You got it.";
	}
}