package com.spring.todo;

import com.spring.todo.models.Entry;
import com.spring.todo.repositories.EntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	@Autowired
	EntryRepo entryRepo;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		entryRepo.save(new Entry("Adam", "First todo"));
//		entryRepo.save(new Entry("Adam", "Second todo"));
//		entryRepo.save(new Entry("Adam", "Third todo"));
	}
}