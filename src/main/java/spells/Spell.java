package spells;

public abstract class Spell {

    int damage;

    public Spell(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
