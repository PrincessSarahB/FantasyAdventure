import mythicalCreatures.Dragon;
import mythicalCreatures.Ogre;
import org.junit.Before;
import org.junit.Test;
import sun.java2d.opengl.OGLRenderQueue;

import static org.junit.Assert.assertEquals;

public class MythicalCreatureTest {

    Ogre ogre;
    Dragon dragon;

    @Before
    public void before() throws Exception {
        ogre = new Ogre("Shrek");
        dragon = new Dragon("Norbert");
    }

    @Test
    public void hasName() {
        assertEquals("Shrek", ogre.getName());
        assertEquals("Norbert", dragon.getName());
    }
}
