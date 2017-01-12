package com.example.pumpim.ihealthkku;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class BMI extends AppCompatActivity {

    //EditText weight,heigth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //weight = (EditText) findViewById(R.id.edit_weigth);
        //heigth = (EditText) findViewById(R.id.edit_height);

        //String x = String.valueOf(weight.getText());
        //int MyNumber = Integer.parseInt("x");


    }

}
