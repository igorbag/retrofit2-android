package retrofit.igorbagliotti.com.br.soccerapp.app;

import retrofit.igorbagliotti.com.br.soccerapp.model.fixtures.FixturesResult;
import retrofit.igorbagliotti.com.br.soccerapp.standings.StandingsResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by igorb on 09/03/2018.
 */

public interface Api {


    @GET("standings/season/{seasonId}")
    Call<StandingsResult> getStandingsResultCall(@Path("seasonId") int seasonId);

    @GET("rounds/{roundId}")
    Call<FixturesResult> getRoundWithFixtures(@Path("roundId") int roundId, @Query("include") String include);

}
