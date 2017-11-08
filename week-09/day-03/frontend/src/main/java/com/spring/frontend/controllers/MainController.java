package com.spring.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String Main() {
        return "index";
    }

    @RequestMapping("/")
    public ModelAndView posts() {
        ModelAndView m = new ModelAndView();
        m.setViewName("index");
        return m;
    }
}
