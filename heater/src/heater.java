public class heater {
    // Fields
    private double minTemp;
    private double maxTemp;
    private double increment;
    private double temperature;

    // Constructors
    heater(){
        maxTemp = 0;
        minTemp = 100;
        increment = 0.5;
        temperature = 69.0;
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
            System.out.println("this is as cold as it gets");
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