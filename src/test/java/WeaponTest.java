import org.junit.Before;
import org.junit.Test;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    Sword sword;

    @Before
    public void before() throws Exception {
        sword = new Sword(2);
    }

    @Test
    public void hasDamage() {
        assertEquals(2, sword.getDamage());
    }
}
