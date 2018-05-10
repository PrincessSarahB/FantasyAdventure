import mythicalCreatures.Dragon;
import mythicalCreatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;
import players.magicians.Wizard;
import spells.FireBall;
import spells.LightningStrike;
import spells.Spell;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    MythicalCreature mythicalCreature;
    Spell spell;

    @Before
    public void before() throws Exception {
        spell = new LightningStrike(5);
        mythicalCreature = new Dragon("Draco");
        wizard = new Wizard("Gandalf", 30, spell, mythicalCreature );
    }

    @Test
    public void hasSpell() {
        assertEquals(spell, wizard.getSpell());
    }

    @Test
    public void canChangeSpell(){
        Spell differentSpell = new FireBall(6);
        wizard.setSpell(differentSpell);
        assertEquals(differentSpell, wizard.getSpell());
    }
}
