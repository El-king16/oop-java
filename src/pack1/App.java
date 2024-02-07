package pack1;
import pack1.Hero;
import pack1.Evil;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Hero[] arrhero = new Hero[3];
        Evil[] arrevil = new Evil[3];
        arrhero[0] = new Hero("King", 500, "Небесный луч", 1000, 12312768);
        arrhero[1] = new Hero("Knight", 300, "Накапливаемое кровотечение", 550, 2000);
        arrhero[2] = new Hero("Unit", 150, "Выпад", 200, 1000);
        System.out.println("-----ГЕРОИ-----------------ГЕРОИ-------------------ГЕРОИ-----");
        for (Hero e : arrhero) {
            System.out.println(e.getType() + ", " + e.getHp() + " здоровья");
            System.out.println("Навык: "+e.getSkill()+", наносит "+e.getDamage()+" единиц здоровья");
            if (Objects.equals(e.getType(), "King")){
                System.out.println("Золото в казне: "+e.getGold());
            }else {
                System.out.println("Золото в банке: "+e.getGold());
            }
            System.out.println("-------------------------------------------------------------");
        }
        System.out.println("----ЗЛОДЕИ-----------------ЗЛОДЕИ------------------ЗЛОДЕИ----");
        arrevil[0] = new Evil("Dark Knight", 1000, 70000);
        arrevil[1] = new Evil("Necromancer", 500, 3223);
        arrevil[2] = new Evil("Zombie", 30, 1);
        for (Evil r : arrevil){
            System.out.println("Злодей: "+r.getType()+" с уроном = "+r.getDamage()+ " единиц здоровья");
            System.out.println("Выпадает "+r.getGold()+" золота");
            System.out.println("-------------------------------------------------------------");
        }
    }
}
