package players.magicians;

import enemies.Enemy;
import interfaces.Damageable;
import mythicalCreatures.MythicalCreature;
import spells.Spell;

public class Warlock extends Magician {

    public Warlock(String name, int maxHealth, Spell spell, MythicalCreature mythicalCreature) {
        super(name, maxHealth, spell, mythicalCreature);
    }


    public void attackWithCreature(Enemy enemy) {
        getMythicalCreature().attack(enemy);
    }
}
