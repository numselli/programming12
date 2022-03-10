import java.util.Scanner;

public class accountTester {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        account myAccount = new account("73765B68939029F8001E9FD55CB0857BE052B5C4", "zac", 0);

        while (true){
            System.out.println("1) Credit account\n2) Debit account\n3) Get Balance\n4) Print details\n5) Quit");
            switch (input.nextInt()){
                case 1:{
                    // Credit account 
                    System.out.println("enter amount to deposit");
                    double deposit = input.nextDouble();
                    double newAmount = myAccount.credit(deposit);
                    System.out.printf("%f deposited, the balance is now %f\n", deposit, newAmount);
                }
                break;
                case 2:{
                    // Debit account  
                    System.out.println("enter amount to withdraw");
                    double withdraw = input.nextDouble();
                    double newAmount = myAccount.debet(withdraw);
                    System.out.printf("%f withdrew, the balance is now %f\n", withdraw, newAmount);
                }
                break;
                case 3:{
                    // Get Balance 
                    System.out.printf("the balance for %s is %f\n", myAccount.getName(), myAccount.getBalance());
                }
                break;
                case 4:{
                    // Print details
                    System.out.printf("account details for %s: %s\n", myAccount.getName(), myAccount.toString());
                }
                break;
                case 5:{
                    System.exit(0);
                }
                break;
                default:{
                    System.out.println("invalid option");
                }
            }
        }
      
    }
}
