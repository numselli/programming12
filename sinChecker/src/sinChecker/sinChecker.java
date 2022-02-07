package sinChecker;

import java.util.Scanner;

public class sinChecker {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);

		System.out.println("Input a Social Insurance Number to validate");
		String inputSIN = (input.nextLine()).replace(" ", "");
		
		if (inputSIN.toLowerCase().matches(".*[a-z].*")) {
			System.out.println("Social Insurance Number can not include letters");
			return;
		}
		if (inputSIN.length() != 9) {
			System.out.println("Invalid Social Insurance Number length");
			return;
		}
		
		System.out.printf("The Social Insurance Number %s is %s",inputSIN, sinCheckerAlgo(inputSIN) ? "valid" : "invalid");
		
	}
	
	public static Boolean sinCheckerAlgo(String SIN) {
		char[] sinChars = SIN.toCharArray();
		String tempSin = "";
		
		for (int index = 0; index <= sinChars.length-1; index++) {
			if ((index+1) % 2 == 0) {
				int doubbledDigit = (Integer.parseInt(String.valueOf(sinChars[index]))*2);
				tempSin+=String.valueOf(addDigits(doubbledDigit));
			}else {
				tempSin+=sinChars[index];
			}
		}
		
		int totalDigits = addDigits(Integer.parseInt(tempSin));
	
		return totalDigits % 10 == Integer.parseInt(String.valueOf(sinChars[8]));
	}
	
	public static int addDigits(int inpitDigits) {
		int sum=0;
		
		while(inpitDigits>0){
			sum+=(inpitDigits%10);
			inpitDigits = inpitDigits/10;
		}
		
		return sum;
	}
}