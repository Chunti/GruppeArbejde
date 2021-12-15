public class Rooms {
    boolean stairsFound = false;
    int floor;
    int koboldDiggerChance;
    int ogreHenchmanChance;
    int stairsChance;
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
        stairsChance = 30;
    }

    private void createHardLevel() {
        koboldDiggerChance = 50;
        ogreHenchmanChance = 30;
        stairsChance = 20;
    }

    private void createBossLevel() {

    }

    public boolean searchRoom(){
        if(stairsFound){
            stairsChance = 0;
        }
        int numberroller = koboldDiggerChance+ogreHenchmanChance+stairsChance;
        int roll = (int)(numberroller*Math.random()+1);
        if(roll >koboldDiggerChance+ogreHenchmanChance) {
            this.stairsFound =true;
            System.out.println("You found the stair to the next room.");
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
