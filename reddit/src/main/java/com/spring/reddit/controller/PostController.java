package com.spring.reddit.controller;

import com.spring.reddit.model.Post;
import com.spring.reddit.repository.PostRepo;
import com.spring.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostRepo postRepo;

    @Autowired
    private PostService postService;

    @GetMapping({"","/","list"})
    public String list(Model model){
        model.addAttribute("posts", postRepo.findAllByOrderByScoreDesc());
        return "posts";
    }

    @PostMapping({"/","list"})
    public String save(@ModelAttribute Post post){
        postRepo.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("post", new Post() );
        return "add";
    }

    @GetMapping("/{id}/up")
    public String up(@PathVariable long id){
        postService.upVote(id);
        return "redirect:/posts";
    }

    @GetMapping("/{id}/down")
    public String down(@PathVariable long id){
        postService.downVote(id);
        return "redirect:/posts";
    }
}
