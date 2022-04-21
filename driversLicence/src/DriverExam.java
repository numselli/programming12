public class DriverExam {
    private String[] correctStrings = {"b", "d", "a", "a", "c", "a", "b", "a", "c", "d"};
    private String[] submiStrings = new String[10];
    public int length = 9;
    
    public DriverExam(){

    }

    public void submitAnswer(String answer, int index) {
        submiStrings[index] = answer;
    }

    public int totalCorrect(){
        int qIndex = 0;
        int correct = 0;
        while (correctStrings.length > qIndex) {
            if (correctStrings[qIndex].equalsIgnoreCase(submiStrings[qIndex])){
                qIndex++;
                correct++;
            }
        }
        return correct;
    }


//     A student must correctly answer 8 of the 10 questions to pass the exam.  
// The class should also have an array field that holds the student’s answers. The class should  
// have the following methods:  

// ● totalCorrect. Returns the total number of correctly answered questions. Pass the correct answer array and the student answer array to the totalCorrect method 
// Demonstrate the class in a complete program that asks the user to enter a student’s answers,  
// and then displays the results returned from the DriverExam class’s methods.  
}