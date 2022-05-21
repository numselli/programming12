import java.util.Random;
import java.util.Arrays;  

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        // create array with 50 random numbers ranging from 0 to 50
        int[] numersList = new int[50];
        for(int index = 0; index<numersList.length; index++) {
            numersList[index] = random.nextInt(51);   
        }

        // sort array
        Arrays.sort(numersList);

        // print the array
        System.out.println(Arrays.toString(numersList));
    }
}