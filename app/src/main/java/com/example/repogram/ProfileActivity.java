package com.example.repogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {
    public static final String EXTRA_ACCOUNT = "OKE";
    Account account;
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

//        String EXTRA_USERNAME = getIntent().getStringExtra("EXTRA_USERNAME");
//        Integer EXTRA_PICTURE = getIntent().hasExtra("EXTRA_PICTURE") ? getIntent().getIntExtra("EXTRA_PICTURE", 1) : null;
//        String EXTRA_POST = getIntent().getStringExtra("EXTRA_POST");
//        String EXTRA_FOLLOWERS = getIntent().getStringExtra("EXTRA_FOLLOWERS");
//        String EXTRA_FOLLOWING = getIntent().getStringExtra("EXTRA_FOLLOWING");
//        Integer EXTRA_POST1 = getIntent().hasExtra("EXTRA_POST1") ? getIntent().getIntExtra("EXTRA_POST1", 1) : null;
//        Integer EXTRA_POST2 = getIntent().hasExtra("EXTRA_POST2") ? getIntent().getIntExtra("EXTRA_POST2", 1) : null;
//        Integer EXTRA_POST3 = getIntent().hasExtra("EXTRA_POST3") ? getIntent().getIntExtra("EXTRA_POST3", 1) : null;
//        Integer EXTRA_POST4 = getIntent().hasExtra("EXTRA_POST4") ? getIntent().getIntExtra("EXTRA_POST4", 1) : null;
//        Integer EXTRA_POST5 = getIntent().hasExtra("EXTRA_POST5") ? getIntent().getIntExtra("EXTRA_POST5", 1) : null;
//        Integer EXTRA_POST6 = getIntent().hasExtra("EXTRA_POST6") ? getIntent().getIntExtra("EXTRA_POST6", 1) : null;
//        Integer EXTRA_POST7 = getIntent().hasExtra("EXTRA_POST7") ? getIntent().getIntExtra("EXTRA_POST7", 1) : null;
//        Integer EXTRA_POST8 = getIntent().hasExtra("EXTRA_POST8") ? getIntent().getIntExtra("EXTRA_POST8", 1) : null;
//        Integer EXTRA_POST9 = getIntent().hasExtra("EXTRA_POST9") ? getIntent().getIntExtra("EXTRA_POST9", 1) : null;

        account = getIntent().getParcelableExtra(EXTRA_ACCOUNT);
        username.setText(account.getUsername());
        profilePicture.setImageResource(account.getProfilePicture());
        posts.setText(account.getPosts());
        followers.setText(account.getFollowers());
        following.setText(account.getFollowing());
        if (account.getPost1() != null) {
            post1.setImageResource(account.getPost1());
            post1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ProfileActivity.this, PostActivity.class);
                    intent.putExtra(PostActivity.EXTRA_ACCOUNT, account);
                    startActivity(intent);
                }
            });
        }
        if (account.getPost2() != null) {
            post2.setImageResource(account.getPost2());
        }
        if (account.getPost3() != null) {
            post3.setImageResource(account.getPost3());
        }
        if (account.getPost4() != null) {
            post4.setImageResource(account.getPost4());
        }
        if (account.getPost5() != null) {
            post5.setImageResource(account.getPost5());
        }
        if (account.getPost6() != null) {
            post6.setImageResource(account.getPost6());
        }
        if (account.getPost7() != null) {
            post7.setImageResource(account.getPost7());
        }
        if (account.getPost8() != null) {
            post8.setImageResource(account.getPost8());
        }
        if (account.getPost9() != null) {
            post9.setImageResource(account.getPost9());
        }

        if (username.getText().equals("joyrantepasang")) {
            activeFooterItems.setImageResource(R.drawable.footer_profile_active);
        } else {
//            activeFooterItems.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(ProfileActivity.this, ProfileActivity.class);
//                    startActivity(intent);
//                }
//            });
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