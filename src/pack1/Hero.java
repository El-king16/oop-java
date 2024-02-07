package pack1;

public class Hero {
    private String type;
    private int hp;
    private String skill;
    private int damage;
    private int gold;

    public Hero(String type, int hp, String skill, int damage, int gold){
        this.type = type;
        this.hp = hp;
        this.skill = skill;
        this.damage = damage;
        this.gold = gold;
    }

    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public String getSkill() {
        return skill;
    }

    public int getDamage() {
        return damage;
    }

    public int getGold() {
        return gold;
    }
}
