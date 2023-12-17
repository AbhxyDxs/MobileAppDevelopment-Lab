package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner BikeList;
    String[] Bikes = {"XPulse","GS310","StreetFighter","Meteor 350","Passion Plus","Star City","Bullet 350","MT15","Ninja","Activa","Pulsar","Vikrant"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BikeList = findViewById(R.id.bikes);

        ArrayAdapter<String> a;
        a = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,Bikes);
        BikeList.setAdapter(a);

        BikeList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selected = Bikes[i];
                Toast.makeText(MainActivity.this, selected, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}