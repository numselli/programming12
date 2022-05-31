import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // open or coreate the file
        PrintWriter outputFile = new PrintWriter("./PriceList.txt"); 

        // write data to file
        outputFile.println("Jim"); 
        outputFile.println(95); 
        outputFile.println("Karen"); 
        outputFile.println(98); 
        outputFile.println("Bob"); 
        outputFile.println(82); 

        // close the file
        outputFile.close(); 



        // open the file
        File readFile = new File("./PriceList.txt"); 

        // read from the file
        Scanner inputFile = new Scanner(readFile); 

        // reading lins from file
        while(inputFile.hasNext()) {  
            String line = inputFile.nextLine();
            System.out.println(line);
        }

        // close the file
        inputFile.close(); 

        System.out.println("Hello, World!");
    }
}
