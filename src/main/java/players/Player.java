package players;

import treasures.Treasure;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int maxHealth;
    private int currentHealth;
    private ArrayList<Treasure> treasure;

    public Player(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.treasure = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getTreasureCount(){
        return this.treasure.size();
    }

    public void takeDamage(int damage){
        this.currentHealth -= damage;
    }
}
