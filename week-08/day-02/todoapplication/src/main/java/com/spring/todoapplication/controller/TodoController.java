package com.spring.todoapplication.controller;

import com.spring.todoapplication.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    @Autowired
    TodoRepo todoRepo;

    @RequestMapping({"/","list"})
    public String list(Model model){
        model.addAttribute("todos", todoRepo.findAll());
    return "todo";
    }

    @RequestMapping("/todo")
    public String isDone (Model model, @RequestParam("isActive") boolean done) {
        model.addAttribute("todos", todoRepo.findAll());
        model.addAttribute("done", done);
    return "tododone";
    }
}
