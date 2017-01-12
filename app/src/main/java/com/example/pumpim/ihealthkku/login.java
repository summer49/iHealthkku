package com.example.pumpim.ihealthkku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity implements View.OnClickListener{

    Button my_btn;
    TextView Reg, forgetpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        my_btn = (Button) findViewById(R.id.btn_ok);
        my_btn.setOnClickListener(this);

        Reg = (TextView) findViewById(R.id.textView2);
        Reg.setOnClickListener(this);

        forgetpassword = (TextView) findViewById(R.id.textView3);
        forgetpassword.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_ok ){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.textView2) {
            Intent intent = new Intent(this, Register.class);
            startActivity(intent);

        } else if (view.getId() == R.id.textView3) {
            Intent intent = new Intent(this, forgetpassw.class);
            startActivity(intent);

        }
    }
}
