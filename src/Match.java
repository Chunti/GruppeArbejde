public abstract class Match{
    protected Team team1;
    protected Team team2;
    protected int team1Goals = 0;
    protected int team2Goals = 0;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    abstract void autoPlayMatch();

    abstract void setTeam1(Team team1);

    abstract void setTeam2(Team team2);

    abstract void setTeam1Goals(int team1Goals);

    abstract void setTeam2Goals(int team2Goals);

    abstract Team getTeam1();

    abstract Team getTeam2();

    public int getTeam1Goals() {
        return team1Goals;
    }

    public int getTeam2Goals() {
        return team2Goals;
    }
}