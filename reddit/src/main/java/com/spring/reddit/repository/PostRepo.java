package com.spring.reddit.repository;

import com.spring.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {
    List<Post> findAllByOrderByScoreDesc();
}
