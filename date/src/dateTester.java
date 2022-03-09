import java.util.Scanner;

public class dateTester {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        date dateClass = new date();
        System.out.println(dateClass.getDate());

        while(true){
            System.out.println("1) add day\n2) remove day\n3) add month\n4) remove month\n5) add year\n6) remove year\n7) Exit");
            int userChoice = input.nextInt();
            switch (userChoice){
                case 1: {
                    // add day
                    System.out.println("Enter amount of days to add");
                    int dayAmountToGoAdd = input.nextInt();
                    dateClass.decreaseDay(dayAmountToGoAdd);
                    System.out.printf("the date is now %s", dateClass.getDate());
                }
                break;
                case 2: {
                    // remove day
                    System.out.println("Enter amount of days to go back");
                    int dayAmountToGoBack = input.nextInt();
                    dateClass.decreaseDay(dayAmountToGoBack);
                    System.out.printf("the date is now %s", dateClass.getDate());
                }
                break;
                case 3: {
                    // add month
                    System.out.println("Enter amount of months to add");
                    int dayAmountToAdd = input.nextInt();
                    dateClass.increaseDay(dayAmountToAdd);
                    System.out.printf("the date is now %s", dateClass.getDate());
                }
                break;
                case 4: {
                    // remove month
                    System.out.println("Enter amount of months to go back");
                    int monthAmountToGoBack = input.nextInt();
                    dateClass.decreaseMonth(monthAmountToGoBack);
                    System.out.printf("the date is now %s", dateClass.getDate());
                }
                break;
                case 5: {
                    // add year
                    System.out.println("Enter amount of years to add");
                    int yearsToAdd = input.nextInt();
                    dateClass.increaseYear(yearsToAdd);
                    System.out.printf("the date is now %s", dateClass.getDate());
                }
                break;
                case 6: {
                    // remove year
                    System.out.println("Enter amount of years to go back");
                    int yearAmountToGoBack = input.nextInt();
                    dateClass.decreaseYear(yearAmountToGoBack);
                    System.out.printf("the date is now %s", dateClass.getDate());
                }
                break;
                case 7: {
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