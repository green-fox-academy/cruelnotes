package com.spring.frontend.controllers;

import com.spring.frontend.models.Greet;
import com.spring.frontend.models.Double;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class RESTController {

    @GetMapping(value="/doubling")
    public Object aDouble(@RequestParam ("input") Integer input){
        if (input == null) {
            ErrorMessage msg = new ErrorMessage("Please provide an input!");
            return msg;
        } else {
            Double d = new Double(input);
            return d;
        }
    }

    @GetMapping(value = "/greeter")
    public Object greeter(@RequestParam (value = "name") String name, @RequestParam (value = "title")  String title){
        Greet g = new Greet(name, title);
        return g;
    }

}
