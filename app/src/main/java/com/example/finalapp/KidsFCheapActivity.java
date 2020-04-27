package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class KidsFCheapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_f_cheap);
    }
    public void clothesCasual(View v){
        Intent i = new Intent(this, KidsFCheapCasualActivity.class);
        startActivity(i);
    }
    public void clothesFormal(View v){
        Intent i = new Intent(this, KidsFCheapFormalActivity.class);
        startActivity(i);
    }
    public void clothesAccessories(View v){
        Intent i = new Intent(this, KidsFCheapAccessoriesActivity.class);
        startActivity(i);
    }
}
