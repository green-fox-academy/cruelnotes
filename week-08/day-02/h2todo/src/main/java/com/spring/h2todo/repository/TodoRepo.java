package com.spring.h2todo.repository;


import com.spring.h2todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {

}