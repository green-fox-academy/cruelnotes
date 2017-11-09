package com.spring.todo.repositories;

import com.spring.todo.models.Entry;
import org.springframework.data.repository.CrudRepository;

public interface  EntryRepo extends CrudRepository<Entry, Long> {
}
