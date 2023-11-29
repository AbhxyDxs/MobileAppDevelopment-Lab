package com.example.test3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class genderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender_activity);

        Intent i2 = getIntent();
        String gender2 = i2.getStringExtra("Gender");

        TextView display = findViewById(R.id.display);
        display.setText("You Selected : "+ gender2);
    }
}
