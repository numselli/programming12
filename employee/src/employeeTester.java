import java.util.Scanner;

public class employeeTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        employee employeeOne = new employee(007, "james", "bond", 16.79); // to much time went into checking the salary

        while(true){
            System.out.println("1) Set Salary\n2) Get Name\n3) Get Salary\n4) Get Annual Salary\n5) Raise Salary (%)\n6) Quit");
            int userChoice = input.nextInt();
            switch (userChoice){
                case 1:{
                    // set Salary
                    System.out.println("Enter salary to set");

                    Double oldSalary = employeeOne.getSalary();
                    double newSalary = input.nextDouble();

                    employeeOne.setSalary(newSalary);
                    System.out.printf("Salary set to: %f from %f\n", oldSalary, newSalary);
                } break;
                case 2:{
                    // get name
                    System.out.println("employee name: " + employeeOne.getName());
                } break;

                case 3:{
                    // get Salary
                    System.out.printf("employee salary: %f\n", employeeOne.getSalary());

                } break;
                case 4:{
                    // get Annual Salary
                    System.out.printf("employee Annual salary: $%f/yr\n", employeeOne.getAnnualSalary());
                } break;
                case 5:{
                    // raise
                    System.out.println("Enter raise %");
                    double raise = input.nextDouble();
                    double old = employeeOne.getSalary();

                    employeeOne.raiseSalary(raise);
                    System.out.printf("raiseing salary by %f%% (from %f to %f)\n", raise, old, employeeOne.getSalary());
                } break;
                case 6:{
                    // quit
                    System.out.println("Exiting tester");
                    System.exit(0);
                } break;
                default: {
                    System.out.println("Invalid option selected");
                }
            }
        }
    }
}
