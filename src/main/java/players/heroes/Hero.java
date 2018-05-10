package players.heroes;

import interfaces.Damageable;
import players.Player;
import weapons.Weapon;

public abstract class Hero extends Player{

    public Weapon weapon;
    public Hero(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth);
        this.weapon = weapon;

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getWeaponDamage(){
      return this.weapon.getDamage();
    }

    public void attack(Damageable enemy){
        enemy.takeDamage(getWeaponDamage());
    }
}
