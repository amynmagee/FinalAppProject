package com.example.finalapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class JuniorsFMidFormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juniors_f_mid_formal);
    }
    public void goWeb(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://stores.express.com/us/pa/king-of-prussia/160-n-gulph-road?CID=Yext"));
        startActivity(i);
    }

    public void goMap(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.087839, -75.391848"));
        startActivity(i);
    }

    public void startOver(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
