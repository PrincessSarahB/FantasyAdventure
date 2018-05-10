import healingTools.HealingTool;
import healingTools.HealingToolType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {

    HealingTool healingTool;

    @Before
    public void before() throws Exception {
        healingTool = new HealingTool(HealingToolType.SMALLPOTION);
    }

    @Test
    public void canGetHealingValueFromEnum() {
        assertEquals(4, healingTool.getHealingValueFromEnum());
    }
}
