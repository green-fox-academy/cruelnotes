package com.greenfox.cruelnotes.todo;

import com.greenfox.cruelnotes.todo.models.Todo;
import com.greenfox.cruelnotes.todo.repositories.AssigneeRepo;
import com.greenfox.cruelnotes.todo.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	TodoRepo todoRepo;

	@Autowired
    AssigneeRepo assigneeRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
