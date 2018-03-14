package labs.pollux.com.androidtestingtutorial.LaunchOneActivityFromAnotherTest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import labs.pollux.com.androidtestingtutorial.R;

public class ActivityTwo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

    }
}
