package com.spring.h2todo;

import com.spring.h2todo.model.Todo;
import com.spring.h2todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2todoApplication implements CommandLineRunner {

    @Autowired
    TodoRepo todoRepo;

    public static void main(String[] args) {
        SpringApplication.run(H2todoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepo.save(new Todo("Stuff"));
        todoRepo.save(new Todo("More Stuff"));
    }
}