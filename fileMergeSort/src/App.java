import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
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