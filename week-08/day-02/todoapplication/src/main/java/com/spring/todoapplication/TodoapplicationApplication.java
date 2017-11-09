package com.spring.todoapplication;

import com.spring.todoapplication.model.Todo;
import com.spring.todoapplication.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoapplicationApplication implements CommandLineRunner {

	@Autowired
	TodoRepo todoRepo;

	public static void main(String[] args) {
		SpringApplication.run(TodoapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepo.save(new Todo("I have to learn Object Relational Mapping"));
	}
}
