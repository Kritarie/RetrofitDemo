package com.example.sean.retrofitdemo;

/**
 * Created by Matthew on 4/15/2015.
 */
public class User {

    long Id;
    long FacebookId;
    long JoinDate;
    String City;
    String State;
    String Country;
    String FullName;
    int postsDiscovered;
    int postsCreated;

    public User() {
    }

    public User(long id, long facebookId, long joinDate, String city, String state, String country, String fullName, int postsDiscovered, int postsCreated) {
        Id = id;
        FacebookId = facebookId;
        JoinDate = joinDate;
        City = city;
        State = state;
        Country = country;
        FullName = fullName;
        this.postsDiscovered = postsDiscovered;
        this.postsCreated = postsCreated;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getFacebookId() {
        return FacebookId;
    }

    public void setFacebookId(long facebookId) {
        FacebookId = facebookId;
    }

    public long getJoinDate() {
        return JoinDate;
    }

    public void setJoinDate(long joinDate) {
        JoinDate = joinDate;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getPostsDiscovered() {
        return postsDiscovered;
    }

    public void setPostsDiscovered(int postsDiscovered) {
        this.postsDiscovered = postsDiscovered;
    }

    public int getPostsCreated() {
        return postsCreated;
    }

    public void setPostsCreated(int postsCreated) {
        this.postsCreated = postsCreated;
    }
}
