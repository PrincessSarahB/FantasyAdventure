package healingTools;

public enum HealingToolType {
    HERB(2),
    SMALLPOTION(4),
    LARGEPOTION(6);

    private final int healingValue;

    HealingToolType(int healingValue) {
        this.healingValue = healingValue;
    }

    public int getHealingValue() {
        return healingValue;
    }
}
