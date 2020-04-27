package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male);
    }
    public void ageKids(View v){
        Intent i = new Intent(this, KidsMActivity.class);
        startActivity(i);
    }
    public void ageJuniors (View v){
        Intent i = new Intent(this, JuniorsMActivity.class);
        startActivity(i);
    }
    public void ageAdults (View v){
        Intent i = new Intent(this, AdultMActivity.class);
        startActivity(i);
    }


}
