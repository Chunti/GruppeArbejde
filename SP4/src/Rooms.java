public class Rooms {
    boolean stairsFound = false;
    int floor;
    int koboldDiggerChance;
    int ogreHenchmanChance;
    PC player;
    Encounter encounter;

    public Rooms(int floor, PC player) {
        this.floor = floor;
        this.player = player;

        if(floor == 6) createBossLevel();
        else if(floor >3) createHardLevel();
        else if(floor == 0) createRestingSpot();
        else createRoom();

    }

    private void createRestingSpot() {
        stairsFound = true;
    }

    private void createRoom() {
        koboldDiggerChance = 70;
    }

    private void createHardLevel() {
        koboldDiggerChance = 50;
        ogreHenchmanChance = 30;
    }

    private void createBossLevel() {

    }

    public boolean searchRoom(){
        int roll = (int)(100*Math.random()+1);
        if(roll >koboldDiggerChance+ogreHenchmanChance) {
            stairsFound =true;
            encounter.nextFloorFound();
            return false;
        }
        else if(roll > koboldDiggerChance){
            encounter = new Encounter();
            encounter.createBattle(player, 1);
        }
        else {
            encounter = new Encounter();
            encounter.createBattle(player,0);
        }
        return true;
    }
    public void goToRestingSpot(){
        player.damageTaken = 0;
    }

    public Battle getBattle() {
        return encounter.getBattle();
    }




}
