import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.heroes.Barbarian;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Club club;
    Orc orc;

    @Before
    public void before() throws Exception {
        club = new Club(4);
        orc = new Orc("Bob", 10);
        barbarian = new Barbarian("Bob", 20, club);
    }

    @Test
    public void canAttackDoubleDamage() {
        barbarian.attack(orc);
        assertEquals(12, orc.getHealth());
    }
}
