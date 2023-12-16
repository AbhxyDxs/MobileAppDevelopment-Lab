package com.example.basic_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LoggedPage extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_page);

        t=findViewById(R.id.UserTV);
        Intent in=getIntent();
        String s=in.getStringExtra("user");
        t.setText(s);
//        String p=in.getStringExtra("pass");
//        Toast.makeText(this, p, Toast.LENGTH_SHORT).show();
    }
}