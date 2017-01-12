package com.example.pumpim.ihealthkku;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class lipid extends AppCompatActivity implements View.OnClickListener {

    TextView datelipid, timelipid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lipid);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        datelipid = (TextView) findViewById(R.id.textView37);
        datelipid.setOnClickListener(this);

        timelipid = (TextView) findViewById(R.id.textView39);
        timelipid.setOnClickListener(this);

        
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.textView37) {
            Intent intent = new Intent(this, datepress.class);
            startActivity(intent);

        } else if (view.getId() == R.id.textView39) {
            Intent intent = new Intent(this, Time.class);
            startActivity(intent);

        }

    }

}
