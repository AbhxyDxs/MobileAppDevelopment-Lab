package com.example.tablelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton LoginButton;
    EditText UName,Pwd;
    /* Hard Coded Login Credentials*/
    String UN = "admin",PASS = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginButton = findViewById(R.id.loginB);
        UName = findViewById(R.id.uname);
        Pwd = findViewById(R.id.pword);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UN2 = UName.getText().toString();
                String PASS2 = Pwd.getText().toString();

                if(UN2.equals(UN) && PASS2.equals(PASS)){
                    Intent i = new Intent(getApplicationContext(),LoggedPage.class);
                    startActivity(i);

                    UName.setText("");
                    Pwd.setText("");
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}