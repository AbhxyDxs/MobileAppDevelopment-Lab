package com.example.radiobuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup RG;
    Button CheckB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckB = findViewById(R.id.CheckB);
        RG = findViewById(R.id.rg);

        CheckB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rbID = RG.getCheckedRadioButtonId();

                if(rbID == -1){
                    Toast.makeText(MainActivity.this, "Select Something!", Toast.LENGTH_SHORT).show();
                }
                else{
                    RadioButton selRB = findViewById(rbID);
                    String Gender = selRB.getText().toString();

                    Toast.makeText(MainActivity.this, "Selected "+Gender, Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}