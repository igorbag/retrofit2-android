package retrofit.igorbagliotti.com.br.soccerapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import retrofit.igorbagliotti.com.br.soccerapp.R;
import retrofit.igorbagliotti.com.br.soccerapp.model.fixtures.FixtureDatum;

/**
 * Created by igorb on 10/03/2018.
 */

public class FixturesAdapter extends RecyclerView.Adapter<FixturesAdapter.ViewHolder> {

    List<FixtureDatum> fixtures;

    public FixturesAdapter(List<FixtureDatum> fixtures) {
        this.fixtures = fixtures;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem_fixture, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        FixtureDatum fixturesDatum = fixtures.get(position);

        holder.localTeam.setText(fixturesDatum.getLocalTeam().getData().getName());
        holder.localTeamScore.setText(String.valueOf(fixturesDatum.getScores().getLocalteamScore()));
        holder.visitorTeam.setText(fixturesDatum.getVisitorTeam().getData().getName());
        holder.visitorTeamScore.setText(String.valueOf(fixturesDatum.getScores().getVisitorteamScore()));

    }

    @Override
    public int getItemCount() {
        return fixtures.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView localTeam;
        TextView localTeamScore;
        TextView visitorTeam;
        TextView visitorTeamScore;

        public ViewHolder(View view) {
            super(view);
            localTeam = (TextView) view.findViewById(R.id.local_team);
            localTeamScore = (TextView) view.findViewById(R.id.local_team_score);
            visitorTeam = (TextView) view.findViewById(R.id.visitor_team);
            visitorTeamScore = (TextView) view.findViewById(R.id.visitor_team_score);
        }
    }

}