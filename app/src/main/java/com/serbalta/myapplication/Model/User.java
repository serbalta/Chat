package com.serbalta.myapplication.Model;

public class User {

    private  String username,  imageURL, id;


    public User (String username, String id, String imageURL) {
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;

    }

    public User(){

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
