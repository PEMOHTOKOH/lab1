package edu.hneu.mjt.andrii.dto;

public class Subscription {
    private String id;
    private User user;

    public Subscription(String id, User user) {
        this.id = id;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }
}