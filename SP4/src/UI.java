import java.util.Scanner;

public class UI {
    Scanner scan = new Scanner(System.in);
    Warrior warrior;
    Controller controller;
    PCController pcController;
    boolean endGame = false;

    public UI() {
        System.out.println("What is your name, brave warrior?");
        String name = scan.nextLine();
        warrior = new Warrior(name);
        warrior.equipItem(new Items(1));
        warrior.equipItem(new Items(0));
        controller = new Controller(warrior);
        pcController = new PCController(warrior);
        menu();
    }

    private void menu() {
        while (!endGame){
            System.out.println("What do you want to do?");
            System.out.println("1. Look at your character?");
            System.out.println("2. Room control?");
            System.out.println("0. End the game?");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    pcController.characterChoices();
                    break;
                case 2:
                    controller.roomChoices();
                    break;
                case 3:
                    System.out.println("Thanks for playing the game");
                    endGame = true;
                    break;
            }
        }
    }
}
