package players.magicians;

import mythicalCreatures.MythicalCreature;
import spells.Spell;

public class Wizard extends Magician {

    public Wizard(String name, int maxHealth, Spell spell, MythicalCreature mythicalCreature) {
        super(name, maxHealth, spell, mythicalCreature);
    }
}
