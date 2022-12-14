public class Dragon {
    private int health;
    private int strength;
    private int level;

    private boolean dead;

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDead() {
        return dead;
    }

    public Dragon(){
        health = 100;
        strength = 1;
        level = 1;
        dead = false;

    }

    public String takeDamage(int hit){

        if(dead) {
            return "The dragon is already dead";
        }
        if(health <= 0){
            dead = true;
            return "the Dragon has been Slain";
        }

        health = health - hit;
        return "The dragon takes " + hit + " damage and now has " + health + " health";

    }


    public int attack(){
        int damage = strength * level;
        int temp = damage;
        System.out.println( "The dragon attacks for " + damage + " health points!");
        temp = damage + temp;
        if(temp >= 50){
            level ++;
            temp = 0;
        }
        return damage;
    }

    public void powerUp(int num){
        if(num == 1){
            health = health * 2;
            System.out.println("Dragon's health have been increased to " + health);
        }
        if(num == 2){
            strength = strength * 2;
            System.out.println("Dragon's strength have been increased to " + strength);
        }
    }

    public String toString(){
        return "dragon:\n Strength = " + strength + "\nHealth = " + health + "\nLevel = " + level +  "\nDead = " + dead + "\nAttack Damage = " + strength * level;

    }
}
