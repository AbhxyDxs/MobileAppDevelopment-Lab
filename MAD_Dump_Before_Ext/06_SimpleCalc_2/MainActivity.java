package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button Plus,Min,Mul,Div,Eq,AC;
    EditText Number;

    double num1,num2,res;
    String Op;
    String Default;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        Plus = findViewById(R.id.bplus);
        Min = findViewById(R.id.bmin);
        Mul = findViewById(R.id.bmul);
        Div = findViewById(R.id.bdiv);
        Eq = findViewById(R.id.beq);
        AC = findViewById(R.id.bAC);

        Number = findViewById(R.id.number);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                Number.setText(Default+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                Number.setText(Default+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                Number.setText(Default+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                Number.setText(Default+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                Number.setText(Default+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                Number.setText(Default+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                Number.setText(Default+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                Number.setText(Default+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                Number.setText(Default+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                if(Default.equals("0")){
                    Number.setText("0");
                }
                else {
                    Number.setText(Default + "0");
                }
            }
        });

        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                num1 =Double.parseDouble(Default);

                Default = null;

                Number.setText(null);
                Op = "+";
            }
        });
        Min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                num1 =Double.parseDouble(Default);

                Default = null;

                Number.setText(null);
                Op = "-";
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                num1 =Double.parseDouble(Default);

                Default = null;

                Number.setText(null);
                Op = "x";
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                num1 =Double.parseDouble(Default);

                Default = null;

                Number.setText(null);
                Op = "/";
            }
        });
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Default = null;

                Number.setText(null);
            }
        });
        Eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                num2 =Double.parseDouble(Default);

                Default = null;

                switch (Op){
                    case "+":
                        res = num1 + num2;
                        Number.setText(Double.toString(res));
                        break;
                    case "-":
                        res = num1 - num2;
                        Number.setText(Double.toString(res));
                        break;
                    case "x":
                        res = num1 * num2;
                        Number.setText(Double.toString(res));
                        break;
                    case "/":
                        res = num1 / num2;
                        Number.setText(Double.toString(res));
                        break;
                }
            }
        });
    }
}