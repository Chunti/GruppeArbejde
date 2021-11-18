import java.util.Scanner;

public class UI {
    private Scanner scan = new Scanner(System.in);
    private int userInput;
    Controller controller = new Controller();

    public void mainMenu(){
        System.out.println("Welcome to the tournament program. Enter which section you want to enter:");
        System.out.println("1. Team menu");
        System.out.println("2. Tournament menu");
        System.out.println("3. Match menu");
        userInput = scan.nextInt();

        switch (userInput){
            case 1:
                teamMenu();
                break;
            case 2:
                tournamentMenu();
                break;
            case 3:
                matchMenu();
                break;
            default:
                System.out.println("Invalid input, please try again.");
        }


    }
    private void teamMenu() {
        System.out.println("TEAM MENU");
        System.out.println("1.Register team");
        System.out.println("2.Read team");
        userInput = scan.nextInt();

        switch (userInput){
            case 1:
                controller.createTeam();
                break;
            case 2:
                System.out.println("Which team do you want to see?");
                userInput = scan.nextInt();
                //data.readData(userInput);
                break;
            default:
                System.out.println("Invalid input, please try again.");
        }

    }


    private void tournamentMenu() {

        System.out.println("What do you want to do in the tournament menu?");
        System.out.println("1.Create tournament");
        System.out.println("2.Look at tournament status");
        userInput = scan.nextInt();
        switch (userInput){
            case 1:
                //data.CreateTournamentData();
                break;
            case 2:
                //data.printTournamentStatus();
                break;
            default:
                System.out.println("Invalid input, please try again.");
        }



    }

    private void matchMenu() {

        System.out.println("What do you want to do in the match menu?");
        System.out.println("1.Start next match");
        userInput = scan.nextInt();
        switch (userInput){
            case 1:
                //data.NextMatch();
                break;
            default:
                System.out.println("Invalid input, please try again.");
        }

    }

}
