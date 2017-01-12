package com.example.pumpim.ihealthkku;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class sugar extends AppCompatActivity implements View.OnClickListener {

    TextView datelipid, timelipid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        datelipid = (TextView) findViewById(R.id.textView35);
        datelipid.setOnClickListener(this);

        timelipid = (TextView) findViewById(R.id.textView36);
        timelipid.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.textView35) {
            Intent intent = new Intent(this, datesugar.class);
            startActivity(intent);

        } else if (view.getId() == R.id.textView36) {
            Intent intent = new Intent(this, timesugar.class);
            startActivity(intent);

        }

    }

}
