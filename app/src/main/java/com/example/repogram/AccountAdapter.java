package com.example.repogram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {
    private final ArrayList<Account> accounts;

    public AccountAdapter(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account account = accounts.get(position);
        holder.setData(account);
    }

    @Override
    public int getItemCount() {
        return accounts.size();
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
