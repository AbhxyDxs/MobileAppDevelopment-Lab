package com.example.basictest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Activity LifeCycle : ", "onCreate Started");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity LifeCycle : ", "onStart Started");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity LifeCycle : ", "onPause Started");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity LifeCycle : ", "onResume Started");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity LifeCycle : ", "onRestart Started");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity LifeCycle : ", "onStop Started");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity LifeCycle : ", "onDestroy Started");
    }
}