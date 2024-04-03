package com.example.repogram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView activeFooterItems;
    ImageView toggleSearch;
    ImageView toggleAdd;
    ImageView toggleReels;
    ImageView toggleProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activeFooterItems = findViewById(R.id.toggleHome);
        toggleSearch = findViewById(R.id.toggleSearch);
        toggleAdd = findViewById(R.id.toggleAdd);
        toggleReels = findViewById(R.id.toggleReels);
        toggleProfile = findViewById(R.id.toggleProfile);
        RecyclerView rvPosts = findViewById(R.id.rvPosts);
        RecyclerView rvStories = findViewById(R.id.rvStories);

        rvStories.setHasFixedSize(true);
        rvStories.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        StoriesAdapter storiesAdapter = new StoriesAdapter(DataSource.accounts);
        rvStories.setAdapter(storiesAdapter);

        rvPosts.setHasFixedSize(true);
        rvPosts.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        PostsAdapter postsAdapter = new PostsAdapter(DataSource.accounts);
        rvPosts.setAdapter(postsAdapter);

        activeFooterItems.setImageResource(R.drawable.footer_home_active);

        toggleSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
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
//                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}