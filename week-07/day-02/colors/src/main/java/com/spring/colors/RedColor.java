package com.spring.colors;

import org.springframework.stereotype.Component;

@Component
public class RedColor implements myColor {

    @Override
    public void printColor() {
        System.out.println("This is so red");
    }
}
