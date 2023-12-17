package com.example.sharedpref_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText NameET = findViewById(R.id.Name_ET);
        Button Login = findViewById(R.id.LoginB);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Username = NameET.getText().toString();

                SharedPreferences mySPref = getSharedPreferences("myPrefs",MODE_PRIVATE);
                SharedPreferences.Editor editor = mySPref.edit();
                editor.putString("Name",Username);
                editor.apply();

                Intent i = new Intent(getApplicationContext(), LoggedPage.class);
                startActivity(i);
            }
        });

    }
}