import org.junit.Before;
import org.junit.Test;
import treasures.Treasure;
import treasures.TreasureType;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure ruby;
    Treasure goldBar;

    @Before
    public void before() throws Exception {
        ruby = new Treasure(TreasureType.RUBY);
        goldBar = new Treasure(TreasureType.GOLDBAR);
    }

    @Test
    public void hasType() {
        assertEquals(TreasureType.RUBY, ruby.getType());
        assertEquals(TreasureType.GOLDBAR, goldBar.getType());
    }

    @Test
    public void hasValue() {
        assertEquals(3, ruby.getValueFromEnum());
        assertEquals(5, goldBar.getValueFromEnum());
    }
}
