package com.example.finalapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AdultFHighFormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adult_f_high_formal);
    }
    public void goWeb(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shop.nordstrom.com/store-details/nordstrom-the-plaza-at-king-of-prussia?utm_source=google&utm_medium=organic&utm_campaign=fls&utm_content=629&utm_channel=low_nd_seo_local&sp_source=google&sp_campaign=fls"));
        startActivity(i);
    }

    public void goMap(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.086570, -75.392132"));
        startActivity(i);
    }

    public void startOver(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
