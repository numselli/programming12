package choHan;

import java.util.Random;

public class dealer {	
	private int diceOne = 0;
	private int diceTwo = 0;
	
	public dealer () {
	}
	
	public void rollDice() {
		Random rand = new Random(); 
		diceOne = rand.nextInt(6) + 1;
		diceTwo = rand.nextInt(6) + 1;
	}
	
	public int getDie () {
		return diceOne + diceTwo;
	}
	
	public String getChoOrHan() { 
		rollDice();
		int total = diceOne + diceTwo;
		
		return total % 2 == 0 ? "cho" : "han";
	}
}
