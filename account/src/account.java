import javax.print.DocFlavor.STRING;

public class account { 
    private String id;
    private String name;
    private double balance;

    account(String id, String name){
        this.id = id;
        this.name = name;
    }
    account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public double credit (double amount){
        balance+=amount;
        return balance;
    }
    public double debet (double amount){
        if (amount >= balance){
            System.out.println("balance to low");
            return balance;
        }

        balance=-amount;
        return balance;
    }

    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }

    public String toString() {
        return String.format("Account[id=%s, name=%s, balance=%f]", id, name, balance);
    }
}
