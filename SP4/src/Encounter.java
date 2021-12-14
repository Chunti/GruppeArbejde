public class Encounter {
    PC player;
    OgreHenchman ogreHenchman;
    KoboldDigger koboldDigger;
    Battle battle;

    public Battle createBattle(PC player, int number) {
        this.player = player;
        if (number == 1) battle = new Battle(player,ogreHenchman = new OgreHenchman(player.lvl));
        else battle = new Battle(player,koboldDigger = new KoboldDigger(player.lvl));
        return battle;
    }

    public void nextFloorFound() {

    }

    public Battle getBattle() {
        return battle;
    }
}
