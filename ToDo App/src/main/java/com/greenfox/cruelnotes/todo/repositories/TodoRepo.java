package com.greenfox.cruelnotes.todo.repositories;

import com.greenfox.cruelnotes.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository <Todo, Long> {

}
