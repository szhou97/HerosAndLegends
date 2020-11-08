public class Weapon extends Item {
    private final int damage;
    private final int hand;
    public Weapon(String name, int price, int minLevel, int damage, int hand) {
        super(name, price, minLevel);
        this.damage = damage;
        this.hand = hand;
    }

    public int getBaseDamage() {
        return this.damage;
    }

    public int getNumberHands() {
        return this.hand;
    }
    
}
