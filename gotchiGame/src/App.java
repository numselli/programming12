import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
		dice sixSIdedDie = new dice(6);
        Scanner input = new Scanner(System.in);

        // Create 2 creatures 
        creature creatureOne = new creature("Vaporeon", 50, 100);
        creature creatureTwo = new creature("Eevee", 50, 100);

        boolean playerOneTurn = true;
        int lastAttackDamage = 0;
        while (true){
            playerOneTurn = !playerOneTurn;

            creature currentPlayersTurn = (playerOneTurn ? creatureOne : creatureTwo);
            creature nextPlayersTurn = (playerOneTurn ? creatureTwo : creatureOne);

            System.out.printf("%s's turn\n1) Attack\n2) Defend\n3) Heal\n4) Player stats\n", currentPlayersTurn.getName());

            int attackDamage = sixSIdedDie.getValue();
            switch (input.nextInt()){
                case 1:{
                    System.out.printf("attacking %s", nextPlayersTurn.getName());
                    loadingDots(5, 250);
                    nextPlayersTurn.attack(attackDamage);
                    System.out.printf("%d damage dealt to %s, their health is now %.2f%%\n", attackDamage, nextPlayersTurn.getName(), 100*(nextPlayersTurn.getHealth()/nextPlayersTurn.getMaxHealth()));
                    lastAttackDamage = attackDamage;
                }
                break;
                case 2:{
                    System.out.printf("defending against %s", nextPlayersTurn.getName());
                    loadingDots(5, 300);
                    Double currentHealth = currentPlayersTurn.getHealth();
                    double damageBlocked = currentPlayersTurn.defend(lastAttackDamage);
                    System.out.printf("blocked %.2f%% of attack daamage. your health is %.2f%%\n", (currentHealth/damageBlocked)*100, currentHealth);
                    lastAttackDamage = attackDamage;
                }
                break;
                case 3:{
                    System.out.print("healing damage");
                    loadingDots(5, 500);
                    System.out.printf("Now at %.2f%% health\n", 100*(currentPlayersTurn.heal()/currentPlayersTurn.getMaxHealth()));
                }
                break;
                default: {
                    System.out.printf("Current stats for %s:\nhealth: %.2f%%\n\n", creatureOne.getName(), 100*(creatureOne.getHealth()/creatureOne.getMaxHealth()));
                    System.out.printf("Current stats for %s:\nhealth: %.2f%%\n\n", creatureTwo.getName(), 100*(creatureTwo.getHealth()/creatureTwo.getMaxHealth()));

                    playerOneTurn = !playerOneTurn;
                }
                break;
            }

            // Repeat until a creature’s health reaches 0 
            if (0 >= creatureOne.getHealth() || 0 >= creatureTwo.getHealth()){
                creature dead = 0 >= creatureOne.getHealth() ? creatureOne : creatureTwo;
                creature winner = 0 >= creatureOne.getHealth() ?  creatureTwo : creatureOne;
                System.out.printf("%s has reached 0 health.\n%s wins with %.2f%% health left\n", dead.getName(), winner.getName());
                System.exit(0);
            }
        }
    }

    public static void loadingDots(int amount, int delay){
        for (int i = 0; i < amount; i++){
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        System.out.println("");
    }
}