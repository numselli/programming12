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
        sort(numersList);

        // print the array
        System.out.println(Arrays.toString(numersList));
    }

    static void sort(int[] arr) {  
        int temp = 0;  
        for(int i = 0; i < arr.length; i++){  
            for(int j = 1; j < (arr.length-i); j++){  
                if(arr[j-1] > arr[j]){  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }              
            }  
        }
    }
}