import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random randomObj = new Random();

        System.out.println("Enter names seprated by a comma\nexample: name1, name2, name3");
        String inputNames = input.nextLine();
        String inputNameList[] = inputNames.split(", ");

        System.out.println("Enter number of names to draw");
        int numOfNames = input.nextInt();
        if (numOfNames>inputNameList.length || numOfNames<inputNameList.length){
            numOfNames = 1;
            System.out.println("invalid amount using defualt of 1");
        }

        int index = 1;
        while(index<numOfNames){
            int randIndex = randomObj.nextInt(inputNameList.length-1);
            System.out.println(inputNameList[randIndex]);
            inputNameList = removeElement(inputNameList, randIndex);
            index++;
        }
    }

    static String[] removeElement(String[] inputArray, int deleteIndex){
        String[] outArray = new String[inputArray.length-1];
        int trueIndex = 0;
        for (int index = 0; index<inputArray.length-1; index++){
            if (index != deleteIndex){
                outArray[trueIndex]=inputArray[index];
                trueIndex++;
            }
        }
        return outArray;
    }
}