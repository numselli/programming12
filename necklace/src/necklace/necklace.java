package necklace;

import java.util.Scanner;

public class necklace {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first starting number:");
		int fristStart = input.nextInt();
		if (fristStart >= 0 || fristStart < 9) {
			System.out.println("First starting number must be a single digit positave number");
			return;
		}
		
		System.out.println("Enter the second starting number");
		int secondStart = input.nextInt();
		if (secondStart >= 0 || secondStart < 9) {
			System.out.println("Second starting number must be a single digit positave number");
			return;
		}
		
		System.out.println(makeNecklace(fristStart, secondStart));
	}
	
	public static String makeNecklace(int fristStart, int secondStart) {
		String outString = String.format("%s %s ", fristStart, secondStart);
		
		int tempNumber;
		int secondStopNumber = secondStart;
		int firstStopNumber = fristStart;
		
		do {
			tempNumber = (fristStart + secondStart) % 10;
			outString += tempNumber + " ";
			
			fristStart = secondStart;
			secondStart = tempNumber;
		
		} while (fristStart != firstStopNumber || secondStart != secondStopNumber);
	
		return outString;
	}
}
