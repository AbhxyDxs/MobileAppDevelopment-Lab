package com.example.actnav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        TextView TextTV = findViewById(R.id.TextTV);

        Intent i2 = getIntent();
        String text = i2.getStringExtra("Text");

        TextTV.setText(text);
    }
}