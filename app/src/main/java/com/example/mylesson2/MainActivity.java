package com.example.mylesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button dele;
    private Button ym;
    private Button rav;
    private Button plus;
    private Button minus;
    private Button to;




    private EditText textSIZEBUTTON;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
initView();


    }

    private void initView() {

        textSIZEBUTTON = findViewById(R.id.cal_cal);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        dele = findViewById(R.id.dele);
        ym = findViewById(R.id.ym);
        rav = findViewById(R.id.rav);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        to = findViewById(R.id.To);

        b1.setOnClickListener( this);
        b2.setOnClickListener( this);
        b3.setOnClickListener( this);
        b4.setOnClickListener( this);
        b5.setOnClickListener( this);
        b6.setOnClickListener( this);
        b7.setOnClickListener( this);
        b8.setOnClickListener( this);
        b9.setOnClickListener( this);
        b0.setOnClickListener( this);
        minus.setOnClickListener( this);
        dele.setOnClickListener( this);
        ym.setOnClickListener( this);
        rav.setOnClickListener( this);
        plus.setOnClickListener( this);
        to.setOnClickListener( this);

    }
    @Override
    public void onClick(View v) {
        String num = "";
        switch (v.getId()) {
            case R.id.b0:
                num = "0";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.b1:
                num = "1";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.b2:
                num = "2";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.b3:
                num = "3";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.b4:
                num= "4";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.b5:
                num = "5";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.b6:
                num = "6";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.b7:
                num = "7";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.b8:
                num = "8";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.b9:
                num = "9";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.dele:
                num = "/";
                textSIZEBUTTON.setText( num);
                break;
            case R.id.To:
                num = ".";
                textSIZEBUTTON.setText( num);
                break;
            case R.id.rav:
                num = "=";
                textSIZEBUTTON.setText( num);
                break;
            case R.id.minus:
                num = "-";
                textSIZEBUTTON.setText( num);
                break;
            case R.id.ym:
                num = "*";
                textSIZEBUTTON.setText( num);
                break;
            case R.id.plus:
                num = "+";
                textSIZEBUTTON.setText( num);
                break;
        }
    }


}
