package com.dhruvil.first_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, plus,minus, multi, division,percentage, equal, dot,ac;
    TextView text_num;
    int f_num,s_num;
    char ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text_num = findViewById(R.id.text_num);
        b1 = findViewById(R .id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);
        b0 = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        ac = findViewById(R.id.ac);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        division = findViewById(R.id.div);
        percentage = findViewById(R.id.percentage);
        equal = findViewById(R.id.equal);



        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_num.setText("");

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ope == '+'){
                    s_num = Integer.parseInt(text_num.getText().toString());
                    addition();

                }else if(ope == '-') {
                    s_num = Integer.parseInt(text_num.getText().toString());
                    substraction();
                }else if(ope == '*') {
                    s_num = Integer.parseInt(text_num.getText().toString());
                    multiplication();
                }else if(ope == '/'){
                    s_num = Integer.parseInt(text_num.getText().toString());
                    division();
                }else if(ope == '%'){
                    s_num = Integer.parseInt(text_num.getText().toString());
                    percent();
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                f_num = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                ope = '+';

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                f_num = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                ope = '-';

            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                f_num = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                ope = '*';

            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                f_num = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                ope = '/';

            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                f_num = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                ope = '%';

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num + "1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num + "2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num + "3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num + "4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num + "5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num + "6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num + "7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num + "8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num + "9");

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num + "0");

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(".");

            }
        });

    }

    void addition(){

        int sum = f_num + s_num;
        text_num.setText(""+sum);

    }

    void substraction(){

        int substract = f_num - s_num;
        text_num.setText(""+substract);

    }

    void multiplication(){

        int mul = f_num * s_num;
        text_num.setText(""+mul);

    }

    void division(){

        int div = f_num / s_num;
        text_num.setText(""+div);

    }

    void percent() {

        int per = (f_num * s_num)/100;
        text_num.setText("" + per);

    }

}