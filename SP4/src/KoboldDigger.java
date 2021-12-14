public class KoboldDigger extends Enemies{

    public KoboldDigger(int playerlvl){
        int lvl = (int) (5*Math.random() + (2-playerlvl));
        if(lvl < 1) lvl =1;

        super.name = "Kobold Digger";
        super.hp = 10 + (2*lvl);
        super.strength = 2 + lvl;
        super.defence = 3 + lvl;
        super.experience = 100 + (50*lvl);
        super.lvl = lvl;
    }

    public int specialAttack(){
        return strength+5 + (lvl/2);
    }
}
