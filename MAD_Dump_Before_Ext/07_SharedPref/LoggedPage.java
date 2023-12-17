package com.example.sharedpref_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoggedPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_page);

        TextView NameTV = findViewById(R.id.Name_TV);
        Button LogoutB = findViewById(R.id.LogoutB);

        SharedPreferences mySPref = getSharedPreferences("myPrefs",MODE_PRIVATE);
        String UName = mySPref.getString("Name","");

        NameTV.setText(UName + " !");

        LogoutB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i2);
            }
        });

    }
}