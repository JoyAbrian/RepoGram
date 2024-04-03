package com.example.repogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryActivity extends AppCompatActivity {
    public static final String EXTRA_ACCOUNT = "OKE";

    String[] times = {
            "20 menit",
            "39 menit",
            "5 hari",
            "3 hari",
            "1 hari",
            "4 jam",
            "6 jam",
            "17 jam"
    };

    ImageView storyPicture;
    CircleImageView profilePicture;
    TextView profileUsername;
    TextView storyTime;

    Account account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Random random = new Random();

        storyPicture = findViewById(R.id.storyPicture);
        profilePicture = findViewById(R.id.profilePicture);
        profileUsername = findViewById(R.id.profileUsername);
        storyTime = findViewById(R.id.storyTime);

        account = getIntent().getParcelableExtra(EXTRA_ACCOUNT);
        storyPicture.setImageResource(account.getStory());
        profilePicture.setImageResource(account.getProfilePicture());
        profileUsername.setText(account.getUsername());
        storyTime.setText(times[random.nextInt(times.length)]);

        profileUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoryActivity.this, ProfileActivity.class);
                intent.putExtra(ProfileActivity.EXTRA_ACCOUNT, account);
                startActivity(intent);
            }
        });
    }
}