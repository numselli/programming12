import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        double[] rainAmounts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int monthNum = 0; monthNum<(months.length-1); monthNum++){
            rainAmounts[monthNum] = waitForValidInput(input, months[monthNum]);
        }

        double totalRainfall = 0;
        for (double currentRain : rainAmounts){
            totalRainfall+=currentRain;
        }

        System.out.printf("Total rain: %f\nAvg rain per month: %f\n", totalRainfall, totalRainfall/12);
    }

    static double waitForValidInput(Scanner input, String month){
        while (true){
            System.out.printf("enter the rainfall for %s\n", month);
            double inputRain = input.nextDouble();
            if (inputRain>0) return inputRain;
        }
    }
}