public class KnockOutMatch extends Match{
    public KnockOutMatch(Team team1, Team team2) {
        super(team1, team2);
    }

    @Override
    void autoPlayMatch() {
        while(team1Goals != 10 && team2Goals !=10 || team1Goals == team2Goals){
            team1Goals = (int) (11*Math.random());
            team2Goals = (int) (11*Math.random());
        }
    }

    @Override
    void setTeam1(Team team1) {
        this.team1 = team1;
    }

    @Override
    void setTeam2(Team team2) {
        this.team2 = team2;
    }

    @Override
    void setTeam1Goals(int team1Goals) {
        this.team1Goals = team1Goals;
    }

    @Override
    void setTeam2Goals(int team2Goals) {
        this.team2Goals = team2Goals;
    }

    @Override
    Team getTeam1() {
        return team1;
    }

    @Override
    Team getTeam2() {
        return team2;
    }
}
