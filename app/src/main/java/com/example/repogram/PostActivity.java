package com.example.repogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostActivity extends AppCompatActivity {
    CircleImageView profilePicture = findViewById(R.id.profilePicture);
    TextView profileUsername = findViewById(R.id.profileUsername);
    ImageView postImage = findViewById(R.id.postImage);
    ImageView postHeart = findViewById(R.id.postHeart);
    TextView postLike = findViewById(R.id.postLike);
    TextView postUsername = findViewById(R.id.postUsername);
    TextView postCaption = findViewById(R.id.postCaption);
    TextView postComment = findViewById(R.id.postComment);
    TextView postDate = findViewById(R.id.postDate);


    CircleImageView userPicture = findViewById(R.id.userPicture);
    TextView userName = findViewById(R.id.userName);
    TextView userTime = findViewById(R.id.userTime);
    TextView userComment = findViewById(R.id.userComment);

    Commentator commentator1 = new Commentator(R.drawable.profile_anonym, "mayko_raditya");
    Commentator commentator2 = new Commentator(R.drawable., "ccky_07");
    Commentator commentator3 = new Commentator(R.drawable., "staenly_bombong");
    Commentator commentator4 = new Commentator(R.drawable.profile_anonym, "abd.rafiqanwar");
    Commentator commentator5 = new Commentator(R.drawable., "ichsan.it");
    Commentator commentator6 = new Commentator(R.drawable., "exyrzn");
    Commentator commentator7 = new Commentator(R.drawable., "xii_mipa3");
    Commentator commentator8 = new Commentator(R.drawable.profile_anonym, "mayko_raditya");
    Commentator commentator9 = new Commentator(R.drawable.profile_anonym, "mayko_raditya");
    Commentator commentator10 = new Commentator(R.drawable.profile_anonym, "mayko_raditya");
    Commentator commentator11 = new Commentator(R.drawable.profile_anonym, "mayko_raditya");
    Commentator commentator12 = new Commentator(R.drawable.profile_anonym, "mayko_raditya");

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
    String[] comments = {
            "Love it! 😍",
            "Beautiful picture! 💖",
            "Wow, amazing shot! 📸",
            "Looking fabulous! 🔥",
            "Gorgeous! 💕",
            "Stunning! ✨",
            "Speechless! 😱",
            "Perfection! 👌",
            "Bagus banget! 😍",
            "Keren! 👍",
            "Keren parah! 🔥",
            "Mantap jiwa! 💯",
            "Wah, keren banget! 🌟",
            "Cakep bro! 😎",
            "Keren abis! 💥",
            "Keren banget, sukses terus! 👏",
            "Not funny, i didn't laugh",
            "Wadoehhhhhh",
            "Belum tau Mio Mirza",
            "Jafar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
    }
}