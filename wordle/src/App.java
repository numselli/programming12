import java.util.Scanner;

public class App {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int guess = 1;

        System.out.println("input key");
        String key = input.nextLine();
        char[] keyArray = key.toCharArray();

        String[][] guessboard = {
            {" ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " "},
        };

        do {
            System.out.printf("guess #%d\n", guess);
            System.out.println("input guess");
            String inputGuess = input.nextLine();
            char[] inputGuessArray = inputGuess.toCharArray();
            for (int inputCharIndex=0; inputCharIndex<inputGuess.length(); inputCharIndex++){
                guessboard[guess-1][inputCharIndex] = Character.toString(inputGuessArray[inputCharIndex]);
            }

            printBoard(guessboard, keyArray);

            if (inputGuess.equals(key)){
                System.out.printf("You guessed the word in %d guesses\n", guess);
                System.exit(0);
            }
            
            guess++;
        } while (guess<=6);
    }
    static void printBoard(String[][] bString, char[] key){
        System.out.println("╔═╦═╦═╦═╦═╗");
        for (int guessNum = 0; guessNum<bString.length; guessNum++){
            System.out.print("║");

            for (int charNum = 0; charNum<bString[guessNum].length; charNum++){
                checkChar(bString[guessNum][charNum], charNum, key);
                System.out.print("║");
            }

            System.out.print("\n");
            if (guessNum!=(bString.length-1)) System.out.println("╠═╬═╬═╬═╬═╣");
        } 
        System.out.println("╚═╩═╩═╩═╩═╝");
    }

    static void checkChar(String letter, int index, char[] key){
        if (letter.equals(Character.toString(key[index]))){
            System.out.printf("\u001B[32m%s\u001B[0m",letter); 
        } else if (new String(key).contains(letter)){
            System.out.printf("\u001B[33m%s\u001B[0m",letter); 
        } else {
            System.out.printf("\u001B[31m%s\u001B[0m",letter); 
        }
    }
}