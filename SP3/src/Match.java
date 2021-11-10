import java.util.Random;

public class Match{
    private String[] team1;
    private String[] team2;
    private int team1Goals = 0;
    private int team2Goals = 0;

    public Match(String[] team1, String[] team2) {
        this.team1 = team1;
        this.team2 = team2;
        while(team1Goals != 10 && team2Goals !=10 || team1Goals == team2Goals){
            team1Goals = (int) (11*Math.random());
            team2Goals = (int) (11*Math.random());
        }
    }

    public void setTeam1(String[] team1) {
        this.team1 = team1;
    }

    public void setTeam2(String[] team2) {
        this.team2 = team2;
    }

    public void setTeam1Goals(int team1Goals) {
        this.team1Goals = team1Goals;
    }

    public void setTeam2Goals(int team2Goals) {
        this.team2Goals = team2Goals;
    }

    public String[] getTeam1() {
        return team1;
    }

    public String[] getTeam2() {
        return team2;
    }

    public int getTeam1Goals() {
        return team1Goals;
    }

    public int getTeam2Goals() {
        return team2Goals;
    }
}
