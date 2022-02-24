package dice;

import java.util.Random;

public class dice {
	private int sides=0;
	
	public dice (int inputSides) {
		if (inputSides<0) {
			System.out.println("enter number of sides");
			return;
		}
		sides = inputSides;
	}
	
	public int roll() {
		Random rand = new Random(); 
		return rand.nextInt(sides) + 1; 
	}
	
	public int getSides() { 
		return sides; 
	} 
	
	public int getValue() { 
		return roll(); 
	} 
}
