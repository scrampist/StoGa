package com.example.stoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);
        final String[] games = new String[]{
                "Assassins Creed: Unity", "Dying Light", "Dying Light 2", "FarCry 6", "Far Cry New Dawn",
                "Far Cry 5", "Far Cry 4", "Far Cry 3", "Far Cry 3 - Blood Dragon", "Prey",
                "The Witcher 3"
        };
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, games);

        list.setAdapter(adapter);


    }

    public void list(View view) {
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, AcuActivity.class);
                String AC = adapter.getItem(i);
                String DL = adapter.getItem(i+1);
                String DL2 = adapter.getItem(i+2);
                String FC6 = adapter.getItem(i+3);


            }



        });

    }
}