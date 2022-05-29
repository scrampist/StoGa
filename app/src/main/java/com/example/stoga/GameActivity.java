package com.example.stoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import android.widget.HorizontalScrollView;
import android.widget.ImageSwitcher;
import android.widget.ScrollView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    TextView annotation;
    Button read;

    ImageSwitcher gameScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        read = findViewById(R.id.read);
        gameScrollView=findViewById(R.id.images);
        annotation = findViewById(R.id.annotation);
        annotation.setMovementMethod(new ScrollingMovementMethod());



    }



    public void read(View view) {
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameActivity.this,PlotAcu.class);
                startActivity(intent);


            }
        });



    }


    public void ImageSwitcher(View view) {
    }
}