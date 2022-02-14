package pokerDice;

import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class pokerDice {
	public static void main(String[] args) {
		game();
	}
	
	public static void game () {
		Scanner input = new Scanner(System.in);	
		int points = 0;
		
		boolean gameWon = false;
		while (!gameWon) {
			
			int roundPoints = 0;
			
			Random randObj = new Random();
			int diceOne = randObj.nextInt(6-1+1)+1;
			int diceTwo = randObj.nextInt(6-1+1)+1;
			int diceThree = randObj.nextInt(6-1+1)+1;
			
	        System.out.printf("dice one: %d\n", diceOne);
	        wait(500);
	        System.out.printf("dice two: %d\n", diceTwo);
			wait(500);
	        System.out.printf("dice three: %d\n\n", diceThree);

//	        Three of a kind: +50pts 
			if (areAllEqual(diceOne, diceTwo, diceThree)) roundPoints+=50;
			
//			Three odd/even numbers: +15pts 
			if (areAllEven(diceOne, diceTwo, diceThree) || areAllOdd(diceOne, diceTwo, diceThree)) roundPoints+=15;
		
//			One pair: +10pts
			if (hasPair(diceOne, diceTwo, diceThree)) roundPoints+=10;
			
			points += roundPoints;
			
			// 	Prompt the user to play again or to quit. 
			System.out.printf("This round you got %d points, you have a total of %d points.\nWould like to play again.\n1) Yes\n2) No\n", roundPoints, points);
			int inputChoice = input.nextInt();
			if (inputChoice == 2) {
				System.out.printf("\nYou have %d points. It was nice playing with you\n", points);
				System.exit(0);			
			}
		}
		
	}
	
	public static boolean areAllEqual(int... values){	    
	    int checkValue = values[0];
	    for (int i = 1; i < values.length; i++){
	        if (values[i] != checkValue) return false;
	    }
	    
	    return true;
	}
	
	public static boolean areAllEven(int... values){	    
	    int checkValue = values[0] % 2;
	    if (checkValue != 0) return false;
	    
	    for (int i = 1; i < values.length; i++){
	        if (values[i] % 2 != 0) return false;
	    }
	    
	    return true;
	}
	
	public static boolean areAllOdd(int... values){	    
	    int checkValue = values[0] % 2;
	    if (checkValue != 1) return false;
	    
	    for (int i = 1; i < values.length; i++){
	    	if (values[i] % 2 != 1) return false;
	    }
	    
	    return true;
	}
	
	public static boolean hasPair(int... values){
		Set<Integer> set = new HashSet<>();
 
        for (int i = 0; i < values.length; i++) {
            set.add(values[i]);
        }
 
        return set.size() == 2;
	}
	
	public static void wait(int ms){
	    try{
	        Thread.sleep(ms);
	    } catch(InterruptedException ex){
	        Thread.currentThread().interrupt();
	    }
	}
}
