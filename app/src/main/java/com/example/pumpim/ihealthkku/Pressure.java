package com.example.pumpim.ihealthkku;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Pressure extends AppCompatActivity implements View.OnClickListener {

    TextView datepress, time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        datepress = (TextView) findViewById(R.id.textView9);
        datepress.setOnClickListener(this);

        time = (TextView) findViewById(R.id.textView10);
        time.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.textView9) {
            Intent intent = new Intent(this, datepress.class);
            startActivity(intent);

        } else if (view.getId() == R.id.textView10) {
            Intent intent = new Intent(this, Time.class);
            startActivity(intent);

        }

    }
}
