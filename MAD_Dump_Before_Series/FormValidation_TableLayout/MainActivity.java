package com.example.basictest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,pass;
    Button s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.UName);
        pass = findViewById(R.id.Pass);
        s1 = findViewById(R.id.submit);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = user.getText().toString();
                String p = pass.getText().toString();

                if (u.equals("admin") && p.equals("123")){
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}