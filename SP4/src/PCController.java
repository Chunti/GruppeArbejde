import java.util.Scanner;

public class PCController {
    Scanner scan = new Scanner(System.in);
    PC player;
    Inventory inventory;
    Kagtha kagtha = new Kagtha();
    MissMayhem missMayhem = new MissMayhem();
    boolean repeat;

    public PCController(PC player) {
        this.player = player;
        inventory = new Inventory();
    }

    public void characterChoices() {
        repeat = true;
        while(repeat){
            System.out.println("What do you want to do?");
            System.out.println("1. Check your inventory?");
            System.out.println("2. Equip another item?");
            System.out.println("3. Interact with Others in the room?");
            System.out.println("0. Go back to the main menu?");

            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    player.inventory.showItems();
                    break;
                case 2:
                    System.out.println("Which item do you want to equip?");
                    int number = scan.nextInt();
                    player.equipItem(player.inventory.getItem(number));
                    break;
                case 3:
                    if(Controller.currentRoom == 0) interactWithNPC();
                    else System.out.println("There are no others in the room... of what you know of.");
                    break;
                case 0:
                    repeat = false;
                    break;
            }
        }
    }

    private void interactWithNPC() {
        System.out.println("Who do you want to talk to?");
        System.out.println("1. Kagtha?");
        System.out.println("2. Miss Mayhem?");
        System.out.println("0. Go back to main menu?");

        int choice = scan.nextInt();
        switch (choice){
            case 1:
                kagthaInteractions();
                break;
            case 2:
                missMayhemInteractions();
                break;
            case 0:
                break;
        }

    }

    private void missMayhemInteractions() {
        missMayhem.dialog1();
        System.out.println("1. Talk to her?");
        System.out.println("0. Go back to main menu");

        int choice = scan.nextInt();
        switch (choice){
            case 1:
                missMayhem.dialog4();
                break;
            case 0:
                break;
        }
    }

    private void kagthaInteractions() {
        kagtha.dialog3();
        System.out.println("1. Talk to her?");
        System.out.println("0. Go back to main menu");

        int choice = scan.nextInt();
        switch (choice){
            case 1:
                kagtha.dialog1();
                break;
            case 0:
                break;
        }
    }
}
