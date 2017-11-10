package com.spring.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("pageTitle","My Custom Page Title");
        model.addAttribute("postContent","Post content with things and stuff.");
        return "index";
    }

    @RequestMapping("/index2")
    public String index2(Model model){
        model.addAttribute("pageTitle","Yet an other Custom Page Title");
        model.addAttribute("postContent", getPostContent());
        return "index";
    }

    private String getPostContent() {
        String body = "This body is from the getPostContent method.";
        return body;
    }
}












//pageTitle
//post.body