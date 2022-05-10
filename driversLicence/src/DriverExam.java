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
                correct++;
            }
            qIndex++;
        }
        return correct;
    }
}