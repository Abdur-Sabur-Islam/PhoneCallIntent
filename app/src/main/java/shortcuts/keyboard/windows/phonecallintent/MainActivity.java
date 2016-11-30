package shortcuts.keyboard.windows.phonecallintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText phoneNo;
    Button makeCall;
    Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneNo = (EditText) findViewById(R.id.phoneNoEt);
        makeCall = (Button) findViewById(R.id.makeCallBtn);
        makeCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = phoneNo.getText().toString();
                model = new Model(MainActivity.this,phoneNumber);
                model.makeCall();

            }
        });
    }
}
