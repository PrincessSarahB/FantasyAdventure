package healingTools;

public class HealingTool {

    HealingToolType healingToolType;

    public HealingTool(HealingToolType healingToolType) {
        this.healingToolType = healingToolType;
    }

    public int getHealingValueFromEnum() {
        return this.healingToolType.getHealingValue();
    }
}
