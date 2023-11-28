package com.example.basictest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView Num;
    Button Sum;
    CheckBox one,two,three;
    int sum = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num = findViewById(R.id.number);
        Sum = findViewById(R.id.sum);
        one = findViewById(R.id.c1);
        two = findViewById(R.id.c2);
        three = findViewById(R.id.c3);

        Sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = 0;
                if(one.isChecked()){
                    sum += 10;
                }
                if(two.isChecked()){
                    sum += 20;
                }
                if(three.isChecked()){
                    sum += 30;
                }
                Num.setText(Integer.toString(sum));
            }
        });

    }

}