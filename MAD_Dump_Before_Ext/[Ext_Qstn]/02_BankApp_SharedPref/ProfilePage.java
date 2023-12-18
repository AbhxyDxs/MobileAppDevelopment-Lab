package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfilePage extends AppCompatActivity {

    TextView UID_TV, Bal_TV;
    Button DepB, WitB;

    int Balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        UID_TV = findViewById(R.id.UID_TV);
        Bal_TV = findViewById(R.id.Bal_TV);
        DepB = findViewById(R.id.DepositB);
        WitB = findViewById(R.id.WithdrawB);

        Intent i = getIntent();
        String UIDs = i.getStringExtra("UID");
        UID_TV.setText(UIDs);
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sp = getSharedPreferences("mySp", MODE_PRIVATE);
        Balance = sp.getInt("Bal", 5000);
        Bal_TV.setText(Integer.toString(Balance) + " Rs");

        DepB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), DepositPage.class);
                i.putExtra("Balance", Balance);
                startActivity(i);
            }
        });

        WitB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WithdrawPage.class);
                i.putExtra("Balance", Balance);
                startActivity(i);
            }
        });
    }
}
