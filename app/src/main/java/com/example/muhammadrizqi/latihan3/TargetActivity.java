package com.example.muhammadrizqi.latihan3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

public class TargetActivity extends AppCompatActivity {
    final  String extraRating ="com.example.muhammadrizqi.latihan3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        RatingBar ratingIntent = (RatingBar) findViewById(R.id.ratingBar2);

        Intent intentDiterima = getIntent();

        Integer ratingDiterima = intentDiterima.getIntExtra(extraRating, 0);

        ratingIntent.setRating(ratingDiterima);


    }

    public void buttonkembali (View V){
        Intent kembali = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(kembali);
    }
}
