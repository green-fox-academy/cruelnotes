package com.greenfox.cruelnotes.todo.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Todo {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    long id;
    String content;
    boolean urgent;
    boolean done;

    public Todo() {
    }

    public Todo(String content) {
        this.content = content;
    }

    public Todo(String content, boolean done, boolean urgent) {
        this.content = content;
        this.done = done;
        this.urgent = urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean getUrgent() {
        return urgent;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean getDone() {
        return done;
    }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}