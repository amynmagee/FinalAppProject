package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AdultMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adult_m);
    }
    public void adultCheap(View v){
        Intent i = new Intent(this, AdultMCheapActivity.class);
        startActivity(i);
    }
    public void adultMid (View v){
        Intent i = new Intent(this, AdultMMidActivity.class);
        startActivity(i);
    }
    public void adultHigh (View v){
        Intent i = new Intent(this, AdultMHighActivity.class);
        startActivity(i);
    }


}