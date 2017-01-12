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
import android.widget.ImageView;
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
    ImageView A, B, C, D;

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
        tvBMI = (TextView) findViewById(R.id.textView41);
        bmiStatus = (TextView) findViewById( R.id.textView38 );





        A = (ImageView) findViewById( R.id.imageView6 );
        B = (ImageView) findViewById( R.id.imageView7 );
        C = (ImageView) findViewById( R.id.imageView9 );
        D = (ImageView) findViewById( R.id.imageView10 );
        A.setVisibility(View.INVISIBLE);
        B.setVisibility(View.INVISIBLE);
        C.setVisibility(View.INVISIBLE);
        D.setVisibility(View.INVISIBLE);



        btn_ok.setOnClickListener(new Button.OnClickListener(){
            public void onClick (View v){
                calculateBMI();
            }
        });
    }


    public void calculateBMI() {

        weight = Double.parseDouble(weightIn.getText().toString());
        heigth = Double.parseDouble(heigthIn.getText().toString());

        double valueheightmeters = heigth / 100;
        Log.d("dax", "dax" + String.valueOf(valueheightmeters));

        bmi = weight / (valueheightmeters * valueheightmeters);

        if (bmi >= 29.0 ) {
            resulttext = Double.toString(bmi) ;
            bmiStatus.setText("Seriously overweight");
            D.setVisibility(View.VISIBLE);
            A.setVisibility(View.INVISIBLE);
            B.setVisibility(View.INVISIBLE);
            C.setVisibility(View.INVISIBLE);


        } else if (bmi >= 22.0 && bmi < 29.0) {
            resulttext = Double.toString(bmi) ;
            bmiStatus.setText("Overweight");
            C.setVisibility(View.VISIBLE);
            A.setVisibility(View.INVISIBLE);
            B.setVisibility(View.INVISIBLE);
            D.setVisibility(View.INVISIBLE);


        } else if ( bmi >= 18.0 && bmi < 22.0 ) {
            resulttext = Double.toString(bmi) ;
            bmiStatus.setText("Normal Weight");
            B.setVisibility(View.VISIBLE);
            A.setVisibility(View.INVISIBLE);
            C.setVisibility(View.INVISIBLE);
            D.setVisibility(View.INVISIBLE);

        } else {
            resulttext = Double.toString(bmi) ;
            bmiStatus.setText("Underweight");
            A.setVisibility(View.VISIBLE);
            B.setVisibility(View.INVISIBLE);
            C.setVisibility(View.INVISIBLE);
            D.setVisibility(View.INVISIBLE);

        }

        String resulttext = String.format( "%.2f", bmi );
        tvBMI.setText(resulttext);
        Log.d("finbmi", "bmi: " + resulttext);


    }

}