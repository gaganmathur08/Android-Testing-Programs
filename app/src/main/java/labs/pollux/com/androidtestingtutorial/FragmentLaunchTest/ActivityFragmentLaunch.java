package labs.pollux.com.androidtestingtutorial.FragmentLaunchTest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import labs.pollux.com.androidtestingtutorial.R;

public class ActivityFragmentLaunch extends AppCompatActivity {

    private RelativeLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_launch);

        fragmentContainer = findViewById(R.id.fragment_container);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,FragmentOne.newInstance("","")).commitAllowingStateLoss();
    }
}
