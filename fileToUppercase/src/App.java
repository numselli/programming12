import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // open or coreate the file
        PrintWriter outputFile = new PrintWriter("./PriceListOut.txt");

        // open the file
        File readFile = new File("PriceList.txt");

        // read from the file
        Scanner inputFile = new Scanner(readFile);

        // reading lins from file
        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            outputFile.println(line.toUpperCase());
        }

        // close the file
        inputFile.close();
        outputFile.close();
    }
}
