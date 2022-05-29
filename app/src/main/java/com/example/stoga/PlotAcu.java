package com.example.stoga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PlotAcu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plot_acu);
    }
}