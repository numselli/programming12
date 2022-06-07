import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("enter something to check");
        String orgInput = input.nextLine();

        String sanitized = orgInput.toLowerCase().replaceAll(" ", "");
        String fliped = reverse(sanitized);

        if (sanitized.equals(fliped)){
            System.out.printf("%s is a palindrome\n", orgInput);
        }else{
            System.out.printf("%s is not a palindrome\n", orgInput);
        }
    }
    public static String reverse(String inputString){
        char inputStringChrArry[] = inputString.toCharArray();  
        String outString = "";  
        for(int index = inputStringChrArry.length-1; index >= 0; index--){  
            outString += inputStringChrArry[index];  
        }  
        return outString;
    }
}
