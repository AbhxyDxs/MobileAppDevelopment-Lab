package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView BikeList;
    String[] Bikes = {"XPulse","GS310","StreetFighter","Meteor 350","Passion Plus","Star City","Bullet 350","MT15","Ninja","Activa","Pulsar","Vikrant"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BikeList = findViewById(R.id.bikes);

        ArrayAdapter<String> a;
        a = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,Bikes);
        BikeList.setAdapter(a);

    }
}