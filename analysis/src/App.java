import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random randomObj = new Random();
        
        int numberSet[] = new int[100];

        // set array to random values
        for(int numberSetIndex = 0; numberSetIndex<numberSet.length; numberSetIndex++){
            numberSet[numberSetIndex]= randomObj.nextInt(0, 51);
        }

        int total = 0;

        int totalSet[] = new int[50];

        for(int sortIndex = 0; sortIndex<numberSet.length; sortIndex++){
            total+=numberSet[sortIndex];
            int totalSetIndex = numberSet[sortIndex]-1;            
            totalSet[totalSetIndex == -1 ? 0 : totalSetIndex]+=1;
        }

        // Print a list of numbers and how many occurrences of each number came up. 
        for(int occurrenceIndex = 0; occurrenceIndex<totalSet.length; occurrenceIndex++){
            if (totalSet[occurrenceIndex]>0) System.out.printf("%d occured %d times\n", occurrenceIndex, totalSet[occurrenceIndex]);
        }

        // System.out.println(Arrays.toString(totalSet));
        insertionSort(totalSet);

        // Determine the range (maximum – minimum) 
        System.out.printf("range: %d\n", totalSet[49]- totalSet[0]);
        System.out.printf("avrage: %d\n", total/numberSet.length);
    }

    public static void insertionSort(int[] arr) {
        for (int x = 1; x < arr.length; x++) {
            int y = x - 1;
            while (y >= 0 && arr[x] < arr[y]) {
                arr[y + 1] = arr[y];
                y--;
            }
            arr[y + 1] = arr[x];
        }
    }       
}