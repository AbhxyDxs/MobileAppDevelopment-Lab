package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WithdrawPage extends AppCompatActivity {

    TextView WBalTV;
    EditText WitET;
    Button WitB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw_page);

        WBalTV = findViewById(R.id.WBal_TV);
        WitET = findViewById(R.id.WitAmt_ET);
        WitB = findViewById(R.id.WitB);

        SharedPreferences sp = getSharedPreferences("mySp", MODE_PRIVATE);
        final SharedPreferences.Editor ed = sp.edit();

        int currBal = sp.getInt("Bal", 0);
        WBalTV.setText(Integer.toString(currBal)+" Rs");

        WitB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amt = Integer.valueOf(WitET.getText().toString());
                int currBal = sp.getInt("Bal", 0);

                if(currBal >= 1000 && amt <= currBal) {
                    currBal -= amt;
                }
                else{
                    if(currBal <= 1000){
                        Toast.makeText(WithdrawPage.this, "Min 1000Rs Required for Withdrawal", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(WithdrawPage.this, "Amount greater than Balance!", Toast.LENGTH_LONG).show();
                    }
                }

                ed.putInt("Bal", currBal);
                ed.apply();

                WBalTV.setText(Integer.toString(currBal)+" Rs");
                WitET.setText(null);
            }
        });
    }
}