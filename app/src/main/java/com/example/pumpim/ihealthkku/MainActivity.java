package com.example.pumpim.ihealthkku;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tVBMI, tvBloodPressure, tvBloodSugar ,tvLipid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tVBMI = (TextView) findViewById(R.id.textView31);
        tVBMI.setOnClickListener(this);

        tvBloodPressure = (TextView) findViewById(R.id.textView28);
        tvBloodPressure.setOnClickListener(this);

        tvBloodSugar = (TextView) findViewById(R.id.textView29);
        tvBloodSugar.setOnClickListener(this);

        tvLipid = (TextView) findViewById(R.id.textView30);
        tvLipid.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.textView31) {
            Intent intent = new Intent(this, BMI.class);
            startActivity(intent);

        } else if (view.getId() == R.id.textView28) {
            Intent intent = new Intent(this, Pressure.class);
            startActivity(intent);

        } else if (view.getId() == R.id.textView29) {
            Intent intent = new Intent(this, sugar.class);
            startActivity(intent);

        } else if (view.getId() == R.id.textView30) {
            Intent intent = new Intent(this, lipid.class);
            startActivity(intent);

        }

    }
}


