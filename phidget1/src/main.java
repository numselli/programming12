import com.phidget22.*;

public class main {
	public static void main(String[] args) throws Exception {
		// red button
		DigitalInput redButton = new DigitalInput();
		redButton.setHubPort(4);
		redButton.setIsHubPortDevice(true);
		redButton.open(1000);
		  
		// green button
		DigitalInput greenButton = new DigitalInput();
		greenButton.setHubPort(3);
		greenButton.setIsHubPortDevice(true);
		greenButton.open(1000);
		
		//red LED
		DigitalOutput redLedOut = new DigitalOutput();
		redLedOut.setHubPort(0);
		redLedOut.setIsHubPortDevice(true);
		redLedOut.open(1000);
	  
		//green LED
		DigitalOutput greenLedOut = new DigitalOutput();
		greenLedOut.setHubPort(1);
		greenLedOut.setIsHubPortDevice(true);
		greenLedOut.open(1000);
	  
		while (true) {
			redLedOut.setState(redButton.getState());
			greenLedOut.setState(greenButton.getState());
		}
	}
}