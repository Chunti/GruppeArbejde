public class Warrior extends PC{
    public Warrior(String name) {
        super.name = name;
        super.lvl = 1;
        super.hp = 50;
        super.strength = 10;
        super.defence = 10;

    }

    @Override
    public void setHp(int hp) {
        super.hp = hp;
    }

    @Override
    public void setStrength(int strength) {
        super.strength = strength;
    }

    @Override
    public void setDefence(int defence) {
        super.defence = defence;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    void gainExperience(int experience) {
        super.experience += experience;
        int nextLvl = 500+(lvl*150);
        if(super.experience>nextLvl){
            super.experience -= nextLvl;
            lvl +=1;
            hp += 2;
            strength += 2;
            defence += 1;
            System.out.println("Level up! You are now level " + lvl);
        }
    }

    @Override
    void equipItem(Items item) {
        if (item.weapon==true){
            this.weapon = item;
        }
        else this.armor = item;
    }


}
