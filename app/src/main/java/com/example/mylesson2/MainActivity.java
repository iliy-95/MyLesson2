package com.example.mylesson2;

import static java.lang.Float.parseFloat;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.assist.AssistStructure;
import android.os.Build;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;

import java.io.CharArrayWriter;
import java.text.BreakIterator;


public  class MainActivity extends AppCompatActivity implements View.OnClickListener {

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
    private Button C;



    static final int AppTheme = 0;
    static final int AppThemeDark = 1;
    static final String KEY_SPS = "sp";
    static final String KEY_My_theme = "My_theme";
    EditText textSIZEBUTTON;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getRealId(getMytheme()));
        Log.d("myLogs", getRealId(getMytheme()) + "");
        setContentView(R.layout.activity_main);
        textSIZEBUTTON= findViewById(R.id.cal_cal);


        initView();




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
        C = findViewById(R.id.CCC);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        minus.setOnClickListener(this);
        dele.setOnClickListener(this);
        ym.setOnClickListener(this);
        rav.setOnClickListener(this);
        plus.setOnClickListener(this);
        to.setOnClickListener(this);
        C.setOnClickListener(this);


    }


//region cal1







    //region Нажатия на кнопки
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
        C = findViewById(R.id.CCC);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        minus.setOnClickListener(this);
        dele.setOnClickListener(this);
        ym.setOnClickListener(this);
        rav.setOnClickListener(this);
        plus.setOnClickListener(this);
        to.setOnClickListener(this);
        C.setOnClickListener(this);

        switch (getMytheme()) {
            case 1:
                ( (RadioButton) findViewById(R.id.radioButtonMyCoolStyle) ).setChecked(true);
                break;
            case 2:
                ((RadioButton)findViewById(R.id.radioButtonDark)).setChecked(true);
                break;

        }
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.radioButtonMyCoolStyle:
                        setMytheme(AppTheme);
                        break;


                    case R.id.radioButtonDark:
                        setMytheme(AppThemeDark);
                        break;
                }
                recreate();

            }
        };
        ( findViewById(R.id.radioButtonMyCoolStyle) ).setOnClickListener(listener);
        ( findViewById(R.id.radioButtonDark) ).setOnClickListener(listener);


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
                num = "4";
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
                textSIZEBUTTON.setText(num);
                break;
            case R.id.To:
                num = ".";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.rav:
                num = "=";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.minus:
                num = "-";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.ym:
                num = "*";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.plus:
                num = "+";
                textSIZEBUTTON.setText(num);
                break;
            case R.id.CCC:
                num = "C";
                textSIZEBUTTON.setText(num);
                break;
        }
    }
//endregion

    private void setMytheme(int Mytheme) {
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_SPS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY_My_theme, Mytheme);
        editor.apply();
    }


    private int getMytheme() {
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_SPS, MODE_PRIVATE);
        return sharedPreferences.getInt(KEY_My_theme, -1);
    }


    private int getRealId(int currentTheme) {

        switch (currentTheme) {
            case AppTheme:
                return R.style.AppTheme;
            case AppThemeDark:
                return R.style.AppThemeDark;
            default:
                return R.style.MyCoolStyle;

        }


    }


    }

