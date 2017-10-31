package com.spring.h2todo;

import com.spring.h2todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoInterface extends CrudRepository<Todo, Long> {


}
