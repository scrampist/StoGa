package com.example.stoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
                "Assassins Creed: Unity", "Dying Light", "Dying Light 2","Elden Ring", "FarCry 6", "Far Cry New Dawn",
                "Far Cry 5", "Far Cry 4", "Far Cry 3", "Far Cry 3 - Blood Dragon", "Prey","Sifu",
                "The Witcher 3"
        };
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, games);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                String gameName = adapter.getItem(position);
                switch(gameName){
                    case "Assassins Creed: Unity":
                        Intent intent = new Intent(MainActivity.this, GameActivity.class);
                        startActivity(intent);
                        break;

                }

            }
        });



    }



    }
