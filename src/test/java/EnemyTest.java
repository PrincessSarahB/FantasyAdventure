import enemy.Orc;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orc;
    Troll troll;

    @Before
    public void before() throws Exception {
        orc = new Orc("Orcy", 3);
        troll = new Troll("Trolly", 5);
    }

    @Test
    public void hasName() {
        assertEquals("Orcy", orc.getName());
        assertEquals("Trolly", troll.getName());
    }

    @Test
    public void hasDamage() {
        assertEquals(3, orc.getDamage());
        assertEquals(5, troll.getDamage());
    }
}
