package computerGuessingGame;

import java.util.Scanner;

public class computerGuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the highest possible number");
		int maxRandNumber = input.nextInt();
		if (maxRandNumber <= 0 ) {
			System.out.println("Highest number must be higher than 0");
			System.exit(1);
		}
		
		System.out.println("Think of a number and enter 1 to continue");
		int userReady = input.nextInt();
		if (userReady != 1) System.exit(1);
		
		int guesses = 1;
		boolean correctGuess = false;
		int leastRandNumber = 1;
		
		while (!correctGuess) {
			int halfNum = (leastRandNumber+maxRandNumber)/2;

			System.out.printf("Is your number %d?\n1) correct\n2) too high\n3) too low\n\n", halfNum);
			int userNuminput = input.nextInt();
			
			switch (userNuminput) { 
				case 1:
					System.out.printf("That's correct right!\nComputer guessed in %d tries", guesses);
					return;

				case 2:
					maxRandNumber = halfNum-1;
					guesses++;
				break;
				case 3:
					leastRandNumber = halfNum+1;
					guesses++;
				break;
			}	
		}	
	}
}