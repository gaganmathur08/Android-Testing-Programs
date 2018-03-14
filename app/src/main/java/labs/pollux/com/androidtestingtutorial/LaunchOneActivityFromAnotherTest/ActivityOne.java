package labs.pollux.com.androidtestingtutorial.LaunchOneActivityFromAnotherTest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import labs.pollux.com.androidtestingtutorial.R;

public class ActivityOne extends AppCompatActivity {

    Button goToBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        goToBtn = findViewById(R.id.go_to_btn);

        goToBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityOne.this, ActivityTwo.class));
            }
        });
    }
}
