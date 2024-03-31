package com.example.repogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView activeFooterItems;
    ImageView toggleHome;
    ImageView toggleSearch;
    ImageView toggleAdd;
    ImageView toggleReels;
    ImageView toggleProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activeFooterItems = findViewById(R.id.toggleHome);
        toggleHome = findViewById(R.id.toggleHome);
        toggleSearch = findViewById(R.id.toggleSearch);
        toggleAdd = findViewById(R.id.toggleAdd);
        toggleReels = findViewById(R.id.toggleReels);
        toggleProfile = findViewById(R.id.toggleProfile);

        activeFooterItems.setImageResource(R.drawable.footer_home_active);

        toggleHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        toggleSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}