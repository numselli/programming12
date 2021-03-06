package bmi;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		mainLocic();
	}
	
	public static void mainLocic () {
		Scanner input = new Scanner(System.in);
		
		System.out.println("input weight");
		double inputWeight = input.nextDouble();
		
		System.out.println("input height");
		double inputHeight = input.nextDouble();
		
		double BMI = calulateBMI(inputWeight, inputHeight);
		
		System.out.printf("your bmi is %.2f\n",BMI);
		
		System.out.println(determineCategory(BMI));
		
		System.out.println("Want to continue with another calculation or quit\n1) Continue\n2) Quit");
		int inputContinue = input.nextInt();
		System.out.println(inputContinue);
		if (inputContinue==1) {
			mainLocic();
		}else{
			System.out.println("Good Bye");
			System.exit(0);
		}
	}
	
	public static double calulateBMI(double weight, double height) {
		return weight / Math.pow(height, 2);
	}

	public static String determineCategory(double BMI) {
		if (BMI <= 18.5) {
			return "you are underweight";
		}else if(BMI >= 18.5 && BMI <= 24.9) {
			return "you are a healthy weight";
		}else if(BMI >= 25 && BMI <= 29.9) {
			return "you are overweight";
		}else {
			return "you are obese";
		}
	}
}
