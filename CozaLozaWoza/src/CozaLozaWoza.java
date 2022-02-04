public class CozaLozaWoza {
	public static void main(String[] args) { 
		for (int i = 1; i <= 110; i++) {
			if (i != 1 && i % 11 == 1) {
				System.out.println();
			}
			
			System.out.print(check(i));			
		}
	}
	
	public static String check (int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "CozaLoza ";
		} 
		if (number % 3 == 0) {
			return "Coza ";
		}
		if (number % 5 == 0) {
			return "Loza ";
		}
		if (number % 7 == 0){
			return "Woza ";		
		}
		return Integer.toString(number) + " ";
	}
}