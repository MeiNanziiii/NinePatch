package ninepatch.core.type;

public class ItemStack {
    public String id;
    public Integer quantity;

    public ItemStack(Item item, Integer quantity) {
        this.id = item.id;
        this.quantity = quantity;
    }
}
