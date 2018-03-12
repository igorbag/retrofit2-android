
package retrofit.igorbagliotti.com.br.soccerapp.standings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StandingsResultDatum {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("league_id")
    @Expose
    private int leagueId;
    @SerializedName("season_id")
    @Expose
    private int seasonId;
    @SerializedName("stage_id")
    @Expose
    private int stageId;
    @SerializedName("stage_name")
    @Expose
    private String stageName;
    @SerializedName("standings")
    @Expose
    private Standings standings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public int getStageId() {
        return stageId;
    }

    public void setStageId(int stageId) {
        this.stageId = stageId;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public Standings getStandings() {
        return standings;
    }

    public void setStandings(Standings standings) {
        this.standings = standings;
    }

}
