package labs.pollux.com.androidtestingtutorial.ActivityLaunchTest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import labs.pollux.com.androidtestingtutorial.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
