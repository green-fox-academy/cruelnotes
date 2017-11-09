package com.greenfox.cruelnotes.todo.repositories;

import com.greenfox.cruelnotes.todo.models.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepo  extends CrudRepository<Assignee, Long> {
}
