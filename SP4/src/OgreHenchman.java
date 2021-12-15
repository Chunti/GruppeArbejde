public class OgreHenchman extends Enemies{

    public OgreHenchman(int playerlvl){
        int lvl = (int) (5*Math.random() + (playerlvl-2));
        if(lvl < 1) lvl =1;

        super.name = "Ogre Henchman";
        super.hp = 15 + (4*lvl);
        super.strength = 6 + lvl;
        super.defence = 2 + lvl;
        super.experience = 200 + (75*lvl);
        super.lvl = lvl;
    }
}

