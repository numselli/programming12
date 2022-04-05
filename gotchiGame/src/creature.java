import java.util.Random;

public class creature {
    private String name; 
    private double health;
    private double maxHealth;
    private Random rand = new Random(); 
    
    creature(String name, double health, double maxHealth){
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
    }

    public void attack(int damage){
        health -= damage;
    }

    public double defend(int attackDamage){
        double randDefend = rand.nextInt(attackDamage) + 1;
        health -= randDefend;
        return randDefend;
    }

    public double heal(){
        if ((maxHealth-health) <= 0) {
            health = maxHealth;
            return health;
        }

        double randHealAmount = rand.nextDouble(maxHealth-health) + 1;
        if (randHealAmount>=maxHealth) {
            health = maxHealth;
            return health;
        }

        health += randHealAmount;

        return health;
    }

    public double getHealth(){
        return health;
    }
    public String getName() {
        return name;
    }
    public double getMaxHealth() {
        return maxHealth;
    }
}