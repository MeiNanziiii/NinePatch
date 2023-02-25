package ninepatch.core.type;

import ninepatch.game.BuildActionType;
import ninepatch.game.Building;

public class BuildAction {
    public BuildActionType type;
    public Building value;
    public Float buildTime;
    public Boolean buildNoAdjacentIndicator;

    public BuildAction(BuildActionType type, Building value, Float buildTime) {
        this.type = type;
        this.value = value;
        this.buildTime = buildTime;
    }
    public BuildAction(BuildActionType type, Building value, Float buildTime, Boolean buildNoAdjacentIndicator) {
        this.type = type;
        this.value = value;
        this.buildTime = buildTime;
        this.buildNoAdjacentIndicator = buildNoAdjacentIndicator;
    }
}
