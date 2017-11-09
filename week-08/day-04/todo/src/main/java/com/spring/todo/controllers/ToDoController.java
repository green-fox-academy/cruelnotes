package com.spring.todo.controllers;

import com.spring.todo.models.Entry;
import com.spring.todo.repositories.EntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    EntryRepo entryRepo;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView m = new ModelAndView();
        m.setViewName("index");
        m.addObject("entries", entryRepo.findAll());
        m.addObject("size", entryRepo.count());
        return m;
    }

    @RequestMapping(value="/addedEntry", method = RequestMethod.POST)
    public String addEntry(@RequestParam String userName, @RequestParam String task){
        entryRepo.save(new Entry(userName, task));
        return "redirect:/todo/index";
    }

    @RequestMapping("/edit/{id}")
    public String editEntry(@PathVariable long id, Model model){
        model.addAttribute("editedEntry", entryRepo.findOne(id));
        return "edit";
    }

    @RequestMapping(value="/update", method=RequestMethod.POST)
    public String updateEntry(@ModelAttribute Entry entry){
        entryRepo.save(entry);
        return "redirect:/todo/index";
    }

}

