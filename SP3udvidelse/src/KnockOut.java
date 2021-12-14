import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KnockOut extends Tournament{


    public KnockOut(String tournamentName) {
        super(tournamentName);
    }

    @Override
    Team[] createTournamentStructure(Team[] team) {
        List<Team> teamShuffle = Arrays.asList(team);
        Collections.shuffle(teamShuffle);
        for (int i = 0; i < teamShuffle.size(); i++) {
            team[i] = teamShuffle.get(i);
        }
        return team;
    }
    @Override
    public String toString(){
        return super.tournamentName;
    }

}
