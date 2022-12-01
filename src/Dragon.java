public class Dragon {
    private int health;
    private int strength;
    private int level;
    private boolean dead;

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
        System.out.println( "The dragon attacks for " + damage + " health points!");
        return damage;
    }

    public String
}
