package com.greenfox.cruelnotes;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class CruelnotesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CruelnotesApplication.class, args);

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String name: beanNames) {
			System.out.println(name);
		}
	}


}
van 
