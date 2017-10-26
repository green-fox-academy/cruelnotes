package com.spring.hellobeanworld;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellobeanworldApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = appContext.getBean(HelloWorld.class);
		helloWorld.setMessage("hiThere");
		System.out.println(helloWorld.getMessage());
	}
}
