public abstract class PC extends Character {
    int experience = 0;
    int damageTaken = 0;
    Items weapon;
    Items armor;


    public PC() {
    }

    abstract void gainExperience(int experience);
    abstract void equipItem(Items item);
}
