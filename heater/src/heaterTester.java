import java.util.Scanner;

public class heaterTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        heater furnaceOne = new heater();

        while(true){
            System.out.println("1) Increase temperature\n2) Decrease temperature\n3) Change increment/decrement\n4) Change Maximum Temperature\n5) Change Minimum Temperature\n6) Show Temperature\n7) Exit");
            int userChoice = input.nextInt();
            switch (userChoice){
                case 1:{
                    // Increase temperature
                    furnaceOne.increaseTemp();
                    System.out.printf("temperature Increased to %f\n", furnaceOne.showTemp());
                } break;
                case 2:{
                    // Decrease temperature 
                    furnaceOne.decreaseTemp();
                    System.out.printf("temperature Decreased to %f\n", furnaceOne.showTemp());
                } break;
                case 3:{
                    // increment/decrement
                    System.out.println("enter increment/decrement amount");
                    furnaceOne.changeIncrement(input.nextDouble());
                } break;
                case 4:{
                    // Change Maximum Temperature 
                    System.out.println("Enter Maximum Temperature");
                    furnaceOne.changeMaxTemp(input.nextDouble());
                } break;
                case 5:{
                    // Change Minimum Temperature
                    System.out.println("Enter Minimum Temperature");
                    furnaceOne.changeMinTemp(input.nextDouble());
                } break;
                case 6:{
                    // Show Temperature
                    System.out.printf("Current temp: %.2f\n", furnaceOne.showTemp());
                } break;
                case 7: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid option selected");
                }
            }
        }
    }
}
