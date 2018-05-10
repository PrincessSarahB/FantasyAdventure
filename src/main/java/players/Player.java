package players;

import interfaces.Damageable;
import interfaces.Healable;
import treasures.Treasure;

import java.util.ArrayList;

public abstract class Player implements Damageable, Healable {
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

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getTreasureCount() {
        return this.treasure.size();
    }

    public void pickUpTreasure(Treasure treasure) {
        this.treasure.add(treasure);
    }

//    public int getTotalTreasureValue() {
//
//    }

    public void takeDamage(int damage) {
        this.currentHealth -= damage;
    }

    public void beHealed(int healValue){
        this.currentHealth += healValue;
    }

}


