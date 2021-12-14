public abstract class Character {
    String name;
    int hp;
    int strength;
    int defence;
    int lvl;
    Inventory inventory = new Inventory();

    public void setName(String name) {}

    public void setHp(int hp) {

    }

    public void setStrength(int strength) {

    }

    public void setDefence(int defence) {

    }

    public String getName() {return name;}

    public int getHp() {
        return hp;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefence() {
        return defence;
    }
    public void addLvl() { lvl +=1;}

}
