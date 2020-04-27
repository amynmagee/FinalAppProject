package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class KidsMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_m);
    }
    public void kidsCheap(View v){
        Intent i = new Intent(this, KidsMCheapActivity.class);
        startActivity(i);
    }
    public void kidsMid (View v){
        Intent i = new Intent(this, KidsMMidActivity.class);
        startActivity(i);
    }
    public void kidsHigh (View v){
        Intent i = new Intent(this, KidsMHighActivity.class);
        startActivity(i);
    }


}