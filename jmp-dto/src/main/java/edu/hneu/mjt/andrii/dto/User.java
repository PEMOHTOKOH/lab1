package edu.hneu.mjt.andrii.dto;

import java.time.LocalDate;

public class User {
    private String id;
    private String name;
    private LocalDate birthday;

    public User(String id, String name, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}