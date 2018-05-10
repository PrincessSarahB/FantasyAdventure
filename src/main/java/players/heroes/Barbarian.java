package players.heroes;

import interfaces.Damageable;
import weapons.Weapon;

public class Barbarian extends Hero {
    public Barbarian(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    public void  attack(Damageable enemy) {
        enemy.takeDamage(getWeaponDamage()*2);
    }
}
