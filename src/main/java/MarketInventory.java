/**
 * The market inventory is initialized with every item in the game, and the 
 * items of the market cannot be modified.
 */
public class MarketInventory extends Inventory {
    public MarketInventory (
        ElementCollection weapons,
        ElementCollection armors,
        ElementCollection potions,
        ElementCollection spells
    ) 
    {
        super(TypeInfo.ALL_TYPES);
        this.inventory.put("weaponry", weapons);
        this.inventory.put("armory", armors);
        this.inventory.put("potions", potions);
        this.inventory.put("spells", spells);
    }
}
