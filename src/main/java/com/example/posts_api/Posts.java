package com.example.posts_api;

public class Posts {
    private String title;
    private String description;
    String date = DateClass.setDate();
    long millis = System.currentTimeMillis();
    String id = ID.createID();

    public Posts(String title, String description, String date, String id, long millis){
        this.title = title;
        this.description = description;
        this.date = date;
        this.millis = millis;
        this.id = id;
    }

    public Posts(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getMillis() {
        return millis;
    }

    public void setMillis(long millis) {
        this.millis = millis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
