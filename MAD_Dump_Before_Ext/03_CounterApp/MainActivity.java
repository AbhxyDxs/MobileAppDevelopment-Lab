package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int val = 0;
    Button PlusB,ResB,MinB;
    TextView ValueTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlusB = findViewById(R.id.plusB);
        ResB = findViewById(R.id.resB);
        MinB = findViewById(R.id.minB);
        ValueTV = findViewById(R.id.ValueTV);

        PlusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val += 1;
                ValueTV.setText(Integer.toString(val));
            }
        });
        MinB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val -= 1;
                ValueTV.setText(Integer.toString(val));
            }
        });
        ResB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val = 0;
                ValueTV.setText(Integer.toString(val));
            }
        });
    }
}