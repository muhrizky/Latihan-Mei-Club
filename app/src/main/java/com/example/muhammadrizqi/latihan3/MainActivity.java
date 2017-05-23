package com.example.muhammadrizqi.latihan3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
final  String extraRating ="com.example.muhammadrizqi.latihan3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input =(EditText) findViewById(R.id.editText);
        final Button kirim = (Button) findViewById(R.id.btn_kirim);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer nilaiRating =(Integer) Integer.parseInt(input.getText().toString());

                Intent kirim_inten = new Intent(getApplicationContext(), TargetActivity.class);

                kirim_inten.putExtra(extraRating, nilaiRating);

                startActivity(kirim_inten);

            }
        });
    }
}
