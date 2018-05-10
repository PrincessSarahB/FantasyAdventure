package rooms;

import players.Player;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    protected ArrayList<Player> players;

    public Room(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        ArrayList<Player> copy = new ArrayList<>(players);
        return copy;
    }

    public int getPlayerCount() {
        return players.size();
    }

    public void addPlayerToRoom(Player player) {
        players.add(player);
    }

}
