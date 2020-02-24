package com.example.createanevent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Switch aSwitch;
    EditText Name, Time, Duration, Week, Date, Location, Description;
    Button Create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.Name);
        Time = (EditText) findViewById(R.id.Time);
        Duration = (EditText) findViewById(R.id.Duration);
        Week = (EditText) findViewById(R.id.Week);
        Date = (EditText) findViewById(R.id.Date);
        Location = (EditText) findViewById(R.id.Location);
        Description = (EditText) findViewById(R.id.Description);
        Create = (Button) findViewById(R.id.Create);
        aSwitch = (Switch) findViewById(R.id.switch1);



        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if(isChecked == true) {
                    Toast.makeText(getBaseContext(), "Private",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getBaseContext(), "Public",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Create:


                break;

        }
    }
}
