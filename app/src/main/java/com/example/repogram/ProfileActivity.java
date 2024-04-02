package com.example.repogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {
    ImageView activeFooterItems;
    ImageView toggleHome;
    ImageView toggleSearch;
    ImageView toggleAdd;
    ImageView toggleReels;

    TextView username;
    CircleImageView profilePicture;
    TextView posts;
    TextView followers;
    TextView following;
    ImageView post1;
    ImageView post2;
    ImageView post3;
    ImageView post4;
    ImageView post5;
    ImageView post6;
    ImageView post7;
    ImageView post8;
    ImageView post9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        activeFooterItems = findViewById(R.id.toggleProfile);
        toggleHome = findViewById(R.id.toggleHome);
        toggleSearch = findViewById(R.id.toggleSearch);
        toggleAdd = findViewById(R.id.toggleAdd);
        toggleReels = findViewById(R.id.toggleReels);

        username = findViewById(R.id.profileUsername);
        profilePicture = findViewById(R.id.profilePicture);
        posts = findViewById(R.id.profilePost);
        followers = findViewById(R.id.profileFollower);
        following = findViewById(R.id.profileFollowing);
        post1 = findViewById(R.id.post1);
        post2 = findViewById(R.id.post2);
        post3 = findViewById(R.id.post3);
        post4 = findViewById(R.id.post4);
        post5 = findViewById(R.id.post5);
        post6 = findViewById(R.id.post6);
        post7 = findViewById(R.id.post7);
        post8 = findViewById(R.id.post8);
        post9 = findViewById(R.id.post9);

        String EXTRA_USERNAME = getIntent().getStringExtra("EXTRA_USERNAME");
        Integer EXTRA_PICTURE = getIntent().hasExtra("EXTRA_PICTURE") ? getIntent().getIntExtra("EXTRA_PICTURE", 1) : null;
        String EXTRA_POST = getIntent().getStringExtra("EXTRA_POST");
        String EXTRA_FOLLOWERS = getIntent().getStringExtra("EXTRA_FOLLOWERS");
        String EXTRA_FOLLOWING = getIntent().getStringExtra("EXTRA_FOLLOWING");
        Integer EXTRA_POST1 = getIntent().hasExtra("EXTRA_POST1") ? getIntent().getIntExtra("EXTRA_POST1", 1) : null;
        Integer EXTRA_POST2 = getIntent().hasExtra("EXTRA_POST2") ? getIntent().getIntExtra("EXTRA_POST2", 1) : null;
        Integer EXTRA_POST3 = getIntent().hasExtra("EXTRA_POST3") ? getIntent().getIntExtra("EXTRA_POST3", 1) : null;
        Integer EXTRA_POST4 = getIntent().hasExtra("EXTRA_POST4") ? getIntent().getIntExtra("EXTRA_POST4", 1) : null;
        Integer EXTRA_POST5 = getIntent().hasExtra("EXTRA_POST5") ? getIntent().getIntExtra("EXTRA_POST5", 1) : null;
        Integer EXTRA_POST6 = getIntent().hasExtra("EXTRA_POST6") ? getIntent().getIntExtra("EXTRA_POST6", 1) : null;
        Integer EXTRA_POST7 = getIntent().hasExtra("EXTRA_POST7") ? getIntent().getIntExtra("EXTRA_POST7", 1) : null;
        Integer EXTRA_POST8 = getIntent().hasExtra("EXTRA_POST8") ? getIntent().getIntExtra("EXTRA_POST8", 1) : null;
        Integer EXTRA_POST9 = getIntent().hasExtra("EXTRA_POST9") ? getIntent().getIntExtra("EXTRA_POST9", 1) : null;

        username.setText(EXTRA_USERNAME);
        profilePicture.setImageResource(EXTRA_PICTURE);
        posts.setText(EXTRA_POST);
        followers.setText(EXTRA_FOLLOWERS);
        following.setText(EXTRA_FOLLOWING);
        if (EXTRA_POST1 != null) {
            post1.setImageResource(EXTRA_POST1.intValue());
        }
        if (EXTRA_POST2 != null) {
            post2.setImageResource(EXTRA_POST2.intValue());
        }
        if (EXTRA_POST3 != null) {
            post3.setImageResource(EXTRA_POST3.intValue());
        }
        if (EXTRA_POST4 != null) {
            post4.setImageResource(EXTRA_POST4.intValue());
        }
        if (EXTRA_POST5 != null) {
            post5.setImageResource(EXTRA_POST5.intValue());
        }
        if (EXTRA_POST6 != null) {
            post6.setImageResource(EXTRA_POST6.intValue());
        }
        if (EXTRA_POST7 != null) {
            post7.setImageResource(EXTRA_POST7.intValue());
        }
        if (EXTRA_POST8 != null) {
            post8.setImageResource(EXTRA_POST8.intValue());
        }
        if (EXTRA_POST9 != null) {
            post9.setImageResource(EXTRA_POST9.intValue());
        }

        if (username.getText().equals("joyrantepasang")) {
            activeFooterItems.setImageResource(R.drawable.footer_profile_active);
        } else {
            activeFooterItems.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String EXTRA_USERNAME = "joyrantepasang";
                    Integer EXTRA_PICTURE = R.drawable.profile_anonym;
                    String EXTRA_POST = "5";
                    String EXTRA_FOLLOWERS = "537";
                    String EXTRA_FOLLOWING = "530";
                    Integer EXTRA_POST1 = R.drawable.profile_joyrantepasang_post1;
                    Integer EXTRA_POST2 = R.drawable.profile_joyrantepasang_post2;
                    Integer EXTRA_POST3 = R.drawable.profile_joyrantepasang_post3;
                    Integer EXTRA_POST4 = R.drawable.profile_joyrantepasang_post4;
                    Integer EXTRA_POST5 = R.drawable.profile_joyrantepasang_post5;

                    Intent intent = new Intent(ProfileActivity.this, ProfileActivity.class);
                    intent.putExtra("EXTRA_USERNAME", EXTRA_USERNAME);
                    intent.putExtra("EXTRA_PICTURE", EXTRA_PICTURE);
                    intent.putExtra("EXTRA_POST", EXTRA_POST);
                    intent.putExtra("EXTRA_FOLLOWERS", EXTRA_FOLLOWERS);
                    intent.putExtra("EXTRA_FOLLOWING", EXTRA_FOLLOWING);
                    intent.putExtra("EXTRA_POST1", EXTRA_POST1);
                    intent.putExtra("EXTRA_POST2", EXTRA_POST2);
                    intent.putExtra("EXTRA_POST3", EXTRA_POST3);
                    intent.putExtra("EXTRA_POST4", EXTRA_POST4);
                    intent.putExtra("EXTRA_POST5", EXTRA_POST5);
                    startActivity(intent);
                }
            });
        }

        toggleHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        toggleSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}