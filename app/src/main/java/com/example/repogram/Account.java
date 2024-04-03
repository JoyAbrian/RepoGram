package com.example.repogram;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Account implements Parcelable {
    private String username, posts, followers, following;
    private Integer profilePicture;
    private Integer post1;
    private Integer post2;
    private Integer post3;
    private Integer post4;
    private Integer post5;
    private Integer post6;
    private Integer post7;
    private Integer post8;
    private Integer post9;
    private Integer story;

    public Account(String username, String posts, String followers, String following, Integer profilePicture, Integer post1, Integer post2, Integer post3, Integer post4, Integer post5, Integer post6, Integer post7, Integer post8, Integer post9, Integer story) {
        this.username = username;
        this.posts = posts;
        this.followers = followers;
        this.following = following;
        this.profilePicture = profilePicture;
        this.post1 = post1;
        this.post2 = post2;
        this.post3 = post3;
        this.post4 = post4;
        this.post5 = post5;
        this.post6 = post6;
        this.post7 = post7;
        this.post8 = post8;
        this.post9 = post9;
        this.story = story;
    }

    protected Account(Parcel in) {
        username = in.readString();
        posts = in.readString();
        followers = in.readString();
        following = in.readString();
        if (in.readByte() == 0) {
            profilePicture = null;
        } else {
            profilePicture = in.readInt();
        }
        if (in.readByte() == 0) {
            post1 = null;
        } else {
            post1 = in.readInt();
        }
        if (in.readByte() == 0) {
            post2 = null;
        } else {
            post2 = in.readInt();
        }
        if (in.readByte() == 0) {
            post3 = null;
        } else {
            post3 = in.readInt();
        }
        if (in.readByte() == 0) {
            post4 = null;
        } else {
            post4 = in.readInt();
        }
        if (in.readByte() == 0) {
            post5 = null;
        } else {
            post5 = in.readInt();
        }
        if (in.readByte() == 0) {
            post6 = null;
        } else {
            post6 = in.readInt();
        }
        if (in.readByte() == 0) {
            post7 = null;
        } else {
            post7 = in.readInt();
        }
        if (in.readByte() == 0) {
            post8 = null;
        } else {
            post8 = in.readInt();
        }
        if (in.readByte() == 0) {
            post9 = null;
        } else {
            post9 = in.readInt();
        }
        if (in.readByte() == 0) {
            story = null;
        } else {
            story = in.readInt();
        }
    }

    public static final Creator<Account> CREATOR = new Creator<Account>() {
        @Override
        public Account createFromParcel(Parcel in) {
            return new Account(in);
        }

        @Override
        public Account[] newArray(int size) {
            return new Account[size];
        }
    };

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public Integer getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Integer profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Integer getPost1() {
        return post1;
    }

    public void setPost1(Integer post1) {
        this.post1 = post1;
    }

    public Integer getPost2() {
        return post2;
    }

    public void setPost2(Integer post2) {
        this.post2 = post2;
    }

    public Integer getPost3() {
        return post3;
    }

    public void setPost3(Integer post3) {
        this.post3 = post3;
    }

    public Integer getPost4() {
        return post4;
    }

    public void setPost4(Integer post4) {
        this.post4 = post4;
    }

    public Integer getPost5() {
        return post5;
    }

    public void setPost5(Integer post5) {
        this.post5 = post5;
    }

    public Integer getPost6() {
        return post6;
    }

    public void setPost6(Integer post6) {
        this.post6 = post6;
    }

    public Integer getPost7() {
        return post7;
    }

    public void setPost7(Integer post7) {
        this.post7 = post7;
    }

    public Integer getPost8() {
        return post8;
    }

    public void setPost8(Integer post8) {
        this.post8 = post8;
    }

    public Integer getPost9() {
        return post9;
    }

    public void setPost9(Integer post9) {
        this.post9 = post9;
    }

    public Integer getStory() {
        return story;
    }

    public void setStory(Integer story) {
        this.story = story;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(posts);
        dest.writeString(followers);
        dest.writeString(following);
        if (profilePicture == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(profilePicture);
        }
        if (post1 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(post1);
        }
        if (post2 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(post2);
        }
        if (post3 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(post3);
        }
        if (post4 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(post4);
        }
        if (post5 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(post5);
        }
        if (post6 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(post6);
        }
        if (post7 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(post7);
        }
        if (post8 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(post8);
        }
        if (post9 == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(post9);
        }
        if (story == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(story);
        }
    }
}
