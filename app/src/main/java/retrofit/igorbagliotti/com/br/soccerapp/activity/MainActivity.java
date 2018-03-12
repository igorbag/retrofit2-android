package retrofit.igorbagliotti.com.br.soccerapp.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import retrofit.igorbagliotti.com.br.soccerapp.R;
import retrofit.igorbagliotti.com.br.soccerapp.fragment.FixturesFragment;
import retrofit.igorbagliotti.com.br.soccerapp.fragment.StandingsFragment;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_stadings:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, StandingsFragment.newInstance(null, null)).commit();
                    return true;
                case R.id.navigation_fixtures:
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, FixturesFragment.newInstance(null, null))
                            .commit();
                    return true;
                case R.id.navigation_topscores:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //Seleciona o primeiro menu por default
        mOnNavigationItemSelectedListener.onNavigationItemSelected(navigation.getMenu().getItem(0));
    }

}
