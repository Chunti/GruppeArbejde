public class Team {
    private String teamName;
    private String player1;
    private String player2;

    public Team(String teamName, String player1, String player2) {
        this.teamName = teamName;
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    @Override
    public String toString(){
        return teamName + "," + player1 + "," + player2;
    }

}
