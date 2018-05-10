package players.heroes;

import treasures.Treasure;
import weapons.Weapon;

public class Dwarf extends Hero {
    public Dwarf(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    public int getTotalTreasureValue() {
        int total = 0;
        for (Treasure item : getTreasure()) {
            total += item.getValueFromEnum();
        }
        return total * 2;
    }


}