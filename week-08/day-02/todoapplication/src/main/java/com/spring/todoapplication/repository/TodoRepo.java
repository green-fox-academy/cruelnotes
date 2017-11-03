package com.spring.todoapplication.repository;

import com.spring.todoapplication.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {

}

