package ninepatch.core.type.properties;

import ninepatch.core.type.*;
import ninepatch.game.Anim;
import ninepatch.game.Plant;
import ninepatch.game.Tech;

import java.util.ArrayList;
import java.util.List;

public class ItemProperties {
    public Integer maxCarry;
    public List<String> craftedIn = new ArrayList<>();
    public Float craftTime;
    public Integer craftingQuantity;
    public List<ItemStack> requires = new ArrayList<>();
    public List<Object> actions = new ArrayList<>();
    public Anim useAnimName;
    public Integer durability;
    public Integer minMeleeDamage;
    public Integer maxMeleeDamage;
    public Tech techReq;
    public Boolean recyclable;
    public Boolean notStackable;
    public Boolean rotatable;
    public Plant growsInto;
    public List<BonusItem> craftingBonusItems = new ArrayList<>();
    public List<String> growSprites = new ArrayList<>();
    public Float placementSpriteScale;
    public Vector2 placementSpriteOffset;
    public List<Vector2> proxyTiles = new ArrayList<>();
    public Integer researchPoints;
}
