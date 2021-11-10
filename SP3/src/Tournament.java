import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class  Tournament {
    private String tournamentName;
    private ArrayList<Match> matches = new ArrayList<>();
    Data data = new Data();

    public Tournament(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public Integer[] createTournamentStrucktur(int numberOfTeams){
        Integer[] intArray = new Integer[numberOfTeams];
        for (int i = 0; i < numberOfTeams; i++) {
            intArray[i] = i;
        }
        List<Integer> intList = Arrays.asList(intArray);
        Collections.shuffle(intList);
        intList.toArray(intArray);
        return intArray;
    }

    public void addMatch(String[] team1, String[] team2){
        matches.add(new Match(team1,team2));
    }

    public Integer[] getLastMatchGoals(){
        Integer[] numbers = new Integer[2];
        numbers[0] =matches.get(matches.size()-1).getTeam1Goals();
        numbers[1] =matches.get(matches.size()-1).getTeam2Goals();
        return numbers;
    }
}
