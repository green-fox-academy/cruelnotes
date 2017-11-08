package com.spring.optional.models;

public class Groot {

    String recieved;
    String translated;

    public Groot(String recieved) {
        this.recieved = recieved;
    }

    public String getRecieved() {
        return recieved;
    }

    public void setRecieved(String recieved) {
        this.recieved = recieved;
    }

    public String getTranslated() {
        return "I am Groot!";
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }
}
