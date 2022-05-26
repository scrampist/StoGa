package com.example.stoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import android.widget.ImageSwitcher;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    TextView name;
    Button read;

    ImageSwitcher gameImageSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        read = findViewById(R.id.read);
        gameImageSwitcher=findViewById(R.id.images);
    }


    public void read(View view) {
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });



    }

    public void onSwitcherClick(View view) {
        gameImageSwitcher.showNext();
    }

}