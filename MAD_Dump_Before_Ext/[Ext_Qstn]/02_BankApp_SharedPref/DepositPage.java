package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DepositPage extends AppCompatActivity {

    TextView DBalTV;
    EditText DepET;
    Button DepB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit_page);

        DBalTV = findViewById(R.id.DBal_TV);
        DepET = findViewById(R.id.DepAmt_ET);
        DepB = findViewById(R.id.DepB);

        SharedPreferences sp = getSharedPreferences("mySp", MODE_PRIVATE);
        final SharedPreferences.Editor ed = sp.edit();

        int currBal = sp.getInt("Bal", 0);
        DBalTV.setText(Integer.toString(currBal)+" Rs");

        DepB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amt = Integer.valueOf(DepET.getText().toString());
                int currBal = sp.getInt("Bal", 0);

                currBal += amt;

                ed.putInt("Bal", currBal);
                ed.apply();

                DBalTV.setText(Integer.toString(currBal)+" Rs");
                DepET.setText(null);
            }
        });
    }
}
