public class vehicle {
    // variables
    private int fuelCapacity;
    private double fuelEconomy;
    private int fuelLevel;

    // constructors
    vehicle(){
        fuelCapacity = 0;
        fuelEconomy = 0;
        fuelLevel = 1;
    }
    vehicle(int fuelCapacity, double fuelEconomy, int fuelLevel){
        this.fuelCapacity = fuelCapacity;
        this.fuelEconomy = fuelEconomy;
        this.fuelLevel = fuelLevel;
    }

    public double getMaxDistance(){
        return (fuelCapacity / (fuelEconomy * 100));
    }
    public double getfuelLevel(){
        return fuelLevel;
    }
    public void takeTrip(double distance){
        if (distance>=getMaxDistance()){
            System.out.println("you dont have enough gass to make this trip");
            return;
        }
        fuelLevel-=(distance * fuelEconomy / 100);
    }
    public void fillUp(int amountToAdd){
        if ((amountToAdd+fuelLevel)>fuelCapacity){
            System.out.println("your tank will be overflowing if you do that");
            return;
        }
        fuelLevel+=fuelLevel;
    }
}
