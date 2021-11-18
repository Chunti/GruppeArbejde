import java.util.ArrayList;

public class Data {
    DBConnector connector = new DBConnector();

    public Data() {
    }

    public void saveTeamData(String teamData) {

    }

    public Team[] getTeams(int numberOfteams) {
        Team[] team = new Team[numberOfteams];
        for (int i = 0; i < numberOfteams; i++) {
            team[i] = new Team(getSpecificTeam(i)[1],getSpecificTeam(i)[2],getSpecificTeam(i)[3]);
        }
        return team;
    }

    public String[] getSpecificTeam(int teamID){
        String[] teamData = connector.readTeamData();
        String[] str = teamData[teamID].split(",");
        return str;
    }
}
