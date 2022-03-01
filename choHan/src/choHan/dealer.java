package choHan;

import java.util.Random;

public class dealer {
	private int total = 0;
	
	public dealer () {
	}
	
	public void rollDice() {
		Random rand = new Random(); 
		this.total = (rand.nextInt(6) + 1) + rand.nextInt(6) + 1;
	}
	
	public int getDie () {
		return this.total;
	}
	
	public String getChoOrHan() { 
		rollDice();
		
		return this.total % 2 == 0 ? "cho" : "han";
	}
}
