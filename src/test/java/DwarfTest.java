import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.heroes.Barbarian;
import players.heroes.Dwarf;
import treasures.Treasure;
import treasures.TreasureType;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class DwarfTest {


    Dwarf dwarf;
    Club club;
    Orc orc;

    @Before
    public void before() throws Exception {
        club = new Club(4);
        orc = new Orc("Bob", 10);
        dwarf = new Dwarf("Bob", 20, club);
    }

    @Test
    public void canAttack() {
        dwarf.attack(orc);
        assertEquals(16, orc.getHealth());
    }

    @Test
    public void canPickUpTreasure() {
        Treasure treasure = new Treasure(TreasureType.EMERALD);
        dwarf.pickUpTreasure(treasure);
        assertEquals(1, dwarf.getTreasureCount());
    }
}
