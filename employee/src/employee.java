public class employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public employee(int id, String firstName, String lastName, double salary){
        if (id <= 0 || firstName.equals("") || lastName.equals("")) {
            System.out.println("employee must have an id, first name and last name");
            return;
        }

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary <= 0  ? 15.20 : salary;
    }
   
    // set
    public void setSalary(double salary){
        if (salary <= 0){
            System.out.println("cant set salary less than 0");
            return;
        }
        this.salary = salary;
    }
    public void raiseSalary(double percent){
        if (percent <= 0){
            System.out.println("cant reduce employee salary");
            return;
        }
        setSalary(salary+(salary/percent));
    }

    public int getID(){
        return id;
    }
    public String getFristName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public double getSalary(){
        return salary;
    }
    public double getAnnualSalary(){
        return salary * 12;
    }

    public String toString(){
        return String.format("id = %d; frist name = %s; last name = %s; salary = $f;", id, firstName, lastName, salary);
    }
}