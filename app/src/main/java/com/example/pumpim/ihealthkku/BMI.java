package com.example.pumpim.ihealthkku;

import android.os.Bundle;
import android.renderscript.Double2;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import java.text.DecimalFormat;
import java.text.ParseException;

public class BMI extends AppCompatActivity  {

    EditText weightIn ,heigthIn;
    Button btn_ok;
    TextView tvBMI;
    TextView bmiStatus;
    String resulttext;

    double bmi = 0;
    double weight = 0;
    double heigth = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initializeApp();
    }


    public void initializeApp() {
        weightIn = (EditText) findViewById(R.id.edit_weigth);
        heigthIn = (EditText) findViewById(R.id.edit_height);
        btn_ok = (Button) findViewById(R.id.button6);
        tvBMI = (TextView) findViewById(R.id.textView38);
        bmiStatus = (TextView)findViewById( R.id.textView40 );

        btn_ok.setOnClickListener(new Button.OnClickListener(){
            public void onClick (View v){
                calculateBMI();
            }
        });
    }


    public void calculateBMI() {
        String status;
        weight = Double.parseDouble(weightIn.getText().toString() );
        heigth = Double.parseDouble(heigthIn.getText().toString() );
        double valueheightmeters;
        valueheightmeters = heigth / 100;

        bmi = (weight / ((valueheightmeters*valueheightmeters)));
        Log.d("BMI", resulttext);
        tvBMI.setText(resulttext, TextView.BufferType.NORMAL);

        if (bmi >= 35) {
            status = getString( R.string.Gravely overweight );

        } else if (bmi >= 29.0 && bmi < 35.0) {
            resulttext = Double.toString(bmi) + "Seriously overweight";

        } else if (bmi >= 24.0 && bmi < 29.0) {
            resulttext = Double.toString(bmi) + "Overweight";

        } else if ( bmi >= 18.0 && bmi < 24.0 ) {
            resulttext = Double.toString(bmi) + "Normal Weight";

        } else if (bmi >= 16.0 && bmi < 18.0) {
            resulttext = Double.toString(bmi) + "Underweight";

        } else {
            resulttext = Double.toString(bmi) + "Seriously Underweight";

        }

        bmiStatus.setText( status );

    }

}