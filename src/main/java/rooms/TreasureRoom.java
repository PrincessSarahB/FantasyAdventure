package rooms;

import players.Player;
import treasures.Treasure;
import treasures.TreasureType;

import java.util.ArrayList;

public class TreasureRoom extends Room {

    private ArrayList<Treasure> treasures;

    public TreasureRoom(String name) {
        super(name);
        treasures = new ArrayList<>();
    }


    public int treasureCount() {
        return treasures.size();
    }

    public void addPlayerToRoom(Player player) {
        this.players.add(player);
        treasures.add(new Treasure(TreasureType.getRandomTreasureType()));
    }

    public void playersCollectTreasure() {
        for (Player player : players) {
            player.pickUpTreasure(treasures.remove(0));
        }
    }

    public boolean completed() {
        return treasureCount() == 0 && getPlayerCount() > 0;
    }
}
