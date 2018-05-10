package treasures;

public class Treasure {
    TreasureType type;

    public Treasure(TreasureType type) {
        this.type = type;
    }

    public TreasureType getType() {
        return type;
    }

    public int getValueFromEnum() {
        return type.getTreasureValue();
    }
}
