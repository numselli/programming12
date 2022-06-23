import com.phidget22.*;

public class main {
	static boolean redPlayerTurn = true;

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
	
		greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
			public void onStateChange (DigitalInputStateChangeEvent event) {
				if (event.getState()) {
					redPlayerTurn = !redPlayerTurn;
				}
			}
		});
		
		redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
			public void onStateChange (DigitalInputStateChangeEvent event) {
				if (event.getState()) {
					redPlayerTurn = !redPlayerTurn;
				}
			}
		});
		
		
		boolean isPlayingChess = true;
		
		int redPlayerTime = 60;
		int greenPlayerTime = 60;

		while (isPlayingChess) {
			if (redPlayerTurn) {
				redPlayerTime--;
				
			} else {
				greenPlayerTime--;
			}
			
			redLedOut.setState(redPlayerTurn);
			greenLedOut.setState(!redPlayerTurn);

			if (redPlayerTime == 0 || greenPlayerTime == 0) {
				isPlayingChess = !isPlayingChess;
			}
			
			System.out.println("red " + redPlayerTime);
			System.out.println("green " + greenPlayerTime);

			Thread.sleep(1000);
		}
	}
}