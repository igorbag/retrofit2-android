
package retrofit.igorbagliotti.com.br.soccerapp.standings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Away {

    @SerializedName("games_played")
    @Expose
    private int gamesPlayed;
    @SerializedName("won")
    @Expose
    private int won;
    @SerializedName("draw")
    @Expose
    private int draw;
    @SerializedName("lost")
    @Expose
    private int lost;
    @SerializedName("goals_scored")
    @Expose
    private int goalsScored;
    @SerializedName("goals_against")
    @Expose
    private int goalsAgainst;

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

}
