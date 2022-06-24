import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        File readFile = new File("./wordList.txt"); 
        Scanner inputFile = new Scanner(readFile); 

        // int totalLines = 0;
        // while(inputFile.hasNext()){
        //     totalLines++;
        // }

        Random random = new Random();   
// // Generates random integers 0 to 49  
// int x = random.nextInt(50);   
System.out.println(Paths.get("./wordList.txt"));
        String line = Files.readAllLines(Paths.get("./wordList.txt")).get(0);

        System.out.println(line);  

        // # 1
        // Create a hangman application that will randomly choose a word from a text file. The text file should contain a list of words, with one word on each line. 

        // String method toCharArray 
        
        // char[] array = str.toCharArray(); 
        
        // array.length; 
        // Length of the array 
        // str.length();  
        // Length of the string 
    }
}