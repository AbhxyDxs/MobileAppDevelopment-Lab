package com.example.actnav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button SendB;
    EditText TextET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SendB = findViewById(R.id.SendB);
        TextET = findViewById(R.id.textET);

        SendB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Page2.class);
                String text = TextET.getText().toString();
                i.putExtra("Text",text);
                startActivity(i);
            }
        });

    }
}