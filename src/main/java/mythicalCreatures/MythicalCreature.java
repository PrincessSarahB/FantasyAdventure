package mythicalCreatures;

import interfaces.Damageable;
import interfaces.Defendable;

public abstract class MythicalCreature implements Defendable {

    private String name;
    private int damage;

    public MythicalCreature(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(Damageable enemy) {
        enemy.takeDamage(damage);
    }
}
