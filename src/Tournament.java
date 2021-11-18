import java.util.ArrayList;

public abstract class Tournament {
    protected String tournamentName;
    protected ArrayList<Match> matches;

    public Tournament(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public Integer[] getLastMatchGoals(){
        Integer[] numbers = new Integer[2];
        numbers[0] = matches.get(matches.size()-1).getTeam1Goals();
        numbers[1] = matches.get(matches.size()-1).getTeam2Goals();
        return numbers;
    }

    abstract Integer[] createTournamentStructure(int numberOfTeams);

    //abstract void addMatch(Team team1, Team team2);
}