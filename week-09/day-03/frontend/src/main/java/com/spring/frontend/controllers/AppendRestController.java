package com.spring.frontend.controllers;

import com.spring.frontend.models.Append;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendRestController {

    @GetMapping(value = "/appenda/{append}")
    public Object append(@PathVariable String append){
        Append a = new Append(append);
        return a;
    }
}