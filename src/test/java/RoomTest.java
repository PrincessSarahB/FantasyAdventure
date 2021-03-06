import healingTools.HealingTool;
import healingTools.HealingToolType;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import rooms.EnemyRoom;
import rooms.TreasureRoom;
import treasures.Treasure;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    TreasureRoom treasureRoom;
    EnemyRoom enemyRoom;
    Cleric cleric;
    Cleric cleric2;
    HealingTool healingTool;

    @Before
    public void before() throws Exception {
        treasureRoom = new TreasureRoom("Treasure room");
        enemyRoom = new EnemyRoom("Enemy room");
        healingTool = new HealingTool(HealingToolType.HERB);
        cleric = new Cleric("Bob", 10, healingTool);
        cleric2 = new Cleric("Bob", 10, healingTool);
    }

    @Test
    public void hasName() {
        assertEquals("Treasure room", treasureRoom.getName());
        assertEquals("Enemy room", enemyRoom.getName());
    }

    @Test
    public void canAddPlayerToRoom() {
        treasureRoom.addPlayerToRoom(cleric);
        assertEquals(1, treasureRoom.getPlayerCount());
    }

    @Test
    public void canCreateRandomTreasureForEachPlayer() {
        treasureRoom.addPlayerToRoom(cleric);
        treasureRoom.addPlayerToRoom(cleric);
        treasureRoom.addPlayerToRoom(cleric);
        treasureRoom.addPlayerToRoom(cleric);
        assertEquals(4, treasureRoom.treasureCount());
    }

    @Test
    public void playersCanCollectTreasure() {
        treasureRoom.addPlayerToRoom(cleric);
        treasureRoom.addPlayerToRoom(cleric2);
        assertEquals(2, treasureRoom.treasureCount());
        treasureRoom.playersCollectTreasure();
        assertEquals(1, cleric.getTreasureCount());
        assertEquals(0, treasureRoom.treasureCount());
        assertEquals(true, treasureRoom.completed());
    }

}
