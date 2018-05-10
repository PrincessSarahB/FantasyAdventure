package players.magicians;

import players.Player;
import spells.Spell;

public abstract class Magician extends Player {

    private Spell spell;


    public Magician(String name, int maxHealth, Spell spell) {
        super(name, maxHealth);
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}
