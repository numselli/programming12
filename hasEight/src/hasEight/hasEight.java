package hasEight;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hasEight {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		
		mainLogic(input);
	}
	
	public static void mainLogic(Scanner input) { 
		System.out.println("Enter a number to check if it has 8 (enter a negative number to qut)");
		int inputNum = input.nextInt();
		
		if(inputNum < 0) {
			System.out.println("Good bye");
			System.exit(0);
		}
		
		Boolean hasEight = checkHasEight(inputNum);
		System.out.println(hasEight ? "Has 8" : "Does not have 8");
		mainLogic(input);
	}
	
	public static Boolean checkHasEight(int inputNum) {
		Pattern pattern = Pattern.compile("8");
	    Matcher matcher = pattern.matcher(Integer.toString(inputNum));
	    return matcher.find();
	}
}