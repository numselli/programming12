package sinChecker;

import java.util.Scanner;

public class sinChecker {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);

		System.out.println("Input a Social Insurance Number to validate");
		String inputSIN = (input.nextLine()).replace(" ", "");
		
		if (!inputSIN.toLowerCase().matches("[0-9]{9}")) {
			System.out.println("Social Insurance Number must be a 9 digit long number");
			return;
		}
		
		String reverseSIN=reverse(inputSIN);
		System.out.printf("The Social Insurance Number %s is %s",inputSIN, sinCheckerAlgo(reverseSIN) ? "valid" : "invalid");
	}
	
	public static Boolean sinCheckerAlgo(String SIN) {
		char[] sinChars = SIN.toCharArray();
		int totalDigits = 0;
		
		for (int index = 0; index <= SIN.length()-1; index++) {
			String indexChar = String.valueOf(sinChars[index]);
	
			int Char = Integer.parseInt(indexChar);
			
			if (index !=8) {
				int multyFactor = ((index+1) % 2 == 0 ? 2 : 1);
				totalDigits+=addDigits(Char * multyFactor);
			}
		}
					
		return 10-(totalDigits % 10) == Integer.parseInt(String.valueOf(sinChars[8]));
	}
	
	public static int addDigits(int inpitDigits) {
		int sum=0;
		
		while(inpitDigits>0){
			sum+=(inpitDigits%10);
			inpitDigits = inpitDigits/10;
		}
		
		return sum;
	}
	
	public static String reverse(String in) {
		String nstr = "";
	    char ch;
	    
	    for (int i = 0; i < in.length(); i++){
	    	ch = in.charAt(i);
	    	nstr = ch+nstr;
	    }
	   
	   return nstr;
	}
}