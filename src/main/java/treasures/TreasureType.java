package treasures;

public enum TreasureType {

    GOLDCOIN(1),
    GOLDBAR(5),
    RUBY(3),
    SAPPHIRE(4),
    EMERALD(5),
    DIAMOND(8);

    private final int treasureValue;

    TreasureType(int treasureValue) {
        this.treasureValue = treasureValue;
    }

    public int getTreasureValue() {
        return treasureValue;
    }
}
