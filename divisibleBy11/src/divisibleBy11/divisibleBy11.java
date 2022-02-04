package divisibleBy11;

import java.util.Scanner;

public class divisibleBy11 {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		
		askForInputNum(input);
	}
	
	public static void askForInputNum(Scanner input) { 
		System.out.println("Input a positive number to divide by 11");			
		int inputNumber = input.nextInt();
		
		if (inputNumber <= 0) {
			System.out.printf("%d is not a positive number\n", inputNumber);
			askForInputNum(input);
		}else {
			mainLogic(inputNumber);
		}
	}
	
	public static void mainLogic(int inputNum) {
		System.out.printf("number chosen %d\n", inputNum);
		
		int shortendNum = divideAlgo(inputNum);		
		System.out.printf("the number %d %s divisible by 11", inputNum, shortendNum == 0 ? "is": "is not");
	}
	
	public static int divideAlgo(int inputNum) {
		int inputNumLength = Integer.toString(inputNum).length();
		
		int loopInt = inputNum;
		
		while (inputNumLength>=1) {
			int leftDigit = (loopInt % 10);
			int right = (loopInt / 10);

			System.out.printf("%d (%d-%d)\n", loopInt, right, leftDigit);

			loopInt = right - leftDigit; 
			
			inputNumLength--;
		}
		return loopInt;
	}
}