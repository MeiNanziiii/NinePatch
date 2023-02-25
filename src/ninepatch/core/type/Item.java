package ninepatch.core.type;

import ninepatch.core.type.properties.ItemProperties;
import ninepatch.game.Anim;
import ninepatch.game.Plant;
import ninepatch.game.Tech;

import java.util.List;

public class Item {
    public String id;
    public String sprite;
    public Integer maxCarry;
    public List<String> craftedIn;
    public Float craftTime;
    public Integer craftingQuantity;
    public List<ItemStack> requires;
    public List<Object> actions;
    public Anim useAnimName;
    public Integer durability;
    public Integer minMeleeDamage;
    public Integer maxMeleeDamage;
    public Tech techReq;
    public Boolean recyclable;
    public Boolean notStackable;
    public Boolean rotatable;
    public Plant growsInto;
    public List<BonusItem> craftingBonusItems;
    public List<String> growSprites;
    public Float placementSpriteScale;
    public Vector2 placementSpriteOffset;
    public List<Vector2> proxyTiles;
    public Integer researchPoints;

    public Item(String id, String sprite, ItemProperties properties) {
        this.id = id;
        this.sprite = sprite;
        this.maxCarry = properties.maxCarry;
        this.craftedIn = properties.craftedIn;
        this.craftTime = properties.craftTime;
        this.craftingQuantity = properties.craftingQuantity;
        if (!properties.requires.isEmpty()) {
            this.requires = properties.requires;
        }
        if (!properties.actions.isEmpty()) {
            this.actions = properties.actions;
        }
        this.useAnimName = properties.useAnimName;
        this.durability = properties.durability;
        this.minMeleeDamage = properties.minMeleeDamage;
        this.maxMeleeDamage = properties.maxMeleeDamage;
        this.techReq = properties.techReq;
        this.recyclable = properties.recyclable;
        this.notStackable = properties.notStackable;
        this.rotatable = properties.rotatable;
        this.growsInto = properties.growsInto;
        if (!properties.craftingBonusItems.isEmpty()) {
            this.craftingBonusItems = properties.craftingBonusItems;
        }
        if (!properties.growSprites.isEmpty()) {
            this.growSprites = properties.growSprites;
        }
        this.placementSpriteScale = properties.placementSpriteScale;
        this.placementSpriteOffset = properties.placementSpriteOffset;
        if (!properties.proxyTiles.isEmpty()) {
            this.proxyTiles = properties.proxyTiles;
        }
        this.researchPoints = properties.researchPoints;
    }
}
