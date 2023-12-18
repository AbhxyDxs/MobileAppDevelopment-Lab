package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText UID_ET,PASS_ET;
    Button LOGINb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UID_ET = findViewById(R.id.UID);
        PASS_ET = findViewById(R.id.PASS);
        LOGINb = findViewById(R.id.LOGINb);

        LOGINb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UIDs = UID_ET.getText().toString();
                String PASSs = PASS_ET.getText().toString();

                if(UIDs.equals("CET001") && PASSs.equals("123")){
                    Intent i = new Intent(getApplicationContext(), ProfilePage.class);
                    i.putExtra("UID",UIDs);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}