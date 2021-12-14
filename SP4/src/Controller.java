import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<Rooms> rooms = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    static int currentRoom = 0;
    Battle battle;
    PC player;
    boolean repeat = true;


    public Controller(PC player) {
        this.player = player;
        rooms.add(new Rooms(0,player));
    }

    public void roomChoices(){
        while (repeat){
            System.out.println("You are in room " + currentRoom + ". What do you want to do?");
            System.out.println("1. Search room for stairs or monsters?");
            System.out.println("2. Go to the resting spot?");
            System.out.println("3. Go to the next room?");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    boolean enemyFound = false;
                    if(currentRoom!=0) enemyFound = rooms.get(currentRoom).searchRoom();
                    else System.out.println("You are in the resting spot, you can't search here.");

                    if(enemyFound) battleChoices();

                    break;
                case 2:
                    rooms.get(currentRoom).goToRestingSpot();
                    System.out.println("Your health is now healed");
                    currentRoom = 0;
                    break;
                case 3:
                    if(!rooms.get(currentRoom).stairsFound)
                        System.out.println("You have not found the stairs on this level just yet. Try searching for it");
                    else{
                        currentRoom +=1;
                        rooms.add(new Rooms (currentRoom,player));
                        System.out.println("You are now on floor " + currentRoom + ".");
                    }
                    break;
                case 0:
                    repeat = false;
                    break;
            }
        }
    }

    public void battleChoices(){
        boolean playerIsDead = false;
        boolean enemyDead = false;

        while(!playerIsDead && !enemyDead){
            System.out.println("You are in a battle. What do you want to do?");
            System.out.println("1. Attack the enemy");
            System.out.println("2. Try to flee from the battle");
            battle = rooms.get(currentRoom).getBattle();

            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    enemyDead = battle.attackEnemies();
                    if(!enemyDead) playerIsDead = battle.attackPlayer();
                    else battle.finishBattle();
                    break;
                case 2:
                    if(battle.flee()) System.out.println("You got away safely");
                    else {
                        System.out.println("You couldn't get away");
                        playerIsDead = battle.attackPlayer();
                    }
                    break;
            }
            if(playerIsDead) GameOver();
        }
    }

    private void GameOver() {
        System.out.println("You died in battle. You will be remembered..." );
        System.exit(0);
    }
}
