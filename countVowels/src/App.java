import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);

        System.out.println("input word to check for vowels");
        String inpuString = input.nextLine().toLowerCase();

        String[] vowels = {"a", "e", "i", "o", "u"};
        int vowelCount = 0;
        
        for (int index = 0; index<inpuString.length(); index++){
            for(String vowel : vowels){
                if (Character.toString(inpuString.charAt(index)).equals(vowel)){
                    vowelCount++;
                }
            }
        }

        System.out.printf("vowel count: %d\n", vowelCount);

    }
}
