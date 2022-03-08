public class heater {
    // Fields
    private double minTemp = 0;
    private double maxTemp = 100;
    private double increment = 0.5;
    private double temperature = 69.0;

    // Constructors
    heater(){
        
    }
    heater(double minTemp, double maxTemp, double increment, double temperature){
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.increment = increment;
        this.temperature = temperature;
    }

    // Methods
    public void increaseTemp(){
        if ((temperature+increment)>maxTemp){
            System.out.println("this is as hot as it gets");
            return;
        }
        temperature += increment;
    }
    public void decreaseTemp(){
        if ((temperature-increment)<minTemp){
            System.out.printlln("this is as cold as it gets");
            return;
        }
        temperature -= increment;
    }
    public void changeIncrement(double amount){
        this.increment = amount;
    }
    public void changeMaxTemp(double max){
        this.maxTemp = max;
    }
    public void changeMinTemp(double min){
        this.minTemp = min;
    }
    public double showTemp(){
        return temperature;
    }
}