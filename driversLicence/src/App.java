import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        DriverExam exam = new DriverExam();

        int qIndex = 0;
        while (exam.length+1 > qIndex) {
            System.out.printf("answer question %d\n choices:\nA)\nB)\nC)\nD)\n", qIndex+1);
            String inputChoice = input.nextLine();
            if (inputChoice.equalsIgnoreCase("a") || inputChoice.equalsIgnoreCase("b") || inputChoice.equalsIgnoreCase("c") || inputChoice.equalsIgnoreCase("d")){
                exam.submitAnswer(inputChoice, qIndex);
                qIndex++;
            }
        }
        System.out.printf("total correct: %d\n", exam.totalCorrect());
        // exam.totalCorrect()
    }
}
 
// A student must correctly answer 8 of the 10 questions to pass the exam.  
// The class should also have an array field that holds the student’s answers. The class should  
// have the following methods:  

// ● totalCorrect. Returns the total number of correctly answered questions. Pass the correct answer array and the student answer array to the totalCorrect method 
// Demonstrate the class in a complete program that asks the user to enter a student’s answers,  
// and then displays the results returned from the DriverExam class’s methods.  