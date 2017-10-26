package com.spring.colors;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PlaycolorsApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(RedColor.class);
        RedColor purpleColor = appContext.getBean(RedColor.class);
        purpleColor.printColor();
    }
}
