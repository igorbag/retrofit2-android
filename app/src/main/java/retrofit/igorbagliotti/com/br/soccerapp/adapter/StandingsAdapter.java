package retrofit.igorbagliotti.com.br.soccerapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import retrofit.igorbagliotti.com.br.soccerapp.R;
import retrofit.igorbagliotti.com.br.soccerapp.standings.StandingDatum;

/**
 * Created by igorb on 09/03/2018.
 */

public class StandingsAdapter extends RecyclerView.Adapter<StandingsAdapter.ViewHolder> {

    List<StandingDatum> standings;

    public StandingsAdapter(List<StandingDatum> standings) {
        this.standings = standings;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem_standing, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        StandingDatum standingDatum = standings.get(position);

        holder.position.setText(String.valueOf(standingDatum.getPosition()));
        holder.name.setText(String.valueOf(standingDatum.getTeamName()));
        holder.matchesPlayed.setText(String.valueOf(standingDatum.getOverall().getGamesPlayed()));
        holder.goalsFor.setText(String.valueOf(standingDatum.getOverall().getGoalsScored()));
        holder.goalsAgainst.setText(String.valueOf(standingDatum.getOverall().getGoalsAgainst()));
        holder.points.setText(String.valueOf(standingDatum.getPoints()));


    }

    @Override
    public int getItemCount() {
        return standings.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView position;
        TextView name;
        TextView matchesPlayed;
        TextView goalsFor;
        TextView goalsAgainst;
        TextView points;

        public ViewHolder(View view) {
            super(view);
            position = (TextView) view.findViewById(R.id.position);
            name = (TextView) view.findViewById(R.id.name);
            matchesPlayed = (TextView) view.findViewById(R.id.matches_played);
            goalsFor = (TextView) view.findViewById(R.id.goals_for);
            goalsAgainst = (TextView) view.findViewById(R.id.goals_against);
            points = (TextView) view.findViewById(R.id.points);
        }
    }


}

