package players;

import treasures.Treasure;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int health;
    private ArrayList<Treasure> treasure;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.treasure = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getTreasureCount(){
        return this.treasure.size();
    }
}
