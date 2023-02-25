package ninepatch.core.type;

public class BonusItem {
    public String itemId;
    public Integer amount;
    public Float probability;

    public BonusItem(Item item, Integer amount, Float probability) {
        this.itemId = item.id;
        this.amount = amount;
        this.probability = probability;
    }
}
