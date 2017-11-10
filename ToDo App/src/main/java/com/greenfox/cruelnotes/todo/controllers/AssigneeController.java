package com.greenfox.cruelnotes.todo.controllers;

import com.greenfox.cruelnotes.todo.models.Assignee;
import com.greenfox.cruelnotes.todo.repositories.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/todo/assignee")
public class AssigneeController {

    @Autowired
    AssigneeRepo assigneeRepo;

    @GetMapping(value={"/", ""})
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeRepo.findAll());
        return "assignees";
    }

    @RequestMapping(value="/add")
    public String addAssignee(Model model) {
        model.addAttribute("assignee", new Assignee());
        return "create";
    }

    @PostMapping(value="/add")
    public String saveAssignee(@ModelAttribute Assignee assignee) {
        assigneeRepo.save(assignee);
        return "redirect:/todo/assignee";
    }

    @GetMapping(value="/{id}/delete")
    public String deleteAssignee(@PathVariable long id) {
        assigneeRepo.delete(id);
        return "redirect:/todo/assignee";
    }

    @GetMapping(value="/{id}/edit")
    public String editAssignee(@PathVariable long id, Model model) {
        model.addAttribute("editAssignee", assigneeRepo.findOne(id));
        return "edit";
    }

    @PostMapping(value="/{id}/edit")
    public String editAssignee(@ModelAttribute Assignee assignee) {
        assigneeRepo.save(assignee);
        return "redirect:/todo/assignee";
    }
}
