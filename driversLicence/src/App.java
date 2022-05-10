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