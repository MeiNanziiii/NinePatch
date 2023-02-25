package ninepatch.core.type;

public class ItemDropperAction {
    public final String type = "createItemDropper";
    public String value;
    public Float buildTime;

    public ItemDropperAction(String value, Float buildTime) {
        this.value = value;
        this.buildTime = buildTime;
    }
}
