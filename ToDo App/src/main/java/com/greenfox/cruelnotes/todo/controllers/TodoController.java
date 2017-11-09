package com.greenfox.cruelnotes.todo.controllers;


import com.greenfox.cruelnotes.todo.models.Todo;
import com.greenfox.cruelnotes.todo.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/todo")
public class TodoController {

    @Autowired
    TodoRepo todoRepo;

    @RequestMapping(value = {"/", ""})
    public String list(Model model, @RequestParam(value = "isActive", required = false) boolean active) {
        List<Todo> todoList = new ArrayList<>();
        for (Todo todo : todoRepo.findAll()) {
            if (active) {
                if (!todo.getDone()) {
                    todoList.add(todo);
                }
            } else {
                todoList.add(todo);         //if there's no request param, add all the todos
            }
        }
        model.addAttribute("todos", todoList);
        return "todo";
    }

    @RequestMapping(value = "/add")
    public String add(Model model) {
        model.addAttribute("todo", new Todo());
        return "create";
    }

    @PostMapping(value = "/add")
    public String save(@ModelAttribute Todo todo) {
        todoRepo.save(todo);
        return "redirect:/todo";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable long id) {
        todoRepo.delete(id);
        return "redirect:/todo";
    }

    @GetMapping(value = "/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("editTodo", todoRepo.findOne(id));
        return "edit";
    }

    @PostMapping(value = "/{id}/edit")
    public String edit(@ModelAttribute Todo todo) {
        todoRepo.save(todo);
        return "redirect:/todo";
    }
}