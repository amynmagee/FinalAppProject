package com.example.finalapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class JuniorsFCheapCasualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juniors_f_cheap_casual);
    }
    public void goWeb(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://charlotterusse.com/"));
        startActivity(i);
    }

    public void goMap(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:39.915140, -75.352333"));
        startActivity(i);
    }

    public void startOver(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}