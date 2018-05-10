package players.heroes;

import weapons.Weapon;

public class Knight extends Hero {
    public Knight(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    public void takeDamage(int damage){
        setCurrentHealth(Math.round(getCurrentHealth() - (damage/2)));
    }

}
