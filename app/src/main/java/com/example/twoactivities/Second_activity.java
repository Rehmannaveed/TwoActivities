package com.example.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {
TextView tvrecieve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        tvrecieve = findViewById(R.id.tvrecieve);
        getSupportActionBar().setTitle("Second_activity");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Intent intent = getIntent();
       String string =  intent.getStringExtra("Name");

        tvrecieve.setText( ""+string);
    }

}
