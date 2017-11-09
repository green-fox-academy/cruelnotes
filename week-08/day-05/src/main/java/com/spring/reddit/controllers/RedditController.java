package com.spring.reddit.controllers;

import com.spring.reddit.models.Post;
import com.spring.reddit.repositories.PostRepo;
import com.spring.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/posts")
public class RedditController {

    @Autowired
    PostRepo postRepo;

    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public ModelAndView posts() {
        ModelAndView m = new ModelAndView();
        m.setViewName("posts");
        m.addObject("score", postRepo.findAll());
        m.addObject("content", postRepo.findAll());
        return m;
    }

    @GetMapping({"","/","list"})
    public String list(Model model){
        model.addAttribute("posts", postRepo.findAll());
        return "posts";
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public String addEntry(@RequestParam int score, @RequestParam String content){
        postRepo.save(new Post(score, content));
        return "redirect:/posts";
    }

    @PostMapping("/addpost")
    public String addPost(@ModelAttribute Post post) {
        postRepo.save(post);
        return "redirect:/";
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

