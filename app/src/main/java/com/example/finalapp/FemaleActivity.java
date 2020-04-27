package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FemaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female);
    }
    public void ageKids(View v){
        Intent i = new Intent(this, KidsFActivity.class);
        startActivity(i);
    }
    public void ageJuniors (View v){
        Intent i = new Intent(this, JuniorsFActivity.class);
        startActivity(i);
    }
    public void ageAdults (View v){
        Intent i = new Intent(this, AdultFActivity.class);
        startActivity(i);
    }

}