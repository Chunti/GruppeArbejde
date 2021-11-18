import java.util.Scanner;

public class Controller {
    private Scanner scan = new Scanner(System.in);
    private Data data = new Data();
    public Controller() {
    }

    public void createTeam(){
        System.out.println("What is your team name?");
        String teamName = scan.nextLine();
        System.out.println("Name on player 1?");
        String player1 = scan.nextLine();
        System.out.println("Name on player 2?");
        String player2 = scan.nextLine();
        Team team = new Team(teamName,player1,player2);
        data.saveTeamData(team.toString());
    }

    public void createTournament(){
        System.out.println("What should the name of the tournament be?");
        String tournamentName = scan.nextLine();
        KnockOut knockOut = new KnockOut(tournamentName);
        Team[] teamData = data.getTeams(8);
        Team[] teams = knockOut.createTournamentStructure(teamData);

    }


}
