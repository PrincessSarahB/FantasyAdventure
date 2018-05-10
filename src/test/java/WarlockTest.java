import org.junit.Before;
import org.junit.Test;
import players.magicians.Warlock;
import spells.FireBall;
import spells.LightningStrike;
import spells.Spell;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Spell spell;

    @Before
    public void before() throws Exception {
        spell = new LightningStrike(5);
        warlock = new Warlock("Saruman", 40, spell);
    }

    @Test
    public void hasSpell() {
        assertEquals(spell, warlock.getSpell());
    }

    @Test
    public void canChangeSpell(){
        Spell differentSpell = new FireBall(6);
        warlock.setSpell(differentSpell);
        assertEquals(differentSpell, warlock.getSpell());
    }
}
