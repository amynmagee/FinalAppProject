package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void pickFemale(View v) {
        Intent i = new Intent(this, FemaleActivity.class);
        startActivity(i);
    }

    public void pickMale(View v) {
        Intent i = new Intent(this, MaleActivity.class);
        startActivity(i);

    }
}