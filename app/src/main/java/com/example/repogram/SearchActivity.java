package com.example.repogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity {
    ImageView activeFooterItems;
    ImageView toggleHome;
    ImageView toggleSearch;
    ImageView toggleAdd;
    ImageView toggleReels;
    ImageView toggleProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        activeFooterItems = findViewById(R.id.toggleSearch);
        toggleHome = findViewById(R.id.toggleHome);
        toggleSearch = findViewById(R.id.toggleSearch);
        toggleAdd = findViewById(R.id.toggleAdd);
        toggleReels = findViewById(R.id.toggleReels);
        toggleProfile = findViewById(R.id.toggleProfile);

        activeFooterItems.setImageResource(R.drawable.footer_search_active);

        toggleHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

//        toggleProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String EXTRA_USERNAME = "joyrantepasang";
//                Integer EXTRA_PICTURE = R.drawable.profile_anonym;
//                String EXTRA_POST = "5";
//                String EXTRA_FOLLOWERS = "537";
//                String EXTRA_FOLLOWING = "530";
//                Integer EXTRA_POST1 = R.drawable.profile_joyrantepasang_post1;
//                Integer EXTRA_POST2 = R.drawable.profile_joyrantepasang_post2;
//                Integer EXTRA_POST3 = R.drawable.profile_joyrantepasang_post3;
//                Integer EXTRA_POST4 = R.drawable.profile_joyrantepasang_post4;
//                Integer EXTRA_POST5 = R.drawable.profile_joyrantepasang_post5;
//
//                Intent intent = new Intent(SearchActivity.this, ProfileActivity.class);
//                intent.putExtra("EXTRA_USERNAME", EXTRA_USERNAME);
//                intent.putExtra("EXTRA_PICTURE", EXTRA_PICTURE);
//                intent.putExtra("EXTRA_POST", EXTRA_POST);
//                intent.putExtra("EXTRA_FOLLOWERS", EXTRA_FOLLOWERS);
//                intent.putExtra("EXTRA_FOLLOWING", EXTRA_FOLLOWING);
//                intent.putExtra("EXTRA_POST1", EXTRA_POST1);
//                intent.putExtra("EXTRA_POST2", EXTRA_POST2);
//                intent.putExtra("EXTRA_POST3", EXTRA_POST3);
//                intent.putExtra("EXTRA_POST4", EXTRA_POST4);
//                intent.putExtra("EXTRA_POST5", EXTRA_POST5);
//                startActivity(intent);
//            }
//        });
    }
}