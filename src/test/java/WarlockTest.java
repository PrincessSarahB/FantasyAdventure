import enemies.Enemy;
import enemies.Orc;
import mythicalCreatures.Dragon;
import mythicalCreatures.MythicalCreature;
import mythicalCreatures.Ogre;
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
    MythicalCreature mythicalCreature;
    Enemy enemy;

    @Before
    public void before() throws Exception {
        spell = new LightningStrike(5);
        mythicalCreature = new Dragon("Smaug");
        warlock = new Warlock("Saruman", 40, spell, mythicalCreature);
        enemy = new Orc("Grog", 5);
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

    @Test
    public void hasMythicalCreature(){
        assertEquals(mythicalCreature, warlock.getMythicalCreature());
    }

    @Test
    public void canChangeMythicalCreature(){
        MythicalCreature mythicalCreature2 = new Ogre("Shrek");
        warlock.setMythicalCreature(mythicalCreature2);
        assertEquals(mythicalCreature2, warlock.getMythicalCreature());
    }

    @Test
    public void canBeDefendedByMythicalCreature(){
        assertEquals("Smaug guards with huge wings!", warlock.defended());
    }

    @Test
    public void canCastSpell() {
        warlock.castSpell(enemy);
        assertEquals(15, enemy.getHealth());
    }

    @Test
    public void canUseCreatureToAttack() {
        warlock.attackWithCreature(enemy);
        assertEquals(5, enemy.getHealth());
    }
}
