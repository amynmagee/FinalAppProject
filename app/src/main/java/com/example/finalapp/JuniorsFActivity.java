package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class JuniorsFActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juniors_f);
    }
    public void juniorsCheap(View v){
        Intent i = new Intent(this, JuniorsFCheapActivity.class);
        startActivity(i);
    }
    public void juniorsMid (View v){
        Intent i = new Intent(this, JuniorsFMidActivity.class);
        startActivity(i);
    }
    public void juniorsHigh (View v){
        Intent i = new Intent(this, JuniorsFHighActivity.class);
        startActivity(i);
    }


}