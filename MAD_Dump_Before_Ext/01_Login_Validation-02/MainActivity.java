package com.example.basic_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText usr, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.Login_B);
        usr=findViewById(R.id.UN_ET);
        pass=findViewById(R.id.PASS_ET);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u=usr.getText().toString();
                String p=pass.getText().toString();
                if(u.equals("admin")&&p.equals("123"))
                {
                    Intent i=new Intent(MainActivity.this, LoggedPage.class);
                    i.putExtra("user",u);
//                    i.putExtra("pass",p);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
