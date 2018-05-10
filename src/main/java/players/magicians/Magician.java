package players.magicians;

import mythicalCreatures.MythicalCreature;
import players.Player;
import spells.Spell;

public abstract class Magician extends Player {

    private Spell spell;
    private MythicalCreature mythicalCreature;


    public Magician(String name, int maxHealth, Spell spell, MythicalCreature mythicalCreature) {
        super(name, maxHealth);
        this.spell = spell;
        this.mythicalCreature = mythicalCreature;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public MythicalCreature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(MythicalCreature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }
}
