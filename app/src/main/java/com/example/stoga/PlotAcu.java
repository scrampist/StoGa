package com.example.stoga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class PlotAcu extends AppCompatActivity {
    TextView PlotAcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plot_acu);
        PlotAcu=findViewById(R.id.plotAcu);
        PlotAcu.setMovementMethod(new ScrollingMovementMethod());
    }
}