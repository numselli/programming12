package choHan;

import javax.swing.JOptionPane;

public class game {
	public static void main(String[] args) {
		int round = 0;
		int maxRounds = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rounds to play"));
		
		dealer dealer = new dealer();
		player playerOne = new player(JOptionPane.showInputDialog("Player one name"));
		player playerTwo = new player(JOptionPane.showInputDialog("Player two name"));
		
		while (round < maxRounds){
			String diceresult = dealer.getChoOrHan();			
			String playerOneGuess = JOptionPane.showInputDialog("Player one guess. (Cho, Han)");
			String playerTwoGuess = JOptionPane.showInputDialog("Player two guess. (Cho, Han)");
			JOptionPane.showMessageDialog(null, String.format("Dice rolled %d, (%s)", dealer.getDie(), diceresult)); 
			playerOne.addPoint();
			if (playerOneGuess.equalsIgnoreCase(diceresult)) playerOne.addPoint();			
			else if (playerTwoGuess.equalsIgnoreCase(diceresult)) playerTwo.addPoint();

			round++;
		}

		String winer = playerOne.getPoints() > playerTwo.getPoints() ? playerOne.getName() : playerTwo.getName();
		int winnerPoints = playerOne.getPoints() > playerTwo.getPoints() ? playerOne.getPoints() : playerTwo.getPoints();

		String second = playerOne.getPoints() < playerTwo.getPoints() ? playerOne.getName() : playerTwo.getName();
		int secondPoints = playerOne.getPoints() < playerTwo.getPoints() ? playerOne.getPoints() : playerTwo.getPoints();

		JOptionPane.showMessageDialog(null, String.format("Game ended after %d rounds %s won with %d points. %s came in second with %d points", round, winer, winnerPoints, second, secondPoints)); 
	}
}
