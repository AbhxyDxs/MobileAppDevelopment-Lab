package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    RadioGroup r;
    RadioButton mB,fB,oB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.btnSubmit);
        r = findViewById(R.id.rg);
        mB = findViewById(R.id.mB);
        fB = findViewById(R.id.fB);
        oB = findViewById(R.id.oB);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rgId = r.getCheckedRadioButtonId();

                if (rgId == -1) {
                    Toast.makeText(MainActivity.this, "Select a Gender", Toast.LENGTH_SHORT).show();
                }
                else {
                    RadioButton selectedB = findViewById(rgId);
                    String gender = selectedB.getText().toString();

                    Intent i = new Intent(MainActivity.this,genderActivity.class);
                    i.putExtra("Gender",gender);
                    startActivity(i);
                }
            }
        });
    }
}