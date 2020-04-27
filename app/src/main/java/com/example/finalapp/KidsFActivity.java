package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class KidsFActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_f);
    }
    public void kidsCheap(View v){
        Intent i = new Intent(this, KidsFCheapActivity.class);
        startActivity(i);
    }
    public void kidsMid (View v){
        Intent i = new Intent(this, KidsFMidActivity.class);
        startActivity(i);
    }
    public void kidsHigh (View v){
        Intent i = new Intent(this, KidsFHighActivity.class);
        startActivity(i);
    }


}