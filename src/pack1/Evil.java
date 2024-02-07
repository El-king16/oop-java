package pack1;

public class Evil {
    private String type;
    private int damage;
    private int gold;

    public Evil(String type, int damage, int gold) {
        this.type = type;
        this.damage = damage;
        this.gold = gold;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getGold() {
        return gold;
    }
}
