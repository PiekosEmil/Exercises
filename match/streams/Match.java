package match.streams;

public class Match {
    private final String team1;
    private final String team2;
    private final int team1score;
    private final int team2score;

    public Match(String team1, String team2, int team1score, int team2score) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1score = team1score;
        this.team2score = team2score;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public int getTeam1score() {
        return team1score;
    }

    public int getTeam2score() {
        return team2score;
    }

    public int totalScore() {
        return team1score + team2score;
    }

    public int scoreDifference() {
        return team2score - team1score;
    }

    public boolean teamNameIsEqualsTo(String name) {
        return team1.equals(name) || team2.equals(name);
    }

    public String[] teamsNames() {
        return new String[]{team1, team2};
    }

    @Override
    public String toString() {
        return team1 + '-' + team2 + " (" + team1score + '-' + team2score + ')';
    }
}
