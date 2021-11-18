import java.util.ArrayList;

public class Data {
    DBConnector connector = new DBConnector();

    public Data() {
    }

    public void saveTeamData(String teamData) {

    }

    public ArrayList getTeams(int numberOfteams) {
        ArrayList matches = new ArrayList<Match>();
        for (int i = 0; i < numberOfteams; i++) {
           // matches.add(connector.);
        }
        return matches;
    }
}
