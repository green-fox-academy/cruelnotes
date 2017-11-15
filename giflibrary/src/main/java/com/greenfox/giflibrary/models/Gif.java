package com.greenfox.giflibrary.models;

import java.time.LocalDate;

public class Gif {

    private String name;
    private LocalDate dateUploaded;
    private String user;
    private boolean favourite;


    public Gif(String name, LocalDate dateUploaded, String user, boolean favourite) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.user = user;
        this.favourite = favourite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}
