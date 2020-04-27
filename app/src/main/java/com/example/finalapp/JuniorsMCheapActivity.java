package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class JuniorsMCheapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juniors_m_cheap);
    }
    public void clothesCasual(View v){
        Intent i = new Intent(this, JuniorsMCheapCasualActivity.class);
        startActivity(i);
    }
    public void clothesFormal(View v){
        Intent i = new Intent(this, JuniorsMCheapFormalActivity.class);
        startActivity(i);
    }
    public void clothesAccessories(View v){
        Intent i = new Intent(this, JuniorsMCheapAccessoriesActivity.class);
        startActivity(i);
    }
}