package com.spring.optional.models;

public class ErrorMessage {

    String error;

    public ErrorMessage(String error) {
        this.error = error;
    }

    public String getError() {
        return "I am Groot!";
    }

    public void setError(String error) {
        this.error = error;
    }
}
