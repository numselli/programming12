import java.util.Scanner;

public class vehicleTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        vehicle car = new vehicle(100, 8.9, 50);

        while(true){
            System.out.println("1) Take a trip\n2) Fill up\n3) Current Fuel level\n4) Max distance\n5) Exit");
            int userChoice = input.nextInt();
            switch (userChoice){
                case 1: {
                    // Take a trip - enter the kilometres of the trip 
                    System.out.println("enter the kilometres of the trip");
                    double distance = input.nextDouble();
                    car.takeTrip(distance);
                }
                break;
                case 2: {
                    // Fill up - enter the amount of fuel added to the tank
                    System.out.println("enter the amount to add to the tank");
                    int amountToAdd = input.nextInt();
                    car.fillUp(amountToAdd);
                }
                break;
                case 3: {
                    // Current Fuel level 
                    System.out.printf("current Fuel level is %f\n", car.getfuelLevel());
                }
                break;
                case 4: {
                    // Max distance 
                    System.out.printf("max distance is %f KM\n", car.getMaxDistance());
                }
                break;
                case 5: {
                    // Quit \
                    System.exit(0);
                }
                break;
                default: {
                    System.out.println("Invalid option selected");
                }
            }
        }
    }
} 
