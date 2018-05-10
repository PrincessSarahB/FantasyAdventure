package enemies;

import interfaces.Damageable;

public abstract class Enemy implements Damageable {

    private String name;
    private int damage;
    private int health;

    public Enemy(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public void attack(Damageable player){
        player.takeDamage(this.damage);
    }
}
