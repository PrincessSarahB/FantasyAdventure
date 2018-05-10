import org.junit.Before;
import org.junit.Test;
import spells.FireBall;
import spells.LightningStrike;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    LightningStrike lightningStrike;
    FireBall fireBall;

    @Before
    public void setUp() throws Exception {
        lightningStrike = new LightningStrike(5);
        fireBall = new FireBall(6);
    }

    @Test
    public void hasDamage() {
        assertEquals(5, lightningStrike.getDamage());
        assertEquals(6, fireBall.getDamage());
    }
}
