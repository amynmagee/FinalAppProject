package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class JuniorsFMidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juniors_f_mid);
    }
    public void clothesCasual(View v){
        Intent i = new Intent(this, JuniorsFMidCasualActivity.class);
        startActivity(i);
    }
    public void clothesFormal(View v){
        Intent i = new Intent(this, JuniorsFMidFormalActivity.class);
        startActivity(i);
    }
    public void clothesAccessories(View v){
        Intent i = new Intent(this, JuniorsFMidAccessoriesActivity.class);
        startActivity(i);
    }
}