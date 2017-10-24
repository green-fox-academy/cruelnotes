package com.greenfox.springstart;

import org.springframework.web.bind.annotation.RequestMapping;

public class Greeting {

    long id;
    String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


}