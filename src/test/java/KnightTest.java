import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.heroes.Knight;
import weapons.Axe;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword weapon;

    @Before
    public void before() throws Exception {
        weapon = new Sword(5);
        knight = new Knight("Sir Lancelot", 20, weapon);
    }

    @Test
    public void hasWeapon() {
        assertEquals(weapon, knight.getWeapon());
    }

    @Test
    public void canChangeWeapon(){
        Axe axe = new Axe(6);
        knight.setWeapon(axe);
        assertEquals(axe, knight.getWeapon());
    }

    @Test
    public void canAttackEnemy() {
        Orc enemy = new Orc("Bill", 20);
        knight.attack(enemy);
        assertEquals(15, enemy.getHealth());
    }

    @Test
    public void canTakeHalfDamage(){
        knight.takeDamage(25);
        assertEquals(8, knight.getCurrentHealth());
    }
}
