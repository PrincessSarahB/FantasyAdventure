import enemies.Orc;
import enemies.Troll;
import healingTools.HealingTool;
import healingTools.HealingToolType;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Orc orc;
    Troll troll;
    Cleric cleric;
    HealingTool healingTool;

    @Before
    public void before() throws Exception {
        orc = new Orc("Orcy", 3);
        troll = new Troll("Trolly", 5);
        healingTool = new HealingTool(HealingToolType.HERB);
        cleric = new Cleric("Jim", 30,healingTool );
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

    @Test
    public void canTakeDamage(){
        orc.takeDamage(10);
        assertEquals(10, orc.getHealth());
    }

    @Test
    public void canAttack(){
        orc.attack(cleric);
        assertEquals(27, cleric.getCurrentHealth());

    }
}
