package com.example.repogram;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {
    private final ArrayList<Account> accounts;

    public PostsAdapter(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @NonNull
    @Override
    public PostsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostsAdapter.ViewHolder holder, int position) {
        String[] captions = {
                "Live, laugh, love. 💫",
                "Chasing dreams and sunsets. 🌅",
                "Adventure awaits! 🌿",
                "Good vibes only. ✌️",
                "Embracing the journey. 🌟",
                "Stay wild, moon child. 🌙",
                "Sun-kissed and happy. ☀️",
                "Not all who wander are lost. 🌍",
                "Radiate positivity. 🌈",
                "Collecting moments, not things. 🌼",
                "Happiness is homemade. 🏡",
                "Keepin' it real. 🙌",
                "Find joy in the ordinary. ✨",
                "Everyday magic. ✨",
                "Feelin' good, livin' better. 😎",
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

        Random random = new Random();
        Account account = accounts.get(position);
        holder.profilePicture.setImageResource(account.getProfilePicture());
        holder.profileUsername.setText(account.getUsername());
        holder.postImage.setImageResource(account.getPost1());
        holder.postLike.setText(String.valueOf(random.nextInt(300)));
        holder.postUsername.setText(account.getUsername());
        holder.postCaption.setText(captions[random.nextInt(captions.length)]);
        holder.postComment.setText(String.valueOf(random.nextInt(200)));
        holder.postDate.setText(times[random.nextInt(times.length)]);

        holder.profileUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), ProfileActivity.class);
                intent.putExtra(ProfileActivity.EXTRA_ACCOUNT, account);
                holder.itemView.getContext().startActivity(intent);
            }
        });

        holder.postComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), PostActivity.class);
                intent.putExtra(PostActivity.EXTRA_ACCOUNT, account);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return accounts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final CircleImageView profilePicture;
        private final TextView profileUsername;
        private final ImageView postImage;
        private final TextView postLike;
        private final TextView postUsername;
        private final TextView postCaption;
        private final TextView postComment;
        private final TextView postDate;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profilePicture = itemView.findViewById(R.id.profilePicture);
            profileUsername = itemView.findViewById(R.id.profileUsername);
            postImage = itemView.findViewById(R.id.postImage);
            postLike = itemView.findViewById(R.id.postLike);
            postUsername = itemView.findViewById(R.id.postUsername);
            postCaption = itemView.findViewById(R.id.postCaption);
            postComment = itemView.findViewById(R.id.postComment);
            postDate = itemView.findViewById(R.id.postDate);
        }
    }
}
