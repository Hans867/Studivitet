package com.example.studaktivitet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SignedUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signedup);
        Intent intentFromRegistration = getIntent();

        String nameOfChosenActivity = intentFromRegistration.getStringExtra("ABDUL MESSAGE");

        TextView textName = (TextView)findViewById(R.id.activityName);

        textName.setText(nameOfChosenActivity);

        String infoOfChosenActivity = intentFromRegistration.getStringExtra("ABDUL MESSAGE");

        TextView textInfo = (TextView)findViewById(R.id.infoOfActivity);

        textInfo.setText(infoOfChosenActivity);

    }
}