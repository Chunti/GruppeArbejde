import java.util.Random;

public class Items {
    String name;
    int damage;
    int hp;
    int defence;
    boolean weapon = false;
    ItemRoller itemRoller = new ItemRoller();

    public Items() {
        Integer[] data;
        int roll = (int)(200*Math.random()+1);
        if (roll > 100) weapon = true;
        if (roll > 190){
            data = itemRoller.epicItem();
            name = "Epic Sword";
        }
        else if(roll > 170){
            data = itemRoller.rareItem();
            name = "Rare Sword";
        }
        else if(roll > 140){
            data = itemRoller.uncommonItem();
            name = "Uncommon Sword";
        }
        else if(roll > 100){
            data = itemRoller.commonItem();
            name = "Common Sword";
        }
        else if(roll > 90){
            data = itemRoller.epicArmor();
            name = "Epic Armor";
        }
        else if(roll > 70){
            data = itemRoller.rareArmor();
            name = "Rare Armor";
        }
        else if(roll > 40){
            data = itemRoller.uncommonArmor();
            name = "Uncommon Armor";
        }
        else{
            data = itemRoller.commonArmor();
            name = "Common Armor";
        }

        damage = data[0];
        hp = data[1];
        defence = data[2];

    }

}
