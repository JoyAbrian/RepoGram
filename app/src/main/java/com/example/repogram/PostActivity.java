package com.example.repogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostActivity extends AppCompatActivity {
    Commentator commentator1 = new Commentator(R.drawable.profile_anonym, "mayko_raditya");
    Commentator commentator2 = new Commentator(R.drawable.post_commentator2, "ccky_07");
    Commentator commentator3 = new Commentator(R.drawable.post_commentator3, "staenly_bombong");
    Commentator commentator4 = new Commentator(R.drawable.profile_anonym, "abd.rafiqanwar");
    Commentator commentator5 = new Commentator(R.drawable.post_commentator5, "ichsan.it");
    Commentator commentator6 = new Commentator(R.drawable.post_commentator6, "exyrzn");
    Commentator commentator7 = new Commentator(R.drawable.post_commentator7, "xii_mipa3");
    Commentator commentator8 = new Commentator(R.drawable.post_commentator8, "reskyallodatu");
    Commentator commentator9 = new Commentator(R.drawable.post_commentator9, "dccal_");
    Commentator commentator10 = new Commentator(R.drawable.post_commentator10, "labsisfo.uh");
    Commentator commentator11 = new Commentator(R.drawable.post_commentator11, "grntgina");
    Commentator commentator12 = new Commentator(R.drawable.post_commentator12, "putar_put");
    Commentator commentator13 = new Commentator(R.drawable.post_commentator13, "andisalwan2in");
    Commentator commentator14 = new Commentator(R.drawable.post_commentator14, "ruukaze");
    Commentator commentator15 = new Commentator(R.drawable.post_commentator15, "yippiayo");
    Commentator commentator16 = new Commentator(R.drawable.profile_anonym, "fqasanb");

    Commentator[] commentators = {
        commentator1,
        commentator2,
        commentator3,
        commentator4,
        commentator5,
        commentator6,
        commentator7,
        commentator8,
        commentator9,
        commentator10,
        commentator11,
        commentator12,
        commentator13,
        commentator14,
        commentator15,
        commentator16,
    };
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
            "Lu keren bang",
            "Tolol",
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

        LinearLayout parents = findViewById(R.id.parents);
        CircleImageView profilePicture = findViewById(R.id.profilePicture);
        TextView profileUsername = findViewById(R.id.profileUsername);
        ImageView postImage = findViewById(R.id.postImage);
        ImageView postHeart = findViewById(R.id.postHeart);
        TextView postLike = findViewById(R.id.postLike);
        TextView postUsername = findViewById(R.id.postUsername);
        TextView postCaption = findViewById(R.id.postCaption);
        TextView postComment = findViewById(R.id.postComment);
        TextView postDate = findViewById(R.id.postDate);


        // Comments Section
        Random random = new Random();
        Integer comment_size = random.nextInt(10) + 1;
        for (int i = 0; i < comment_size; i++ ) {
            View commentView = LayoutInflater.from(this).inflate(R.layout.template_comment, null);
            Commentator commentator = commentators[random.nextInt(commentators.length)];

            CircleImageView userPicture = commentView.findViewById(R.id.userPicture);
            TextView userName = commentView.findViewById(R.id.userName);
            TextView userTime = commentView.findViewById(R.id.userTime);
            TextView userComment = commentView.findViewById(R.id.userComment);
            TextView userLikes = commentView.findViewById(R.id.userLikes);

            userPicture.setImageResource(commentator.getUserPicture());
            userName.setText(commentator.getUserName());
            userTime.setText(times[random.nextInt(times.length)]);
            userComment.setText(comments[random.nextInt(comments.length)]);
            userLikes.setText(String.valueOf(random.nextInt(500)));

            parents.addView(commentView);
        }
    }
}