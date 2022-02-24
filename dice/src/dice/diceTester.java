package dice;

public class diceTester {
	public static void main(String[] args) {
		dice sixSIdedDie = new dice(6);
		dice twelveSidedDie = new dice(12);

		for (int i = 1; i < 6; i++) {
		
			
			System.out.println("roll " + i + " sixSIdedDie: " + sixSIdedDie.getValue() + " twelveSidedDie: " + twelveSidedDie.getValue());
		}
	}
}
