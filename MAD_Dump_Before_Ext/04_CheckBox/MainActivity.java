package com.example.checkboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox C1,C2,C3;
    Button SumB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C1 = findViewById(R.id.c1);
        C2 = findViewById(R.id.c2);
        C3 = findViewById(R.id.c3);
        SumB = findViewById(R.id.SumB);

        SumB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sum = 0;

                if(C1.isChecked()){
                    sum += 10;
                }
                if(C2.isChecked()){
                    sum += 20;
                }
                if(C3.isChecked()){
                    sum += 30;
                }
                Toast.makeText(MainActivity.this, "SUM : "+sum, Toast.LENGTH_SHORT).show();
            }
        });

    }
}