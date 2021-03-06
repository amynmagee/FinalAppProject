package com.example.finalapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class JuniorsFMidCasualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juniors_f_mid_casual);
    }
    public void goWeb(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www2.hm.com/en_us/index.html"));
        startActivity(i);
    }

    public void goMap(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.088890, -75.391848"));
        startActivity(i);
    }

    public void startOver(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}