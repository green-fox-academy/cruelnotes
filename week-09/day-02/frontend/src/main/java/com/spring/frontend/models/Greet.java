package com.spring.frontend.models;

public class Greet {

    String welcome_message;

    public Greet() {
    }

    public Greet(String name, String title) {

        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }

    public String getWelcomeing() {
        return welcome_message;
    }

    public void setWelcomeing(String welcome_message) {
        this.welcome_message = welcome_message;
    }
}
