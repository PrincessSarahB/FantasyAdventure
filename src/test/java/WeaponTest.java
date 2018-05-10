import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Club;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    Sword sword;
    Club club;
    Axe axe;


    @Before
    public void before() throws Exception {
        sword = new Sword(2);
        axe = new Axe(4);
        club = new Club(3);
    }

    @Test
    public void hasDamage() {
        assertEquals(2, sword.getDamage());
        assertEquals(4, axe.getDamage());
        assertEquals(3, club.getDamage());
    }
}
