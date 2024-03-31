package com.example.repogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity {
    ImageView activeFooterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        activeFooterItems = findViewById(R.id.toggleSearch);
        activeFooterItems.setImageResource(R.drawable.footer_search_active);
    }
}