package com.spring.reddit.repositories;

import com.spring.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {
}
