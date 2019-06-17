package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView num1;
    TextView num2;
    TextView num3;
    TextView num4;
    TextView num5;
    TextView num6;
    TextView num7;
    TextView num8;
    TextView num9;
    TextView num0;
    TextView tv;
    TextView clear;
    TextView point;
    TextView divide;
    TextView multiple;
    TextView minus;
    TextView plus;
    TextView sub_tv;
    TextView equal;
    int firstNum,secondNum;
    String how;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        num0 = findViewById(R.id.num0);
        clear = findViewById(R.id.clear);
        tv = findViewById(R.id.tv);
        equal = findViewById(R.id.equal);
        point = findViewById(R.id.point);
        divide = findViewById(R.id.divide);
        multiple = findViewById(R.id.multiple);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        sub_tv = findViewById(R.id.sub_tv);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText(before + "1");

            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText(before + "0");

            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText(before + "2");

            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText(before + "3");

            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText(before + "4");

            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText(before + "5");

            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText(before + "6");

            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText(before + "7");

            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText(before + "8");

            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText(before + "9");

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText( "");

            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                tv.setText(before + ".");

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                firstNum = Integer.parseInt(before);
                how="/";
                sub_tv.setText(before + how);
                tv.setText("");


            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                firstNum = Integer.parseInt(before);
                how="*";
                sub_tv.setText(before + how);
                tv.setText("");


            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                firstNum = Integer.parseInt(before);
                how="+";
                sub_tv.setText(before + how);
                tv.setText("");

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                firstNum = Integer.parseInt(before);
                how="-";
                sub_tv.setText(before + how);
                tv.setText("");


            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before=tv.getText().toString();
                secondNum=Integer.parseInt(before);

                int result=0;
                switch (how){
                    case "+":
                        result=firstNum+secondNum;
                        break;
                    case "-":
                        result=firstNum-secondNum;
                        break;
                    case "*":
                        result=firstNum*secondNum;
                        break;
                    case "/":
                        result=firstNum/secondNum;
                        break;

                }
                tv.setText(""+result);
            }
        });

    }
}
