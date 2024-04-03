package com.example.repogram;

public class Commentator {
    int userPicture;
    String userName;

    public Commentator(int userPicture, String userName) {
        this.userPicture = userPicture;
        this.userName = userName;
    }

    public int getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(int userPicture) {
        this.userPicture = userPicture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}