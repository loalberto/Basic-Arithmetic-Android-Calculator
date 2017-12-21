package com.example.android.calculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtResult;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnZero;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMulti;
    private Button btnDivide;
    private Button btnClear;
    private Number numResullt;
    private float value1 = 0, value2 = 0, result = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtResult = (EditText)findViewById(R.id.edtResult);
        btnOne = (Button)findViewById(R.id.btnOne);
        btnTwo = (Button)findViewById(R.id.btnTwo);
        btnThree = (Button)findViewById(R.id.btnThree);
        btnFour = (Button)findViewById(R.id.btnFour);
        btnFive = (Button)findViewById(R.id.btnFive);
        btnSix = (Button)findViewById(R.id.btnSix);
        btnSeven = (Button)findViewById(R.id.btnSeven);
        btnEight = (Button)findViewById(R.id.btnEight);
        btnNine = (Button)findViewById(R.id.btnNine);
        btnZero = (Button)findViewById(R.id.btnZero);
        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMulti = (Button)findViewById(R.id.btnMulti);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnClear = (Button)findViewById(R.id.btnClear);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1 == 0.0f || value2 != 0.0f){
                    value1 = 1;
                }else if(value1 != 0.0f || value2 == 0.0f){
                    value2 = 1;
                }
                edtResult.setText(Float.toString(value1));
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1 == 0.0f || value2 != 0.0f){
                    value1 = 2;
                }else if(value1 != 0.0f || value2 == 0.0f){
                    value2 = 2;
                }
                edtResult.setText(Float.toString(value2));
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1 == 0.0f || value2 != 0.0f){
                    value1 = 3;
                }else if(value1 != 0.0f || value2 == 0.0f){
                    value2 = 3;
                }
                edtResult.setText(Float.toString(value2));
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1 == 0.0f || value2 != 0.0f){
                    value1 = 4;
                }else if(value1 != 0.0f || value2 == 0.0f){
                    value2 = 4;
                }
                edtResult.setText(Float.toString(value2));
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1 == 0.0f || value2 != 0.0f){
                    value1 = 5;
                }else if(value1 != 0.0f || value2 == 0.0f){
                    value2 = 5;
                }
                edtResult.setText(Float.toString(value2));
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1 == 0.0f || value2 != 0.0f){
                    value1 = 6;
                }else if(value1 != 0.0f || value2 == 0.0f){
                    value2 = 6;
                }
                edtResult.setText(Float.toString(value2));
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1 == 0.0f || value2 != 0.0f){
                    value1 = 7;
                }else if(value1 != 0.0f || value2 == 0.0f){
                    value2 = 7;
                }
                edtResult.setText(Float.toString(value2));
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1 == 0.0f || value2 != 0.0f){
                    value1 = 8;
                }else if(value1 != 0.0f || value2 == 0.0f){
                    value2 = 8;
                }
                edtResult.setText(Float.toString(value2));
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1 == 0.0f || value2 != 0.0f){
                    value1 = 9;
                }else if(value1 != 0.0f || value2 == 0.0f){
                    value2 = 9;
                }
                edtResult.setText(Float.toString(value2));
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value1 == 0.0f || value2 != 0.0f){
                    value1 = 0;
                }else if(value1 != 0.0f || value2 == 0.0f){
                    value2 = 0;
                }
                edtResult.setText(Float.toString(value2));
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = value1 + value2;
                edtResult.setText(Float.toString(result));
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = value1 - value2;
                edtResult.setText(Float.toString(result));
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = value1 * value2;
                edtResult.setText(Float.toString(result));
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value2 != 0) {
                    result = value1 / value2;
                }else{
                    edtResult.setBackgroundColor(Color.RED);
                    edtResult.setTextColor(Color.BLACK);
                    edtResult.setText("Divide by zero error.");
                }
                edtResult.setText(Float.toString(result));
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = value2 = 0.0f;
                edtResult.setText(Float.toString(0.0f));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
