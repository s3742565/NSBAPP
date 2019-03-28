package com.example.nsbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtTouch, txtParty, txtTime;
    Button btnTouch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTouch = findViewById(R.id.txtTouch);
        txtTime = findViewById(R.id.txtTime);
        txtParty = findViewById(R.id.txtParty);
        btnTouch = findViewById(R.id.btnTouchTrigger);
    }

    public void party(View v){
        txtTime.setText("TIME!");
        txtParty.setText("PARTY!");
        txtTouch.setText("");
    }
}
