package rooms;

import enemies.Orc;
import enemies.Troll;
import treasures.Treasure;

public class EnemyRoom extends Room {

    Orc orc;
    Troll troll;

    public EnemyRoom(String name) {
        super(name);
        orc = new Orc("Orcy", 5);
        troll = new Troll("Trolly", 7);
    }

    public Orc getOrc() {
        return orc;
    }

    public Troll getTroll() {
        return troll;
    }

    public boolean completed() {
        return orc.isDead() && troll.isDead();
    }
}
