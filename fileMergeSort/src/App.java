import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // // make an array with the length of the files
        // File readFileLengthOne = new File("./fileOne.txt"); 
        // Scanner readLengthOne = new Scanner(readFileLengthOne);
        // int fileOneLineLengthCounter = 0;
        // while(readLengthOne.hasNext()) {  
        //     readLengthOne.nextLine();
        //     fileOneLineLengthCounter++;
        // }
        // int[] fileOneArray = new int[fileOneLineLengthCounter];
        // readLengthOne.close(); 

        // File readFileLengthTwo = new File("./fileTwo.txt"); 
        // Scanner readLengthTwo = new Scanner(readFileLengthTwo);
        // int fileTwoLineLengthCounter = 0;
        // while(readLengthTwo.hasNext()) {  
        //     readLengthTwo.nextLine();
        //     fileTwoLineLengthCounter++;
        // }
        // int[] fileTwoArray = new int[fileTwoLineLengthCounter];
        // readLengthTwo.close(); 


        // // fill the arrays with data from the files
        // File readFileOne = new File("./fileOne.txt"); 
        // Scanner readOne = new Scanner(readFileOne);
        // int fileOneLineCounter = 0;
        // while(readOne.hasNext()) {  
        //     int fileOneLine = readOne.nextInt();
        //     fileOneArray[fileOneLineCounter] = fileOneLine;
        //     fileOneLineCounter++;
        // }
        // readOne.close(); 

        // File readFileTwo = new File("./fileTwo.txt"); 
        // Scanner readTwo = new Scanner(readFileTwo);
        // int fileTwoLineCounter = 0;
        // while(readTwo.hasNext()) {  
        //     int fileTwoLine = readTwo.nextInt();
        //     fileTwoArray[fileTwoLineCounter] = fileTwoLine;
        //     fileTwoLineCounter++;
        // }
        // readTwo.close(); 

        // // merge the arrays
        // int[] outArray = new int[fileOneArray.length + fileTwoArray.length];
        // System.arraycopy(fileOneArray, 0, outArray, 0, fileOneArray.length);  
        // System.arraycopy(fileTwoArray, 0, outArray, fileOneArray.length, fileTwoArray.length);  

        // // sort arrays
        // Arrays.sort(outArray);
 
        // // write arrays to file
        // PrintWriter outputFile = new PrintWriter("./outFile.txt"); 
        // for (int length=0; length<outArray.length; length++){
        //     outputFile.println(outArray[length]); 
        // }
        // outputFile.close(); 

        File readFileOne = new File("./fileOne.txt");
        File readFileTwo = new File("./fileTwo.txt");
        PrintWriter outputFile = new PrintWriter("./outFile.txt"); 
     
        Scanner readOne = new Scanner(readFileOne);
        Scanner readTwo = new Scanner(readFileTwo);
        
        boolean eof1 = readOne.hasNextInt();
        boolean eof2 = readTwo.hasNextInt();

        int value1 = eof1 ? readOne.nextInt() : -1; // -1 just to give it an initial value
        int value2 = eof2 ?  readTwo.nextInt() : -1;
        
        while (eof1 || eof2){
            if (eof1 && eof2){
                if (value1 < value2) {
                    // The number in fileName1 is less
                    System.out.println(value1);
                    outputFile.println(value1);
                    eof1 = readOne.hasNextInt();
                    value1 = eof1 ? readOne.nextInt() : value1;
                } else { // The number in fileName2 is less
                    System.out.println(value2);
                    outputFile.println(value2);
                    eof2 = readTwo.hasNextInt();
                    value2 = eof2 ? readTwo.nextInt() : value2;
                }
            }else{
                if(readOne.hasNextInt()) {
                    value1 = readOne.nextInt();
                    outputFile.println(value1);
                    System.out.println(value1);
                }else if(readTwo.hasNextInt()) {
                    value2 = readTwo.nextInt();
                    outputFile.println(value2);
                    System.out.println(value2);
                }else{
                    break;
                }
            }
        }
        
        readTwo.close();
        readOne.close();
        outputFile.close();

        System.out.println("done");
    }
}