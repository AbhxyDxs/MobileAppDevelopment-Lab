package com.example.basictest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView Num;
    Button incB,decB,resB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num = findViewById(R.id.number);
        incB = findViewById(R.id.inc);
        decB = findViewById(R.id.dec);
        resB = findViewById(R.id.res);

        Num.setText(Integer.toString(count));

        incB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                Num.setText(Integer.toString(count));
            }
        });
        decB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                Num.setText(Integer.toString(count));
            }
        });
        resB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                Num.setText(Integer.toString(count));
            }
        });

    }

}