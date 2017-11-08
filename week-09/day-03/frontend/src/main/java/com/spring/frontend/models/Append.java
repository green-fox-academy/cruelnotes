package com.spring.frontend.models;

public class Append {

    public  String append;

    public Append(String append) {
        this.append = append + "a";
    }

    public String getAppend() {
        return append;
    }

    public void setAppend(String append) {
        this.append = append;
    }
}
