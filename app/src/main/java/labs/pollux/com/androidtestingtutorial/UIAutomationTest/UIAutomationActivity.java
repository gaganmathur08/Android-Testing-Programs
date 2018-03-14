package labs.pollux.com.androidtestingtutorial.UIAutomationTest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import labs.pollux.com.androidtestingtutorial.R;

public class UIAutomationActivity extends AppCompatActivity {

    private Button changeBtn;
    private EditText edtTxt;
    private TextView changedTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uiautomation);

        changeBtn = findViewById(R.id.change_txt_btn);
        edtTxt = findViewById(R.id.edt_txt);
        changedTxt = findViewById(R.id.changed_txt);

        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changedTxt.setText(edtTxt.getText().toString());
            }
        });
    }
}
