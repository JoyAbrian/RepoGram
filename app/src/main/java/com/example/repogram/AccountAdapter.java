package com.example.repogram;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {
    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final CircleImageView profilePicture;
        private final TextView profileUsername;
        private final ImageView postImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profilePicture = itemView.findViewById(R.id.profilePicture);
            profileUsername = itemView.findViewById(R.id.profileUsername);
            postImage = itemView.findViewById(R.id.postImage);
        }

        public void setData(Account account) {
            profilePicture.setImageResource(account.getProfilePicture());
            profileUsername.setText(account.getUsername());
            postImage.setImageResource(account.getPost1());
        }
    }
}
