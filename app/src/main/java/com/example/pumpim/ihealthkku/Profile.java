package com.example.pumpim.ihealthkku;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity implements View.OnClickListener {

    TextView Birthdate;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Birthdate = (TextView) findViewById(R.id.textView5);
        Birthdate.setOnClickListener(this);

        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.textView5) {
            Intent intent = new Intent(this, Date.class);
            startActivity(intent);

        } else if (view.getId() == R.id.button2) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }

    }
}